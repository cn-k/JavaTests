package tutorials.java.programming.lamda.and.more.programming.types;

import java.util.stream.IntStream;

public class ComparasionBetweenImperativeAndDeclerative {
    public static void main(String[] args) {
        // imperative way of printing numbers
        for (int i = 0; i<5; i++){
            System.out.println(i);
        }
        // declerative way of printing numbers
        IntStream numbers = IntStream.of(1);
    }
}
