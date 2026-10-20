package seleniumdemo2;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JSONReadDemo {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode data = mapper.readTree(new File("test-data/login-data.json"));

        //extract first set
        String username = data.get(0).get("username").asText();
        String password = data.get(0).get("password").asText();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

//to get all records
/*for (JsonNode user : data) {
 String username = user.get("username").asText();
String password = user.get("password").asText();
System.out.println("Username: " + username);
System.out.println("Password: " + password);
} */

