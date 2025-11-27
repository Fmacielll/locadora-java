public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    // comportamento padrão (vai ser refinado depois no Commit 15)
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
