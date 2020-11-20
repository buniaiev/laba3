package calc.signal;

/**
 *
 * @author Ilya
 */
public class Calculator {

    public int dynamicSignalRange(byte[] signalCounts) {
        byte max = -128;
        byte min = 127;

        for (int i = 0; i < signalCounts.length; i++) {
            if (signalCounts[i] < min) {
                min = signalCounts[i];
            }
            if (signalCounts[i] > max) {
                max = signalCounts[i];
            }
        }

        return max - min;
    }

    public int energy(byte[] signalCounts) {
        int energy = 0;

        for (int i = 0; i < signalCounts.length; i++) {
            energy += Math.pow(signalCounts[i], 2);
        }

        return energy;
    }

    public double averagePower(double energy, double number) {
        return energy / number;
    }

    public double averageSignalCountValue(byte[] signalCounts) {
        double sum = 0;
        int number = signalCounts.length;

        for (int i = 0; i < number; i++) {
            sum += signalCounts[i];
        }

        return sum / number;
    }

    public double signalCountsVariance(byte[] signalCounts, double averageSignalCountValue) {
        int number = signalCounts.length;
        int sum = 0;

        for (int i = 0; i < number; i++) {
            sum += Math.pow((signalCounts[i] - averageSignalCountValue), 2);
        }

        return sum / number;
    }
}
