package pass3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PassGenTest{
    
    @Test
    void testMinxMaxLength(){
        
        String generatedpassword = PassGen.generatePassword();
        assertTrue(generatedpassword.length() >=10 &&
        generatedpassword.length() <= 20, "Password must have min 10 and max 20 characters.");

    }

    @Test
    void passwordComposition(){
        String generatedpassword = PassGen.generatePassword();
        assertTrue(generatedpassword.matches("^[^a-zA-Z0-9]*$"),"Generated password should only contain symbols.");

    }
}
