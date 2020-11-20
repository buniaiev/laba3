package calc.signal;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ilya
 */
public class CalculatorTest {

    public CalculatorTest() {
    }

    /**
     * Test of dynamicSignalRange method, of class Calculator.
     */
    @Test
    public void testDynamicSignalRange() {
        System.out.println("dynamicSignalRange");
        byte[] signalCounts = new byte[]{30, 127};
        Calculator instance = new Calculator();
        int expResult = 97;
        int result = instance.dynamicSignalRange(signalCounts);
        assertEquals(expResult, result);
    }

    /**
     * Test of energy method, of class Calculator.
     */
    @Test
    public void testEnergy() {
        System.out.println("energy");
        byte[] signalCounts = new byte[]{100, 20};
        Calculator instance = new Calculator();
        int expResult = 10400;
        int result = instance.energy(signalCounts);
        assertEquals(expResult, result);
    }

    /**
     * Test of averagePower method, of class Calculator.
     */
    @Test
    public void testAveragePower() {
        System.out.println("averagePower");
        double energy = 10400;
        double number = 2;
        Calculator instance = new Calculator();
        double expResult = 5200;
        double result = instance.averagePower(energy, number);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of averageSignalCountValue method, of class Calculator.
     */
    @Test
    public void testAverageSignalCountValue() {
        System.out.println("averageSignalCountValue");
        byte[] signalCounts = new byte[]{100, 20};
        Calculator instance = new Calculator();
        double expResult = 60;
        double result = instance.averageSignalCountValue(signalCounts);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of signalCountsVariance method, of class Calculator.
     */
    @Test
    public void testSignalCountsVariance() {
        System.out.println("signalCountsVariance");
        byte[] signalCounts = new byte[]{100, 20};
        double averageSignalCountValue = 60;
        Calculator instance = new Calculator();
        double expResult = 1600;
        double result = instance.signalCountsVariance(signalCounts, averageSignalCountValue);
        assertEquals(expResult, result, 0.0);
    }

}
