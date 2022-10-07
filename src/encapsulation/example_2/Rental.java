package encapsulation.example_2;

import separation_of_responsibilities_example.example_2.Movie;

public class Rental {

    private Movie movie;
    private int daysRented;

    // 영화의 포인트 계산
    public int getFrequentRenterPoints() {

        return movie.getFrequendRenterPoints(daysRented);
    }


}
