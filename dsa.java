import java.util.Scanner;

public class dsa {
    static boolean check(int rows, int col) {
        System.out.println("Checking ! ");
        if (rows <= 0 || rows >= 4 || col <= 0 || col >= 4) {
            System.out.println("Invalid matrix size!");
            return false;
        }
        return true;

    }

    static void add(int matrix1[][], int matrix2[][]) {
        System.out.println("ADD TWO MATRIX ! ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(" " + (matrix1[i][j] + matrix2[i][j]));
            }
            System.out.println(" ");
        }
    }

    static void sub(int matrix1[][], int matrix2[][]) {
        System.out.println("SUB TWO MATRIX ! ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(" " + (matrix1[i][j] - matrix2[i][j]));
            }
            System.out.println(" ");
        }
    }

    static void multi(int matrix1[][], int matrix2[][]) {
        System.out.println("SUB TWO MATRIX ! ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(" " + (matrix1[i][j] * matrix2[i][j]));
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Element for The  Matix ! ");
        System.out.println("Enter The Rows ! ");
        int rows = input.nextInt();
        System.out.println("Enter The Columms ! ");
        int col = input.nextInt();
        if (!check(rows, col)) {
            return;
        }
        int matrix1[][] = new int[rows][col];
        int matrix2[][] = new int[rows][col];
        System.err.println("/////////////////////////////////////////////////////");
        for (int i = 0; i < rows; i++) {
            System.err.println("The First Matrix ! ");
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.err.println("///////////////////////////////////////////////////////");
        for (int i = 0; i < rows; i++) {
            System.err.println("The Second Matrix ! ");
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        check(rows, col);
        while (true) {
            System.err.println("1 == DISPLAYING NUMBER ");
            System.err.println("2 == ADD MATRIX NUMBER ");
            System.err.println("3 == SUB MATRIX NUMBER ");
            System.err.println("4 == MULTI MATRIX NUMBER ");
            System.err.println("5 == EXIT NUMBER ! ");
            int number = input.nextInt();
            if (number == 1) {
                System.err.println("The First Matrix ! ");
                for (int i = 0; i < matrix1.length; i++) {
                    System.err.print("");
                    for (int j = 0; j < matrix1[0].length; j++) {
                        System.err.print(" " + matrix1[i][j]);

                    }

                    System.out.println("");
                }
                System.err.println("The Second Matrix !");
                for (int i = 0; i < matrix2.length; i++) {
                    System.err.print("");
                    for (int j = 0; j < matrix2[0].length; j++) {
                        System.err.print(" " + matrix2[i][j]);

                    }
                    System.out.println("");
                }
            } else if (number == 2) {
                add(matrix1, matrix2);
            } else if (number == 3) {
                sub(matrix1, matrix2);

            } else if (number == 4) {
                multi(matrix1, matrix2);
            } else if (number == 5) {
                System.err.println("Thank for Coming ! ");
                break;
            } else {
                System.out.println("SomeThing WEnt Wrong ! ");
            }

        }

        input.close();
    }

}