import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main (String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    get ("/detector", (request,response) -> {
      Map<String, Object> model = new HashMap<String,Object>();
      model.put("template", "templates/detector.vtl");

      String userInput = request.queryParams("userinput");
      String yourMethodName = yourMethodName(userInput);

      model.put("userInput", userInput);
      model.put("yourMethodName", yourMethodName);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }


    public static String yourMethodName (String userInput){
      String finalString = "";
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
