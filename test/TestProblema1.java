import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema1 {

    @Test
    public void test_problema1() {

        Problema1 problema1 = new Problema1();

        String actual = problema1.imprimirProblema1(1);

        String expected = "12Fizz34Buzz5Fizz678Fizz9Buzz1011Fizz121314FizzBuzz1617Fizz1819Buzz20";

        Assertions.assertEquals(expected, actual);
    }
}