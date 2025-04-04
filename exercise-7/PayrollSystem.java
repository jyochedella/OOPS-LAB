package employee;
public class Employee {
 private int empId;
 private String name;
 private double basicSalary;
 private double hra; 
 private double da; 
 private double tax; 
 
66 | P a g e
 public Employee(int empId, String name, double basicSalary, double hra, 
double da, double tax) {
 this.empId = empId;
 this.name = name;
 this.basicSalary = basicSalary;
 this.hra = hra;
 this.da = da;
 this.tax = tax;
 }
 public int getEmpId() { return empId; }
 public String getName() { return name; }
 public double getBasicSalary() { return basicSalary; }
 public double getHra() { return hra; }
 public double getDa() { return da; }
 public double getTax() { return tax; }
}
package employee;
public class SalaryCalculator {
 public static double calculateGrossSalary(Employee emp) {
 return emp.getBasicSalary() + emp.getHra() + emp.getDa();
}
 public static double calculateNetSalary(Employee emp) {
 return calculateGrossSalary(emp) - emp.getTax();
67 | P a g e
 }
}
package employee;
public class PayrollDisplay {
 public static void displayPayroll(Employee emp) {
 System.out.println("\n----------------------");
 System.out.println("EMPLOYEE PAYROLL DETAILS");
 System.out.println("----------------------");
 System.out.println("Employee ID : " + emp.getEmpId());
 System.out.println("Employee Name : " + emp.getName());
 System.out.println("Basic Salary : ₹" + emp.getBasicSalary())
System.out.println("HRA : ₹" + emp.getHra());
 System.out.println("DA : ₹" + emp.getDa());
 System.out.println("Gross Salary : ₹" + 
SalaryCalculator.calculateGrossSalary(emp));
 System.out.println("Tax Deduction : ₹" + emp.getTax());
 System.out.println("Net Salary : ₹" + 
SalaryCalculator.calculateNetSalary(emp));
 System.out.println("----------------------\n");
 }
}
public class PayrollSystem {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
System.out.print("Enter Employee ID: ");
 int empId = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 System.out.print("Enter Employee Name: ");
 String name = scanner.nextLine();
 System.out.print("Enter Basic Salary: ₹");
 double basicSalary = scanner.nextDouble();
 System.out.print("Enter HRA (House Rent Allowance): ₹");
 double hra = scanner.nextDouble();
 System.out.print("Enter DA (Dearness Allowance): ₹");
 double da = scanner.nextDouble();
 System.out.print("Enter Tax Deduction: ₹");
 double tax = scanner.nextDouble();
 Employee emp = new Employee(empId, name, basicSalary, hra, da, 
tax);
 PayrollDisplay.displayPayroll(emp);
scanner.close();
}
}