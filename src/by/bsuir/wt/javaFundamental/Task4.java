package by.bsuir.wt.javaFundamental;

public class Task4 {

    public void findPrimaryNumbers(double[] allNumbers) {
        findPrimaryNumbers(allNumbers, allNumbers.length);
    }

    public void findPrimaryNumbers(double[] allNumbers, double N) {
        for (double num : allNumbers) {
            if (isPrimary(num)) {
                System.out.println(num);
            }
        }
    }

    private boolean isPrimary(double num) {
        double divider = 2;
        double rootNum = Math.sqrt(num);
        while (divider <= rootNum) {
            if (num % divider == 0) {
                return false;
            }
            divider++;
        }
        return true;
    }
}

