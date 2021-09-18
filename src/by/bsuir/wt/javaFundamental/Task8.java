package by.bsuir.wt.javaFundamental;

public class Task8 {

    private double[] arrayA;
    private double[] arrayB;

    public int[] calculate(double[] arrayA, double[] arrayB) {
        int[] answerPosition = new int[arrayB.length];
        int positionB = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i]<=arrayB[positionB]){
                answerPosition[positionB]=i+1;
                positionB++;
                i--;
            }
        }
        while (answerPosition.length-1!=positionB){
            answerPosition[positionB]=arrayA.length;
            positionB++;
        }
        return answerPosition;
    }

}
