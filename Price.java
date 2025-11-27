public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    // Método extraído de Movie
    public int getFrequentRenterPoints(int daysRented) {
        // comportamento padrão
        return 1;
    }
}
