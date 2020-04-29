//package com.agmednet.rwd;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.UnsupportedEncodingException;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.sql.Connection;
//import java.util.ArrayList;
//
//import javax.net.ssl.HttpsURLConnection;
//
//import org.apache.http.HttpResponse;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.testng.annotations.Test;
//
//public class UpdateRUNID {
//	ArrayList<Integer> alRunID = new ArrayList<Integer>();
//	public URL url;
//	public HttpsURLConnection conn;
//	public Connection objConnDB = null;
//	public String strToken_SSO = null;
//	public HttpResponse response;
//
//	@Test
//	public void f() throws ClientProtocolException, IOException {
//		String getRunID_URL = "https://chaturvedi.qtestnet.com/api/v3/projects/83055/test-suites/2316062/test-runs";
//		String strcookie = "UserContextToken=ZTdhYjZmZDEtZTM1NC00M2JhLTliYTAtMzY2ZTcxYzIwMGRm";
//		getRunID_API(getRunID_URL, strcookie);
//		String updateRunID_URL = "https://chaturvedi.qtestnet.com/api/v3/projects/83055/test-runs/";
//		updtaeRunID_API(updateRunID_URL, strcookie, "2018-09-10", "2018-10-10", alRunID);
//	}
//
//	public void getRunID_API(String strURL, String strToken) throws ClientProtocolException, IOException {
//		String strResult_SSO = null;
//		int responseCode = 0;
//		StringBuffer result = new StringBuffer();
//		HttpClient client = new DefaultHttpClient();
//		HttpGet request = new HttpGet(strURL);
//		request.setHeader("Accept", "application/json");
//		request.setHeader("Cookie", strToken);
//		response = client.execute(request);
//		responseCode = response.getStatusLine().getStatusCode();
//		try {
//			if (responseCode == 200) {
//				BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//				String line = "";
//				while ((line = reader.readLine()) != null) {
//					result.append(line);
//					strResult_SSO = result.toString();
//					System.out.println(strResult_SSO);
//				}
//			}
//
//		} catch (Exception ex) {
//		}
//
//		JSONArray jsonObject = new JSONArray(strResult_SSO.toString());
//		for (int i = 0; i < jsonObject.length(); i++) {
//			JSONObject obj = jsonObject.getJSONObject(i);
//			Object a = obj.get("id");
//			alRunID.add(Integer.parseInt(obj.get("id").toString()));
//		}
//	}
//
//	public void updtaeRunID_API(String strURL, String strToken, String startDate, String endDate,
//			ArrayList<Integer> arrRunID) throws UnsupportedEncodingException, IOException {
//
//		for (int c : arrRunID) {
//
//			String strBody = "{\"properties\": [{\"field_id\":6078932," + "\"field_name\":\"Planned Start Date\","
//					+ "\"field_value\":\"" + startDate + "T00:00:00+00:00\""
//					+ "},{\"field_id\": 6078934,\"field_name\":\"Planned End Date\",\"field_value\":\"" + endDate
//					+ "T00:00:00+00:00\"}]}";
//			URL obj = new URL(strURL + c);
//			HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
//			postConnection.setRequestMethod("PUT");
//			postConnection.setRequestProperty("Content-Type", "application/json");
//			postConnection.setRequestProperty("Cookie", strToken);
//			postConnection.setDoOutput(true);
//			postConnection.getOutputStream().write(strBody.getBytes("UTF-8"));
//			int responseCode = postConnection.getResponseCode();
//			if (responseCode == 200) {
//				System.out.println("Test Run is updated for this ID  :  " + c);
//				System.out.println("POST Response Message : " + postConnection.getResponseMessage());
//			} else {
//				System.out.println("Test Run is NOT updated for this ID  :  " + c);
//				System.out.println("POST Response Message : " + postConnection.getResponseMessage());
//			}
//		}
//
//	}
//
//}
