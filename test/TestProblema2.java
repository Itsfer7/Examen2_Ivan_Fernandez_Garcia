import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema2 {

    @Test
    public void test_problema2() {

        Problema2 problema2 = new Problema2();

        String expected = problema2.imprimirProblema2(1, 100);

        String actual = problema2.imprimirProblema2_actual(1, 100);

        Assertions.assertEquals(expected, actual);
    }
}