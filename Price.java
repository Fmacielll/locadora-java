public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    // comportamento padrão
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
