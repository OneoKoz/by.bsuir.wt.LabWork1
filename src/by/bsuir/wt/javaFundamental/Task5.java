package by.bsuir.wt.javaFundamental;

public class Task5 {

    public double findMinNumber(double[] allNumbers) {
        double[] optimalCount = new double[allNumbers.length];
        double max = 0;
        for (int j = 0; j < allNumbers.length; j++) {
            optimalCount[j] = findMax(j, allNumbers, optimalCount);
            if (max < optimalCount[j]) {
                max = optimalCount[j];
            }
        }
        return allNumbers.length - max;
    }

    private double findMax(int j, double[] allNumbers, double[] optimalCount) {
        double temp = 0;
        for (int i = 0; i < j; i++) {
            if (allNumbers[i] < allNumbers[j] && temp < optimalCount[i]) {
                temp = optimalCount[i];
            }
        }
        return ++temp;
    }
}
