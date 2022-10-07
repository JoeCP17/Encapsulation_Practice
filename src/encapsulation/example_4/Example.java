package encapsulation.example_4;

public class Example {

    public void verifyEmail(String token) {

        // 개선전
//        Member mem = findByToken(token);
//
//        if(mem == null) throw new BadTokenException();
//
//        if (mem.getVerificationEmailStatus() == 2) { // 데이터를 가져와 조건 실행
//            throw new AlreadyVerifiedException();
//        } else {
//            mem.setVerificationEmailStatus(2); // 조건 실행 후, 데이터 변경 실행

            // 이럴 경우 전체 캡슐화 진행하면 좋은 결과를 얻을 수 있을 가능성이 높아진다.


        //개선 후

        Member mem = findByToken(token);

        if(mem == null) throw new BadTokenException();

        mem.verifyEmail();




    }
    }
}
