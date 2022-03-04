import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema4 {

    @Test
    public void test_problema4() {

        Problema4 problema4 = new Problema4();

        String expected = problema4.imprimirProblema4(1, 100);

        String actual = problema4.imprimirProblema4_actual(1, 100);

        Assertions.assertEquals(expected, actual);
    }
}