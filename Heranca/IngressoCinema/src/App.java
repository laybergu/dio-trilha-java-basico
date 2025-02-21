import domain.enums.Language;
import domain.models.FamilyTicket;
import domain.models.HalfPriceTicket;
import domain.models.Ticket;

public class App {
    public static void main(String[] args) throws Exception {
     
        Ticket ticket_1 = new Ticket(20, "Interstellar", Language.EN_US);
        Ticket ticket_2 = new FamilyTicket(10, "Shrek 3", Language.PT_BR, 4);
        Ticket ticket_3 = new HalfPriceTicket(25, "Star Wars", Language.EN_US);

        System.out.println(ticket_1.toString());
        System.out.println(ticket_2.toString());
        System.out.println(ticket_3.toString());
    }
}
