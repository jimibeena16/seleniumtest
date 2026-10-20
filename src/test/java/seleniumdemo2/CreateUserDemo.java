package seleniumdemo2;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateUserDemo {
	
	static {
		RestAssured.useRelaxedHTTPSValidation();
	}

    @Test
    public void createUser() {

        String requestBody =
        		       "{\n" +
        				" \"name\":\"John\",\n" +
        				" \"job\":\"QA\"\n" +
        				"}";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)

        .when()
            .post("https://reqres.in/api/users")

        .then()
            .statusCode(201)
            .log().body();

        System.out.println("POST Request Successful");
    }
}