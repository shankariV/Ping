package ping;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

class call2 extends sampleApi {
	public static void main(String[] args) {
		sampleApi s = new sampleApi();
		
		System.out.println(s.addNumbers(12, 340));
	}
}
