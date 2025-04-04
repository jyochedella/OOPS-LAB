class InsufficientFundsException extends Exception {
 InsufficientFundsException(String message) {
 super(message);
 }
}
public class ATM {
 private static double balance = 5000; // Initial balance
 public static void main(String[] args) {
 try {
 withdraw(6000); // Trying to withdraw more than the balance
 } catch (InsufficientFundsException e) {
 System.out.println("Transaction failed: " + e.getMessage());
74 | P a g e
 }
 }
 public static void withdraw(double amount) throws 
InsufficientFundsException {
 if (amount > balance) {
 throw new InsufficientFundsException("Insufficient balance! 
Available: $" + balance);
 }
 balance -= amount;
 System.out.println("Withdrawal successful! Remaining Balance: $" + 
balance);
 }
}
