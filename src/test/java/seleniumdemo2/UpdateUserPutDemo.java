package seleniumdemo2;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateUserPutDemo {
	

	static {
		RestAssured.useRelaxedHTTPSValidation();
	}

    @Test
    public void updateUser() {

        String requestBody = "{\n" +
				" \"name\":\"John Mathew\",\n" +
				" \"job\":\"QA updated\"\n" +
				"}";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)

        .when()
            .put("https://reqres.in/api/users/2")

        .then()
            .statusCode(200)
            .log().body();

        System.out.println("PUT Request Successful");
    }
}