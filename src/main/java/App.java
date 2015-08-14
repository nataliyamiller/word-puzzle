import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main (String[] args) {}


    public static String yourMethodName (String yourInput){
      // char[] vowels = {'a', 'e', 'i', 'o', 'u'};
      String finalString = "";

      if (yourInput instanceof String) {
          finalString = "Please enter a word or a sentence that contains letters only";
        }

        return finalString;
    }

}
