package Controller;

import Process.Operations;
import com.google.gson.Gson;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import Model.Numbers;

@Path("operation")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Calculator {
    
    private final Operations operation = new Operations();
    
    public Calculator() {
    }

    @POST
    @Path("sum")
    public String sum(String request) {
        Gson gson = new Gson();
        Numbers numbers = gson.fromJson(request, Numbers.class);
        return operation.sum(numbers);
    }

    @POST
    @Path("subs")
    public String subs(String request) {
        Gson gson = new Gson();
        Numbers numbers = gson.fromJson(request, Numbers.class);
        return operation.subtract(numbers);
    }
    
    @POST
    @Path("multiply")
    public String multiply(String request) {
        Gson gson = new Gson();
        Numbers numbers = gson.fromJson(request, Numbers.class);
        return operation.multiply(numbers);
    }

    @POST
    @Path("divide")
    public String divide(String request) {
        Gson gson = new Gson();
        Numbers numbers = gson.fromJson(request, Numbers.class);
        return operation.divide(numbers);
    }
}
