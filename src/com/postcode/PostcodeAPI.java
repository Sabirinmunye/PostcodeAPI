package com.postcode;

import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.*;


    public class PostcodeAPI {
        public void getPostcode(String postcode) throws Exception {
            String response = getRequest(postcode);
            parseResponse(response);
        }

        private String getRequest(String postcode) throws Exception {
            String url = "http://api.postcodes.io/postcodes/" + postcode;
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();


        }

        private void parseResponse(String response) {
            JSONObject responseJSON = new JSONObject(response);
            JSONObject results = responseJSON.getJSONObject("result");
            System.out.println("Results:");
            // Only parsing and printing results for lookup information I find important
            int Eastings = results.getInt("eastings");
            System.out.println("Eastings: " + Eastings);
            int Northings = results.getInt("northings");
            System.out.println("Northings: " + Northings);
            String country = results.getString("country");
            System.out.println("Country: " + country);
            String region = results.getString("region");
            System.out.println("Region: " + region);
            String adminDistrict = results.getString("admin_district");
            System.out.println("Admin District: " + adminDistrict);
            String parish = results.getString("parish");
            System.out.println("Parishqqq   : " + parish);
            String adminWard = results.getString("admin_ward");
            System.out.println("Admin Ward: " + adminWard);
        }
    }
