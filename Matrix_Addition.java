package arrayproblrm;

public class Matrix_Addition {
    public static void main(String[] args) {
                int[][] matrix1 = {{1, 2, 3}, {2, 4, 7}, {5, 7, 9}};
                int[][] matrix2 = {{7, 9, 2}, {5, 2, 8}, {1, 8, 3}};
                int[][] addition = new int[3][3];
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix2.length; j++) {
                        addition[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                for (int i = 0; i < addition.length; i++) {
                    for (int j = 0; j < addition[i].length; j++) {
                        System.out.print(addition[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }

