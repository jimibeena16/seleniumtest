package seleniumdemo2;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteUserDemo {
	
	static {
		RestAssured.useRelaxedHTTPSValidation();
	}

    @Test
    public void deleteUser() {

        given()

        .when()
            .delete("https://reqres.in/api/users/2")

        .then()
            .statusCode(204);
           

        System.out.println("DELETE Request Successful");
    }
}