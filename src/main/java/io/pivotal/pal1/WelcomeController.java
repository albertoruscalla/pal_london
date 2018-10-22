package io.pivotal.pal1;

//import org.springframework.expression.ExpressionParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class WelcomeController {

    String message;


    public WelcomeController(@Value("${WELCOME_MESSAGE}") String message) {
        //@Value("message")
        //ExpressionParser parser = new SpelExpressionParser();
        //Expression exp = parser.parseExpression("'Hello World'");
        //message = (String) exp.getValue();

        this.message = message;

    }

    @GetMapping("/")
    public String sayHello() {
        return message;
    }
}