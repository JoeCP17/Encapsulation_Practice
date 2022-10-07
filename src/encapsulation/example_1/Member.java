package example_1;

public class Member {

    private Integer id;
    private Integer verificationEmailStatus;
    private String password;


    public Boolean isEmailVerified() {
        return verificationEmailStatus == 2;
    }
}
