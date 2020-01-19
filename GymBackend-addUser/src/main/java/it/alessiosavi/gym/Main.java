package it.alessiosavi.gym;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.alessiosavi.gym.datastructure.Response;
import it.alessiosavi.gym.datastructure.User;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main implements RequestStreamHandler {
    private ObjectMapper objectMapper = new ObjectMapper();


//    public static void main(String[] args) {
//        System.err.println("Hello Backend");
//    }

//    public static Response handler(User request, Context context) {
//        final String greetingString = String.format("Hello %s", request.toString());
//        final LambdaLogger logger = context.getLogger();
//        logger.log("From logger: " + greetingString);
//
//        final Response resp = Util.validateRequest(request);
//        if (resp == null) {
//            return new Response(Response.status.OK, greetingString, null);
//        }
//
//        return resp;
//    }

    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        final User request = objectMapper.readValue(inputStream, User.class);
        // Validate request
        Response resp = Util.validateRequest(request);
        System.err.println("Input: " + String.format("%s", request.toString()));
        if (resp == null) {
            final DynamoDB dynamoDB = new DynamoDB(AmazonDynamoDBClientBuilder.standard().build());
            System.err.println("Adding new user ...");
            final PutItemOutcome outcome = dynamoDB.getTable("user_table").putItem(new Item()
                    .withPrimaryKey("mail", request.getMail(), "date", request.getTime().toString())
                    .withString("username", request.getUsername())
                    .withString("surname", request.getSurname())
                    .withString("name", request.getName())
                    .withString("registration_date", request.getRegisterDate().toString()));
            System.err.println("PutItem succeeded:\n" + outcome.getPutItemResult().toString());

            resp = new Response(Response.status.OK, outcome.getPutItemResult().toString(), null);
        }

        outputStream.write(resp.toString().getBytes());
    }
}
