package by.bsuir.wt.javaFundamental;

public class Task3 {

    public double[][] calculateTg(double a, double b, double h) {
        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }
        if (h == 0) {
            return null;
        }
        double[][] answer = new double[(int) Math.floor((b - a) / h)][2];
        for (int i = 0; i < answer.length; i++) {
            answer[i][0] = a;
            answer[i][1] = Math.tan(a);
            a += h;
        }
        return answer;
    }
}
