class AgeRestrictionException extends Exception {
 AgeRestrictionException(String message) {
 super(message);
 }
}
public class TrainBooking {
 public static void main(String[] args) {
75 | P a g e
 try {
 bookTicket(3); // Booking ticket for a 3-year-old
 } catch (AgeRestrictionException e) {
 System.out.println("Booking failed: " + e.getMessage());
 }
 }
 public static void bookTicket(int age) throws AgeRestrictionException {
 if (age < 5) {
 throw new AgeRestrictionException("Children below 5 years cannot 
travel alone.");
 }
 System.out.println("Ticket booked successfully!");
 }
}
