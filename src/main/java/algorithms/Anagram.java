package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String [] dictionary = {"heater", "cold", "clod", "reheat", "docl"};
        String [] query = {"codl", "heater", "abcd"};
        //stringAnagram(dictionary, query).forEach(x -> System.out.println(x));

    }
    public static List<Integer> stringAnagram(String [] dictionary, String [] query) {
        // Write your code here
        List<Integer> res = new ArrayList<Integer>();
        for(String q : query){
            int count =0;
            for(String d : dictionary){
                char queryArray[] = q.toCharArray();
                char dictArray[] = d.toCharArray();
                Arrays.sort(queryArray);
                Arrays.sort(dictArray);
                String queryString = new String(queryArray);
                String dictString = new String(dictArray);
                if(queryString.equals(dictString)){
                    count ++;
                }
            }
            res.add(count);
        }
        return res;
    }

}
