import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void ifUserInputIsA_String() {
        String test = "Please enter a word or a sentence that contains letters only";
        assertEquals(test, App.yourMethodName("1*2"));
    }

    @Test
    public void ifVowelAIsReplacedByTheDashSymbol_String() {
        String test = "C-t";
        assertEquals(test, App.yourMethodName("Cat"));
    }
}
