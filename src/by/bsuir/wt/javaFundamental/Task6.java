package by.bsuir.wt.javaFundamental;

public class Task6 {

    public int[][] calculate(int... allNubers) {
        int[][] answersMatrix = new int[allNubers.length][allNubers.length];
        for (int i = 0; i < allNubers.length; i++) {
            for (int j = 0; j < allNubers.length; j++) {
                answersMatrix[i][j] = allNubers[(i + j) % allNubers.length];
            }
        }
        return answersMatrix;
    }

}
