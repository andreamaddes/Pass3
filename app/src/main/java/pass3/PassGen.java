package pass3;

import com.cemiltokatli.passwordgenerate.Password;
import com.cemiltokatli.passwordgenerate.PasswordType;

public class PassGen {

    public static String generatePassword(){
        Password pass = Password.createPassword();
        pass.setType(PasswordType.SYMBOLS);
        pass.setMinLength(10);
        pass.setMaxLength(20);
        return pass.generate();
    }
    
    public static void main(String[] args){
    System.out.println(generatePassword());
}
}
