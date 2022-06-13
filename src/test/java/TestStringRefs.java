

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestStringRefs {
    @Test
    public void compareStrings(){
        String constantString1 = "Baeldung";
        String constantString2 = "Baeldung";

        assertThat(constantString1, sameInstance(constantString2));
    }
}
