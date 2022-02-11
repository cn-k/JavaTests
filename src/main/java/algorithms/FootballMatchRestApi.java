package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FootballMatchRestApi {
    public static void main(String[] args) {
        String football_competitions = "https://jsonmock.hackerrank.com/api/football_competitions?name=English%20Premier%20League&year=2014";
        getNumDraws(2011);

    }
    public static String queryRes(String urlStr){
        StringBuilder result = new StringBuilder();
        HttpURLConnection con = null;
        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                for (String line; (line = reader.readLine()) != null; ) {
                    result.append(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
    public static int parseJson(String jsonString){
        int res = jsonString.indexOf("[");
        String arrString = jsonString.substring(res);
        String [] arr = arrString.split("}");
        int count = 0;
        for(int i=0; i<arr.length-1;i++){
            int indexOfFirstTeam = arr[i].indexOf("team1goals");
            int indexOfSecondTeam = arr[i].indexOf("team2goals");
            String firstTeamScore = arr[i].substring(indexOfFirstTeam+13,indexOfFirstTeam+14);
            String secondTeamScore = arr[i].substring(indexOfSecondTeam+13,indexOfSecondTeam+14);
            if(firstTeamScore.equals(secondTeamScore)){
                count ++;
            }
        }
        return count;
    }
    public static int getNumDraws(int year) {
        int count = 0;
        for (int i=1; i<197;i++){
            String football_matches = "https://jsonmock.hackerrank.com/api/football_matches?year="+year+"&page="+i;
            String matches = queryRes(football_matches);
            int res = parseJson(matches);
            count +=res;
        }
        System.out.println(count);
        return count;

    }
}
