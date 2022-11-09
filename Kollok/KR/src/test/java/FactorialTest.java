import by.patapovich.factorial.calculator.FactorialCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigInteger;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void factorial() {
        BigInteger f = FactorialCalculator.getFactorial(3);
        assertEquals(BigInteger.valueOf(6), f);
    }

    @Test
    void factorialZero() {
        BigInteger f = BigInteger.ONE;
        assertEquals(BigInteger.valueOf(1), f);
    }

    @Test
    void factorialNegative() {
        assertThrows(ResponseStatusException.class, () -> FactorialCalculator.getFactorial(-1));
    }

    @Test
    void factorialList() {
        List<BigInteger> list = FactorialCalculator.getListFactorial(5);
        assertEquals(6, list.size());
    }

    @Test
    void factorialZeroList() {
        assertEquals(1, FactorialCalculator.getListFactorial(0).size());
    }

    @Test
    void factorialNegativeList() {
        assertThrows(ResponseStatusException.class, () -> FactorialCalculator.getListFactorial(-1));
    }
}
