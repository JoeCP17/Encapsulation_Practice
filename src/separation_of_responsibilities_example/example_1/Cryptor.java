package separation_of_responsibilities_example.example_1;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Base64;

public class Cryptor {

    private SecretKeySpec keySpec;
    private IvParameterSpec ivSpec;


    public String encrypt(String plain) throws InvalidAlgorithmParameterException, InvalidKeyException {

        Cipher cipher = Cipher.getInstance(DEFAULT_TRANSFORM);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);

        return new String(
                Base64.getEncoder().encode(cipher.doFinal(plain)));
    }

    public String decrypt(String encrypted) throws InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher2 = Cipher.getInstance(DEFAULT_TRANSFORM);
        cipher2.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        return new String(cipher2.doFinal(Base64.getDecoder().decode(encrypted)));
    }

}
