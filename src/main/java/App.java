import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Scanner;

public class App {
  public static void main (String[] args) {}


    public static String yourMethodName (String userInput){
      // char[] vowels = {'a', 'e', 'i', 'o', 'u'};
      // String userInput = userStringInput.toLowerCase();
      String finalString = "";
      // Scanner scan = new Scanner(System.in);
      // try {
      //   String s = scan.nextLine();
      //   int x = Integer.parseInt(s);
      // } catch (NumberFormatException ex){}


        for (Integer i = 0; i < userInput.length(); i++) {
          if ((userInput.charAt(i) == 'a') || (userInput.charAt(i) == 'e') || (userInput.charAt(i) == 'i')|| (userInput.charAt(i) == 'o') || (userInput.charAt(i) == 'u')){
            finalString += '-';
          } else if ((userInput.charAt(i) == 'A') || (userInput.charAt(i) == 'E') || (userInput.charAt(i) == 'I')|| (userInput.charAt(i) == 'O') || (userInput.charAt(i) == 'U')){
            finalString += '-';
          }
          else {
            finalString += userInput.charAt(i);
          }
        }


      return finalString;
    }

  }
