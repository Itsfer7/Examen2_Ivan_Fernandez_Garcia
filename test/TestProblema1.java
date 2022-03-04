import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema1 {

    @Test
    public void test_problema1() {

        Problema1 problema1 = new Problema1();

        String expected = problema1.imprimirProblema1(1);

        String actual = problema1.imprimirProblema1_actual(1);

        Assertions.assertEquals(expected, actual);
    }
}