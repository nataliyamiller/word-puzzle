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

    @Test
    public void ifProgramReplacesAllVowelsEWithTheDashSymbolIfUserEntersASentence_String() {
      App yourApp = new App();
        String test = "H-ll- -d-l--";
        assertEquals(test, yourApp.yourMethodName("Hello Odilia"));
    }

    @Test
    public void ifProgramAcceptsNumbersAndSpecialCharactersInASentence_String() {
      App yourApp = new App();
        String test = "H-ll- -d-l-- 235*5 y--rs";
        assertEquals(test, yourApp.yourMethodName("Hello Odilia 235*5 years"));
    }
}
