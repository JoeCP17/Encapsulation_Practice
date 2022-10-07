package separation_of_responsibilities_example.example_2;

public abstract class Movie {
    public static int NEW_RELEASE = 1;
    public static int REGULAR = 0;
    private int priceCode;

    public abstract int getFrequendRenterPoints(int daysRented);

    public class NewReleaseMovie extends Movie {
        @Override
        public int getFrequendRenterPoints(int daysRented) {
            return daysRented > 1 ? 2 :1;
        }
    }

    public class RegularMovie extends Movie {
        @Override
        public int getFrequendRenterPoints(int daysRented) {
            return 1;
        }
    }


}
