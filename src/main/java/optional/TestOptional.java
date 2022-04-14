package optional;

import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        // create a Optional
        var res = Optional.ofNullable(null).orElseThrow(IllegalStateException::new);
        System.out.println("res: " + res );
    }
}
