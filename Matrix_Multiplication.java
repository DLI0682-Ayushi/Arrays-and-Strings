package arrayproblrm;

public class Matrix_Multiplication {
    public static void main(String[] args) {
                int[][] matrix1 = {{1, 2, 3}, {2, 4, 7}, {5, 7, 9}};
                int[][] matrix2 = {{7, 9, 2}, {5, 2, 8}, {1, 8, 3}};
                int rows1 = matrix1.length;
                int cols1 = matrix1[0].length;
                int cols2 = matrix2[0].length;

                int[][] result = new int[rows1][cols2];

                for (int i = 0; i < rows1; i++) {
                    for (int j = 0; j < cols2; j++) {
                        for (int k = 0; k < cols1; k++) {
                            result[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }

                for (int i = 0; i < rows1; i++) {
                    for (int j = 0; j < cols2; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }

