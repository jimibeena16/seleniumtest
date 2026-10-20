package seleniumdemo2;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class GetUserDemo {
	
	static {
		RestAssured.useRelaxedHTTPSValidation();
	}

    @Test
    public void getUser() {

        given()

        .when()
            .get("https://reqres.in/api/users/2")

        .then()
            .statusCode(200)
            .log().body()
            .body("data.id", equalTo(2))
            .body("data.first_name", equalTo("Janet"))
            .body("data.last_name", equalTo("Weaver"));


        System.out.println("GET Request Successful");
    }
    
    
    
}