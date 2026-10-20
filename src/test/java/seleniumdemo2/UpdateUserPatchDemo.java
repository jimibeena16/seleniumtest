package seleniumdemo2;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateUserPatchDemo {
	
	static {
		RestAssured.useRelaxedHTTPSValidation();
	}

    @Test
    public void patchUser() {

        String requestBody = 
        		       "{\n" +
        		    		   " \"job\":\"QA\"\n" +
               				"}";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)

        .when()
            .patch("https://reqres.in/api/users/2")

        .then()
            .statusCode(200)
            .log().body();

        System.out.println("PATCH Request Successful");
    }
}