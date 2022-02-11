
import com.squareup.okhttp.*;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;


import java.io.*;
import java.net.URLEncoder;
import java.time.Instant;

public class MainApp {
    static OkHttpClient client = new OkHttpClient();

    static String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
            return response.body().string();

    }
    public static void main(String[] args) throws IOException {
        /*
        String url = "localhost:8081/api/v1/train/logs?direction=BACKWARD&limit=1000&query={app=\"sadedegel-classification-services\"}";
        //String encodedField= URLEncoder.encode("%7Bapp=\"sadedegel-classification-services\"%7B","UTF-8");
        String encodedURL = URLEncoder.encode(url,"UTF-8");
        HttpResponse<JsonNode> jsonResponse
                = Unirest.get(encodedURL)
                .header("accept", "application/json")
                //.queryString("direction", "BACKWARD")
                //.queryString("limit", "1000")
                //.queryString("query", encodedField)
                .asJson();
        System.out.println(jsonResponse.getStatusText());



         */
/*
        try{
            OkHttpClient httpClient = new OkHttpClient();
            String encodedField= URLEncoder.encode("{app=\"sadedegel-classification-services\"}","UTF-8");

            HttpUrl.Builder urlBuilder = HttpUrl.parse("http://localhost:8081/api/v1/train/logs").newBuilder();
            urlBuilder.addQueryParameter("direction", "BACKWARD");
            urlBuilder.addQueryParameter("limit", "1000");
            urlBuilder.addEncodedQueryParameter("query", encodedField);
            urlBuilder.addQueryParameter("start", "1621088395000000000");
            urlBuilder.addQueryParameter("end", "1621693196000000000");
            urlBuilder.addQueryParameter("step", "55");
            String url = urlBuilder.build().toString();

            Request request = new Request.Builder()
                    .url(url)
                    .build();
            Call call = httpClient.newCall(request);
            Response response = call.execute();
            System.out.println(response.body());
        }
         catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //run("http://localhost:8081/api/v1/train/logs");
 */

        try{
            String currentTimestamp = Instant.now().getEpochSecond()  + "000000000";
            String twelveHourAgo = (Instant.now().getEpochSecond() - 24 * 60 * 60 ) + "000000000";

            OkHttpClient httpClient = new OkHttpClient();
            String level = "NOTIFICATION";
            String id = "4732ba49-535a-456a-85ec-a87ff787856f";
            String query = "{app=\"sadedegel-classification-services\"}|= \""+level+"\" " + "|= \""+id+"\"";
            String encodedField= URLEncoder.encode(query,"UTF-8");

            HttpUrl.Builder urlBuilder = HttpUrl.parse("http://localhost:3100/loki/api/v1/query_range").newBuilder();
            urlBuilder.addQueryParameter("direction", "BACKWARD");
            urlBuilder.addQueryParameter("limit", "1000");
            urlBuilder.addEncodedQueryParameter("query", encodedField);
            urlBuilder.addQueryParameter("start", twelveHourAgo);
            urlBuilder.addQueryParameter("end", currentTimestamp);
            urlBuilder.addQueryParameter("step", "55");
            String url = urlBuilder.build().toString();

            Request request = new Request.Builder()
                    .url(url)
                    .build();
            Call call = httpClient.newCall(request);
            Response response = call.execute();
            System.out.println(response.body().string());
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
