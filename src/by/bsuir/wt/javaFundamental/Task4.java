package by.bsuir.wt.javaFundamental;

public class Task4 {

    public void findPrimaryNumbers(double[] allNumbers) {
        findPrimaryNumbers(allNumbers, allNumbers.length);
    }

    public void findPrimaryNumbers(double[] allNumbers, double N) {
        if (N > allNumbers.length) {
            N = allNumbers.length;
        }
        for (int i = 0; i < N; i++) {
            if (isPrimary(allNumbers[i])) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrimary(double num) {
        double divider = 2;
        double rootNum = Math.sqrt(num)+1;
        while (divider <= rootNum) {
            if (num % divider == 0) {
                return false;
            }
            divider++;
        }
        return true;
    }
}

