package ec.edu.ups.tdd.calculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {



    @Test
    public void given_two_integers_when_addition_then_ok() {
        Calculator calculator = new Calculator();
        int expect=106;
        int actual = calculator.addition(26,80);
        assertEquals(expect, actual);
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        Calculator calculator = new Calculator();
        int expect=20;
        int actual = calculator.subtraction(26,6);
        assertEquals(expect, actual);
    }

    @Test
    public void given_two_integers_when_multiplication_then_ok() {
        Calculator calculator = new Calculator();
        int expect=468;
        int actual = calculator.multiplication(78,6);
        assertEquals(expect, actual);
    }

    @Test
    public void given_two_double_when_division_then_ok() {
        Calculator calculator = new Calculator();
        double expect=4;
        double actual = calculator.division(20,5);
        assertEquals(expect, actual, 2);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void given_zero_as_divider_when_division_then_throw_exception() {
        exceptionRule.expect(ArithmeticException.class);
        exceptionRule.expectMessage("/ by zero");
        Calculator calculator = new Calculator();
        calculator.division(20,0);
    }

}
