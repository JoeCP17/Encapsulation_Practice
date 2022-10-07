package example_1;// 캡슐화 연습 1


public class authenticate_1 {
    /*
    //변환 전
    Member mem = findOne(id);
        if(mem == null) return AuthResult.NO_MATCH;

        if(mem.getVerificationEmailStatus() != 2) return AuthResult.NO_EMAIL_VERIFIED;

        if(passwordEncoder.isPasswordValid(mem.getPassword(), pw, mem.getId())) return AuthResult.SUCCESS;

        return AuthResult.NO_MATCH;

     */

    // 변환 후
//    Member mem = findOne(id);
//
//    if(mem == null) return AuthResult.NO_MATCH;
//
//    if(!mem.isEmailVerified()) return AuthResult.NO_EMAIL_VERIFIED; // 검증 부분을 객체가 하도록 설정 최대한 객체에게 일을 시켜 비지니스로직의
//    // 변경을 최소화한다.
//
//    if(passwordEncoder.isPasswordValid(mem.getPassword(), pw, mem.getId())) return AuthResult.SUCCESS;
//
//    return AuthResult.NO_MATCH;
}
