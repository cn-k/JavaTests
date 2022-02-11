package collections;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(18);
        lst.add(82);
        lst.add(43);
        lst.add(21);
        //lst.set(0, 1);
        //System.out.println(lst.get(0));
        //System.out.println(parseLastElem(lst.get(3))); 
        /*
        18 82 43 21
        82 18 43 21
        82 43 18 21
        82 43 21 18
        82 21 43 18
        */

        sortByLastNumber(lst).forEach(x -> System.out.println(x));
    }
    public static List<Integer> sortByLastNumber(List<Integer> list){
        int current ;
        int next ;
        int smallest = -1;
        for (int i=0 ; i<list.size(); i++){
        for (int  j= 0; j<list.size()-1; j++){
            current = list.get(j);
            next = list.get(j+1);
            if(parseLastElem(current) > parseLastElem((next))){
            list.set(j, next);
            list.set(j+1, current);
        }
    }
    }
    return list;
}
    public static int parseLastElem(int elem){
        String stringElem = String.valueOf(elem);
        char c = stringElem.charAt(stringElem.length()-1);
        return Character.getNumericValue(c); 
    }
}
 