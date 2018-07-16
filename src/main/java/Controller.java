import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;

public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/one", (req, res) -> {

            Name name = new Name();
            String result = name.randomName();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", result);
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {

            Name name = new Name();
            ArrayList<String> result = name.randomPair();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", result);
            return new ModelAndView(model, "twonames.vtl");
        }, velocityTemplateEngine);

        get("/three", (req, res) -> {

            Name name = new Name();
            ArrayList<String> result = name.randomThree();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", result);
            return new ModelAndView(model, "threenames.vtl");
        }, velocityTemplateEngine);

    }

}
