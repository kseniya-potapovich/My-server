package by.patapovich.factorial.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class FactorialCalculator {
    public FactorialCalculator() {}

    public static BigInteger getFactorial(int power) throws NumberFormatException {
        if (power < 0) throw new ResponseStatusException(HttpStatus.CONFLICT,"N must be positive");;
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 2; i <= power; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static List<BigInteger> getListFactorial(int n) {
        if (n < 0) throw new ResponseStatusException(HttpStatus.CONFLICT,"N must be positive");
        List<BigInteger> list = new ArrayList<>();
        list.add(BigInteger.valueOf(1));
        for (int i = 1; i <= n; i++) {
            list.add(list.get(i - 1).multiply(BigInteger.valueOf(i)));
        }
        return list;
    }
}
