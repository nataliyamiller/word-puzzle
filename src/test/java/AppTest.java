import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

    // @Test
    // public void ifUserInputIsA_String() {
    //   App yourApp = new App();
    //     String test = "Please enter a word or a sentence that contains letters only";
    //     assertEquals(test, yourApp.yourMethodName("1*2"));
    // }

    @Test
    public void ifVowelAIsReplacedWithTheDashSymbol_String() {
      App yourApp = new App();
        String test = "c-t";
        assertEquals(test, yourApp.yourMethodName("cat"));
    }

    @Test
    public void ifProgramReplacesCapitalVowelEWithTheDashSymbol_String() {
      App yourApp = new App();
        String test = "-g-";
        assertEquals(test, yourApp.yourMethodName("Ego"));
    }
}
