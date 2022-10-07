package encapsulation.example_4;

public class Member {
    private int verificationEmailStatus;


    // 객체 내부에서 조건 실행 후 데이터 변경
    public void verifyEmail() {
        if(isEmailVerified())
            throw new AlreadyVerifiedException();
        else
            this.verificationEmailStatus = 2;
    }

    public boolean isEmailVerified() {
        return verificationEmailStatus == 2;
    }
}
