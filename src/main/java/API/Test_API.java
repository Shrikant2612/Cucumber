package API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_API {
	
	@Test

	public static void Get_API_Response() {

		Response rep = RestAssured
		
				.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		int responsecode=rep.getStatusCode();
		System.out.println("final code is"+responsecode);
		
		/*String data=rep.asString();
		System.out.println("fnal data is"+data);
		
		String a=rep.contentType();
		System.out.println("content type is"+a);
		
		String b=rep.getSessionId();
		System.out.println("session id is"+b);
		
		String c=rep.prettyPrint();
		System.out.println(c);
		*/
		long d=rep.getTime();
		System.out.println(d);
		
		
		
	}

}


