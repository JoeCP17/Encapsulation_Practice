package separation_of_responsibilities_example.example_1;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class CashClient {
    private SecretKeySpec keySpec;
    private IvParameterSpec ivSpec;

    private Cryptor cryptor;

    // 개선 전

//    private Res post(Req req) {
//        String reqBody = toJson(req);
//
//        Cipher cipher = Cipher.getInstance(DEFAULT_TRANSFORM);
//        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
//        String encReqBody = new String(Base64.getEncoder().encode(cipher.doFinal(reqBody)));
//
//        ResponseEntity<String> responseEntity = restTemplate.postForEntity(api, encReqBody, String.class);
//
//        String encRespBody = responseEntity.getBody();
//
//        Cipher cipher2 = Cipher.getInstance(DEFAULT_TRANSFORM);
//        cipher2.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
//        String respBody = new String(cipher.doFinal(Base64.getDecoder().decode(encRespBody)));
//
//        return jsonToObj(respBody);


    // 분리 가능 요소 : 암호화 기능 , 복호화 기능 분리  ( 계산기능 )

    // 암복호화 분리

    // Cryptor 클래스로 암복호화 기능 분리
    private Res post(Req req) {
        String reqBody = toJson(req);

        String encReqBody = cryptor.encrypt(reqBody);

        ResponseEntity<String> responseEntity = restTemplate.postForEntity(api, encReqBody, String.class);
        String encRespBody = responseEntity.getBody();

        String respBody = cryptor.decrypt(encRespBody);

        return jsonToObj(respBody);

    }
}
