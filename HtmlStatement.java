import java.util.Enumeration;

public class HtmlStatement extends Statement {
    @Override
    protected String headerString(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    @Override
    protected String rentalString(Customer aCustomer) {
        String result = "";
        Enumeration rentals = aCustomer.getRentals();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().getTitle() + ": " +
                      String.valueOf(each.getCharge()) + "<BR>\n";
        }
        return result;
    }

    @Override
    protected String footerString(Customer aCustomer) {
        String result = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                  String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                  "</EM> frequent renter points<P>";
        return result;
    }
}
