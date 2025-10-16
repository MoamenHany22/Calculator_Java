package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    @Test
    void testAdd(){
        Calculator calc = new Calculator();
        assertEquals(10,calc.add(3,7), "3+7 should be 10");
    }

    @Test
    void testSubtract(){
        Calculator calc = new Calculator();
        assertEquals(5,calc.subtract(15,10),"15-10 should be 5");
    }@Test
    void testMultiply(){
        Calculator calc = new Calculator();
        assertEquals(20,calc.multiply(2,10),"2*10 should be 20");
    }@Test
    void testDivide(){
        Calculator calc = new Calculator();
        assertEquals(4,calc.divide(16,4),"16/4 should be 4");
    }
}
