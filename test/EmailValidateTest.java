import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailValidateTest {

    @Test
    public void testEmailValidate() {
        String myEmailCheck = "angelonissil@gmail.com";
        assertTrue(EmailValiade.isValidateEmail(myEmailCheck));
    }


}
