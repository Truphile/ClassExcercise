import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RegexTest {

    @Test
    public void testNumberIsValid() {
        String midePhoneNumber = "07013456789";
        assertTrue(RegexProcessor.isPhoneNumberValid(midePhoneNumber));
    }
}