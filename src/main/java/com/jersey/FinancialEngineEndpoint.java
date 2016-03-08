package com.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * web service implementation
 * @author MSA
 *
 */
@Path("/financialengines")
public class FinancialEngineEndpoint {
    @Produces({"application/json", "application/xml"})
    @GET
    public Message message() {
        return new Message("Hello world from a Jersey-powered endpoint!");
    }
}

/**
 * bean
 * @author msahal
 *
 */

class Message {
    private String message;

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }

    public Message() {
    }

    Message(String message) {
        this.message = message;
    }
}

