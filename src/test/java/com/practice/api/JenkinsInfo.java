package com.practice.api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class JenkinsInfo {
	
	public static void main(String[] args) {
		
		
		RestAssured.baseURI="http://localhost:8080";
		
		String response=given().log().all().auth().preemptive().basic("arjunreddypc", "112b76238ad3e998b0df899f63c2eef002")
		
		.when().get("/api/json")
		
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response);
		
	}

}
