import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema3 {

    @Test
    public void test_problema3() {

        Problema3 problema3 = new Problema3();

        String expected = problema3.imprimirProblema3(1, 100);

        String actual = problema3.imprimirProblema3_actual(1, 100);

        Assertions.assertEquals(expected, actual);
    }
}