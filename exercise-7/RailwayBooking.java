import java.util.Scanner;
class AgeRestrictionException extends Exception {
 AgeRestrictionException(String message) {
 super(message);
 }
}
class NoSeatsAvailableException extends Exception {
 NoSeatsAvailableException(String message) {
 super(message);
 }
}
class InvalidInputException extends Exception {
80 | P a g e
 InvalidInputException(String message) {
 super(message);
 }
}
public class RailwayBooking {
 private static int availableSeats = 3; // Initial seat availability
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\n===== Railway Ticket Booking =====");
System.out.println("1. Book Ticket");
 System.out.println("2. Check Available Seats");
 System.out.println("3. Exit");
 System.out.print("Enter choice: ");
 choice = scanner.nextInt();
 try {
 switch (choice) {
 case 1:
 System.out.print("Enter Passenger Name: ");
 String name = scanner.next();
 System.out.print("Enter Passenger Age: ");
81 | P a g e
 int age = scanner.nextInt();
 bookTicket(name, age);
 break;
 case 2:
 System.out.println("Available Seats: " + availableSeats);
 break;
 case 3:
 System.out.println("Thank you for using our Railway Booking 
System!");
 break;
 default:
 throw new InvalidInputException("Invalid choice! Please enter a 
valid option.");
 }
 } catch (Exception e) {
 System.out.println("Error: " + e.getMessage());
 }
 } while (choice != 3);
 }
 public static void bookTicket(String name, int age) throws 
AgeRestrictionException, NoSeatsAvailableException {
 if (age < 5) throw new AgeRestrictionException("Children below 5 yearscannot travel alone.");
 if (availableSeats == 0) throw new NoSeatsAvailableException("No seats 
available!");
 availableSeats--;
82 | P a g e
 System.out.println(" Ticket Booked Successfully! Passenger: " + name + 
" | Age: " + age);
 System.out.println("Remaining Seats: " + availableSeats);
}
}