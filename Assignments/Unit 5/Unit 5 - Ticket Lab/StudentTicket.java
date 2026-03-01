import java.util.Date;

public class StudentTicket extends StandardTicket {
    // instance variables
    private static final double STUDENT_DISCOUNT = 0.50;

    // methods
    StudentTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    // inherited methods
    @Override
    public double getTotalPrice() {
        return super.getTotalPrice() * STUDENT_DISCOUNT;
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    }
}
