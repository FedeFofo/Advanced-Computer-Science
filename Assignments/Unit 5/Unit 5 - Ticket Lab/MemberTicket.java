import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class MemberTicket extends Ticket {
    // instance variables
    private static final double MEMBER_DISCOUNT = 0.25;
    private double totalPrice;

    // methods
    MemberTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
        totalPrice = getTotalPrice();
    }

    public double getTotalPrice() {
        double price = ((getBasePrice() + (getBasePrice() * getTax())) * ticketCount);
        return price - (price * MEMBER_DISCOUNT);
    }

    public void printMemberBenefits() {
        System.out.println("Includes access to special discounts and complimentary refreshments.");
    }

    // inherited methods
    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Member");
    }

    @Override
    public void printPrice() {
        // rounds totalPrice to 2 decimal places, will be 1 decimal place if last digit
        // is 0 (i.e. 7.50 -> 7.5)
        BigDecimal decimalFormatter = new BigDecimal(totalPrice).setScale(2, RoundingMode.HALF_UP);

        // prints the price
        System.out.println("Ticket Price: $" + decimalFormatter.doubleValue());
    }

    @Override
    public void printCancellationPolicy() {
        super.printCancellationPolicy();
        System.out.println("Can be canceled within 24 hours before the event. No cancellation fee applies.");
    }

    @Override
    public void printTicketDetails() {
        super.printTicketDetails();
        printTicketType();
        printPrice();
        printMemberBenefits();
        printCancellationPolicy();
    }
}
