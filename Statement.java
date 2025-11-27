public abstract class Statement {
    // Método template que será usado pelas subclasses
    public String value(Customer aCustomer) {
        String result = headerString(aCustomer);
        result += rentalString(aCustomer);
        result += footerString(aCustomer);
        return result;
    }

    protected abstract String headerString(Customer aCustomer);
    protected abstract String rentalString(Customer aCustomer);
    protected abstract String footerString(Customer aCustomer);
}
