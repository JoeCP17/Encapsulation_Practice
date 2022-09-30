package example_2;

public class Rental {

    private Movie movie;
    private int dayRented;

    // 영화의 포인트 계산
    public int getFrequentRenterPoints() {
        // 개선 전
//        if(movie.getPriceCode() == Movie.NEW_RELEASE && daysRented > 1 ) return 2;
//        else return 1;

        // 개선 후 : 객체에게 해결하도록 값을 전달
        return movie.getFrequentRenterPoints(dayRented);
    }


}
