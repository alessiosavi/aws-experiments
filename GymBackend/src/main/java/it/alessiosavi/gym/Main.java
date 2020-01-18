package it.alessiosavi.gym;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import it.alessiosavi.gym.datastructure.Request;
import it.alessiosavi.gym.datastructure.Response;

public class Main {

//    public static void main(String[] args) {
//        System.err.println("Hello Backend");
//    }

    public static Response handler(Request request, Context context) {
        final String greetingString = String.format("Hello %s", request.toString());
        final LambdaLogger logger = context.getLogger();
        logger.log("From logger: " + greetingString);
        System.err.println("From serr: " + greetingString);
        return new Response(Response.status.OK, greetingString, null);
    }
}
