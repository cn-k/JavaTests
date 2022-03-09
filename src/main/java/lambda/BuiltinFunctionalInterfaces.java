package lambda;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltinFunctionalInterfaces {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello";
        var param = supplier.get();

        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept(param);

        Comparator<Integer> ints = Comparator.comparingInt(i -> i);
        int res = ints.compare(20, 10);
        System.out.println("comparasion res: " + res);
    }

}
