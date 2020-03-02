import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

/**
 * @author Tyler Kroposki
 * Class tests isFormatted method of the Telephone class.
 */
public class TelephoneTest {

    @DisplayName("Check a valid phone number string")
    @Test
    public void isFormattedTest1() {
        assertTrue(Telephone.isFormatted("5551234567"));
    }

    @DisplayName("Check a string that is completely invalid")
    @Test
    public void isFormattedTest2() {
        assertFalse(Telephone.isFormatted("#"));
    }

    @DisplayName("Check a string that contains no numbers, but the correct formatting")
    @Test
    public void isFormattedTest3() {
        assertTrue(Telephone.isFormatted("(MAS)TER-OBI1"));
    }

//end file
}
