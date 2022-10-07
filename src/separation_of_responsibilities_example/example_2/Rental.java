package separation_of_responsibilities_example.example_2;

public class Rental {

    private Movie movie;
    private int dayRented;

    // 영화의 포인트 계산
    public int getFrequentRenterPoints() {

        // 추상 클래스로 넘겨 해당 값을 계산할 수 있도록 설정
        return movie.getFrequendRenterPoints(dayRented);
    }


}
