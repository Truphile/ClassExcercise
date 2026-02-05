import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

public class AccountTest {

    @Test
    public void testCompareTo(){
        Account johnsAccount = new Account("john", new BigDecimal("2000"));
        Account jamesAccount = new Account("james", new BigDecimal("3000"));

        int result = johnsAccount.compareTo(jamesAccount);
        assertTrue(result < 0);

    }
}
