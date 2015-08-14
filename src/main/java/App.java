import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main (String[] args) {}


    public static String yourMethodName (String userInput){
      // char[] vowels = {'a', 'e', 'i', 'o', 'u'};
      // String userInput = userStringInput.toLowerCase();
      String finalString = "";

      // if (userInput == null) {
      //
      //   finalString += "Please enter a word or a sentence that contains letters only";
      //
      //
      // } else {
        for (Integer i = 0; i < userInput.length(); i++) {
          if ((userInput.charAt(i) == 'a') || (userInput.charAt(i) == 'e') || (userInput.charAt(i) == 'i')|| (userInput.charAt(i) == 'o') || (userInput.charAt(i) == 'u')){
            finalString += '-';
          } else {
            finalString += userInput.charAt(i);
          }
        }


      return finalString;
    }
  }
