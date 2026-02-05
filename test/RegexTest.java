import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RegexTest {

    @Test
    public void testNumberIsValid() {
        String midePhoneNumber = "07013456789";
        assertTrue(RegexProcessor.isPhoneNumberValid(midePhoneNumber));
    }

    @Test
    public void testNewNumberIsValid() {
        String faridPhoneNumber = "08013666789";
        assertTrue(RegexProcessor.isPhoneNumberValid(faridPhoneNumber));
   }
}