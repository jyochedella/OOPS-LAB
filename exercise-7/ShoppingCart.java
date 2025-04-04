import java.util.Scanner;
class InvalidCouponException extends Exception {
 InvalidCouponException(String message) {
 super(message);
 }
}
76 | P a g e
class OutOfStockException extends Exception {
 OutOfStockException(String message) {
 super(message);
 }
}
public class ShoppingCart {
 private static double cartTotal = 0;
 private static final String validCoupon = "DISCOUNT20";
 private static boolean productInStock = true; // Simulating product 
availability
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\n===== Shopping Cart =====");
System.out.println("1. Add Item ($50)");
 System.out.println("2. Apply Coupon");
 System.out.println("3. Checkout");
 System.out.println("4. Exit");
 System.out.print("Enter choice: ");
 choice = scanner.nextInt();
try {
 switch (choice) {
 case 1:
 addItem();
 break;
 case 2:
 System.out.print("Enter coupon code: ");
 String coupon = scanner.next();
 applyCoupon(coupon);
 break;
 case 3:
 checkout();
 break;
 case 4:
 System.out.println("Thank you for shopping with us!");
 break;
 default:
 System.out.println("Invalid choice. Try again.");
 }
 } catch (Exception e) {
 System.out.println("Error: " + e.getMessage());
 }
 } while (choice != 4);
 }
 public static void addItem() throws OutOfStockException{
if (!productInStock) throw new OutOfStockException("Product is out of 
stock!");
 cartTotal += 50;
 System.out.println("Item added! Cart total: $" + cartTotal);
 }
 public static void applyCoupon(String coupon) throws 
InvalidCouponException {
 if (!coupon.equals(validCoupon)) throw new 
InvalidCouponException("Invalid coupon code: " + coupon);
 cartTotal *= 0.8;
 System.out.println("Coupon applied! New total: $" + cartTotal);
 }
 public static void checkout() {
 System.out.println("Order placed! Final amount: $" + cartTotal);
}
}