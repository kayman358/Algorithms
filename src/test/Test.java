/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Kolade Arowolo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kolade Arowolo
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.simple.JSONObject;

public class Test {

	// http://localhost:8080/RESTfulExample/json/product/post
	public static void main(String[] args) {

	  try {

		URL url = new URL("http://lx-dev-emea-emerge-ws-tc-01:8080/emerge-ocs-provision/v1/provision/payphone-services");
                url.getHost();
                  System.out.println("sssskkkkkkkkkkk" +url.getHost());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");
                JSONObject jo = new JSONObject();
                jo.put("country", "Nigeria");
                jo.put("value", 3);
                jo.put("description", "Prefix for nigeria");
                
                  JSONObject jop = new JSONObject();
                  jop.put("Prefix", jo);
                  System.out.println(jop);
                
                
                

		OutputStream os = conn.getOutputStream();
		os.write(jo.toJSONString().getBytes());
             //   System.out.println("ssss"+input.getBytes());
		os.flush();
                System.out.println("Response is "+conn.getResponseCode());

		if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {

		e.getMessage();

	  } catch (IOException e) {

		e.getMessage();

	 }

	}

}
