package calcphyssignal;

import java.io.*;
import calc.signal.Calculator;

/**
 *
 * @author Ilya
 */
public class CalcPhysSignal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        String filename = args[0];
        FileInputStream fin = new FileInputStream(filename);
        byte[] signalCounts = new byte[fin.available()];

        fin.read(signalCounts, 0, fin.available());
        fin.close();

        Calculator calc = new Calculator();

        //Calculations
        int dynamicSignalRange = calc.dynamicSignalRange(signalCounts);
        int energy = calc.energy(signalCounts);
        double averagePower = calc.averagePower(energy, signalCounts.length);
        double averageSignalCountValue = calc.averageSignalCountValue(signalCounts);
        double signalCountsVariance = calc.signalCountsVariance(signalCounts, averageSignalCountValue);

        System.out.println("Amount of signal counts = " + signalCounts.length);
        System.out.println("Dynamic signal range = " + dynamicSignalRange);
        System.out.println("Energy of the signal = " + energy);
        System.out.println("Average signal power = " + averagePower);
        System.out.println("Average signal count value = " + averageSignalCountValue);
        System.out.println("Variance of signal counts = " + signalCountsVariance);
    }
}
