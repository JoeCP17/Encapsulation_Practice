package example_2;

public class Movie {
    public static int NEW_RELEASE = 1;
    public static int REGULAR = 0;
    private int priceCode;

    public int getFrequentRenterPoints(int daysRented) {
        if(priceCode == NEW_RELEASE && daysRented > 1) return 2;
        else return 1;
    }
}
