package by.patapovich.factorial.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
public class FactorialController {

    @GetMapping("/factorial/{power}")
    public BigInteger getFactorial(@PathVariable Integer power) {
        return FactorialCalculator.getFactorial(power);
    }

    @GetMapping("/factorials/{n}")
    public List<BigInteger> getFactorials(@PathVariable Integer n) {
        return FactorialCalculator.getListFactorial(n);
    }
}
