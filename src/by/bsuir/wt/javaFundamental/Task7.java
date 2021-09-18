package by.bsuir.wt.javaFundamental;

public class Task7 {

    public double[] sortShell(double[] initialArray) {
        for (int i = 0; i < initialArray.length - 1; i++) {
            if (initialArray[i] > initialArray[i + 1]) {
                double temp = initialArray[i];
                initialArray[i] = initialArray[i + 1];
                initialArray[i + 1] = temp;
                i--;
            }
        }
        return initialArray;
    }
}
