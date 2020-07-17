package processor;

import java.util.InputMismatchException;
import java.util.Scanner;

/* This class makes sum of two matrix and prints the result */
class AddMatrix{

    public void addition() {
        Scanner scanner = new Scanner(System.in);
        /* Work with first matrix */
        System.out.print("Enter size of first matrix: > ");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        float[][] matrixA = new float[rowsA][colsA];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < rowsA; i++) {
            System.out.print("> ");
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = Float.parseFloat(scanner.next());
            }
        }
        /* Work with second matrix */
        System.out.print("Enter size of second matrix: > ");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();
        float[][] matrixB = new float[rowsB][colsB];

        System.out.println("Enter second matrix:");
        for (int i = 0; i < rowsB; i++) {
            System.out.print("> ");
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = Float.parseFloat(scanner.next());
            }
        }

        /* Printing the result */
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("The sum result is:");
            for (int i = 0; i < rowsB; i++) {
                for (int j = 0; j < colsB; j++) {
                    float sum = matrixA[i][j] + matrixB[i][j];
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("ERROR");
        }
    }
}

/* This class makes multiplication of matrix and a constant number */
class Multiplication {

    public void multi(){
        Scanner scanner = new Scanner(System.in);
        /* Work with matrix */
        System.out.print("Enter size of matrix: > ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        float[][] matrix = new float[rows][cols];

        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++) {
            System.out.print("> ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Float.parseFloat(scanner.next());
            }
        }
        /* Work with constant */
        System.out.print("Enter constant: > ");
        int num = scanner.nextInt();

        /* Printing the result */
        System.out.println("The multiplication result is:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                int mul = (int) matrix[i][j] * num;
                System.out.print(mul + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

/* This class makes multiplication of two matrix */
class MultiMatrix{
    public void multiMatrix(){
        Scanner scanner = new Scanner(System.in);

        /* Work with first matrix */
        System.out.print("Enter size of first matrix: > ");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        float[][] matrixA = new float[rowsA][colsA];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < rowsA; i++) {
            System.out.print("> ");
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = Float.parseFloat(scanner.next());
            }
        }

        /* Work with second matrix */
        System.out.print("Enter size of second matrix: > ");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();
        float[][] matrixB = new float[rowsB][colsB];

        System.out.println("Enter second matrix:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = Float.parseFloat(scanner.next());
            }
        }

        /* Algorithm of matrix multiplication */
        double[][] resMatrix = new double[rowsA][colsB];
        System.out.println("The multiplication result is:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        /* Printing matrix */
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resMatrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();
    }
}

/* This class implements four types of transpositions */
class Transposition{

    Scanner scanner = new Scanner(System.in);

    /* Transposition relatively main diagonal */
    private void mainDiagonal(float[][] matrix){
        System.out.println("The result is:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print((int) matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /* Transposition relatively side diagonal */
    private void sideDiagonal(float[][] matrix){
        System.out.println("The result is:");
        for (int i = matrix.length - 1; i >= 0; i--){
            for (int j = matrix[i].length - 1; j >= 0; j--){
                System.out.print((int) matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /* Transposition by a vertical line */
    private void verticalLine(float[][] matrix){
        System.out.println("The result is:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = matrix[i].length - 1; j >= 0; j--){
                System.out.print((int) matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /* Transposition by a horizontal line */
    private void horizontalLine(float[][] matrix){
        System.out.println("The result is:");
        for (int i = matrix.length - 1; i >= 0; i--){
            for (int j = 0; j <matrix[i].length; j++){
                System.out.print((int) matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void matrixMenue(){
        String ans = null;
        System.out.print("1. Main diagonal\n" +
                "2. Side diagonal\n" +
                "3. Vertical line\n" +
                "4. Horizontal line\n" +
                "Your choice: > ");
        ans = scanner.next();
        switch (ans){
            case ("1"):
                mainDiagonal(matrixScanner());
                break;
            case ("2"):
                sideDiagonal(matrixScanner());
                break;
            case ("3"):
                verticalLine(matrixScanner());
                break;
            case ("4"):
                horizontalLine(matrixScanner());
                break;
            default:
                System.out.println("ERROR TRY AGAIN");
                matrixMenue();
                break;
        }
    }

    private float[][] matrixScanner(){
        System.out.print("Enter matrix size: > ");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        float[][] matrix = new float[rowsA][colsA];

        System.out.println("Enter matrix:");
        for (int i = 0; i < rowsA; i++) {
            System.out.print("> ");
            for (int j = 0; j < colsA; j++) {
                try{
                    matrix[i][j] = Float.parseFloat(scanner.next());
                } catch (InputMismatchException e){
                    System.out.println("WRONG VALUE TRY AGAIN");
                    System.exit(0);
                } catch (NumberFormatException e){
                    System.out.println("WRONG VALUE TRY AGAIN");
                    System.exit(0);
                }
            }
        }
        return matrix;
    }
}

/* This class calculates a determinant of a matrix. */
class Determinant{
    private int rows;
    private int cols;
    private float answer;
    private float[][] matrix;

    /* This method calculates a determinant of a matrix and returns its value */
    private float matrixDeterminant(float[][] matrix, int size) {
        float det = 0;
        int degree = 1;

        if(size == 1) {
            return matrix[0][0];
        }
        else if(size == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        else {
            /* New matrix without row and col */
            float[][] newMatrix = new float[size-1][size-1];
            for(int j = 0; j < size; j++) {
                matrixCleaning(matrix, size, 0, j, newMatrix);
                det = det + (degree * matrix[0][j] * matrixDeterminant(newMatrix, size-1));
                degree = -degree;
            }
        }
        return det;
    }

    /* This is an assistant method that delete specific row and col from matrix */
    private void matrixCleaning(float[][] matrix, int size, int row, int col, float[][] newMatrix) {
        int offsetRow = 0;
        int offsetCol = 0;

        for(int i = 0; i < size-1; i++) {
            if(i == row) {
                offsetRow = 1;
            }
            offsetCol = 0;
            for(int j = 0; j < size-1; j++) {
                if(j == col) {
                    offsetCol = 1;
                }
                newMatrix[i][j] = matrix[i + offsetRow][j + offsetCol];
            }
        }
    }

    /* This method scans matrix and place it at the matrix field */
    /* Then it invokes method that calculates a determinant of a matrix and print it */
    public void matrixScanner(){
        Scanner scanner = new Scanner(System.in);

        /* Size scanning */
        System.out.print("Enter matrix size: > ");
        try {
            rows = scanner.nextInt();
            cols = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("WRONG VALUE TRY AGAIN");
            matrixScanner();
        }
        matrix = new float[rows][cols];

        /* Matrix scanning */
        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++) {
            System.out.print("> ");
            for (int j = 0; j < cols; j++) {
                try {
                    matrix[i][j] = Float.parseFloat(scanner.next());
                } catch (InputMismatchException e) {
                    System.out.println("WRONG VALUE TRY AGAIN");
                    matrixScanner();
                } catch (NumberFormatException e) {
                    System.out.println("WRONG VALUE TRY AGAIN");
                    matrixScanner();
                }
            }
        }
        /* Method invoke */
        answer = matrixDeterminant(matrix, rows);
        /* Determinant printing */
        System.out.println("The result is:\n" + answer + "\n");
    }
}

/* This class  finds an inverse of a matrix. */
class MatrixInverse{
    private int rows;
    private int cols;
    private float[][] matrix;

    public void matrixScanner(){
        Scanner scanner = new Scanner(System.in);

        /* Size scanning */
        System.out.print("Enter matrix size: > ");
        try {
            rows = scanner.nextInt();
            cols = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("WRONG VALUE TRY AGAIN");
            matrixScanner();
        }
        matrix = new float[rows][cols];

        /* Matrix scanning */
        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++) {
            System.out.print("> ");
            for (int j = 0; j < cols; j++) {
                try {
                    matrix[i][j] = Float.parseFloat(scanner.next());
                } catch (InputMismatchException e) {
                    System.out.println("WRONG VALUE TRY AGAIN");
                    matrixScanner();
                } catch (NumberFormatException e) {
                    System.out.println("WRONG VALUE TRY AGAIN");
                    matrixScanner();
                }
            }
        }
        inversion();
    }

    /* This method implements the matrix inversion */
    void inversion() {
        double temp;
        float [][] E = new float [rows][cols];


        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
            {
                E[i][j] = 0f;

                if (i == j)
                    E[i][j] = 1f;
            }

        for (int k = 0; k < rows; k++)
        {
            temp = matrix[k][k];

            for (int j = 0; j < cols; j++)
            {
                matrix[k][j] /= temp;
                E[k][j] /= temp;
            }

            for (int i = k + 1; i < rows; i++)
            {
                temp = matrix[i][k];

                for (int j = 0; j < cols; j++)
                {
                    matrix[i][j] -= matrix[k][j] * temp;
                    E[i][j] -= E[k][j] * temp;
                }
            }
        }

        for (int k = rows - 1; k > 0; k--)
        {
            for (int i = k - 1; i >= 0; i--)
            {
                temp = matrix[i][k];

                for (int j = 0; j < cols; j++)
                {
                    matrix[i][j] -= matrix[k][j] * temp;
                    E[i][j] -= E[k][j] * temp;
                }
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix[i][j] = E[i][j];
            }
        }
        printMatrix(matrix);
    }

    private void printMatrix(float[][] matrix){
        System.out.println("The result is:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("%1.2f%s", matrix[i][j], " ");
            }
            System.out.println();
        }
    }
}

/* Menue class */
class Menue {
    public void menue(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            String ans = null;
            System.out.print("1. Add matrices\n" +
                    "2. Multiply matrix to a constant\n" +
                    "3. Multiply matrices\n" +
                    "4. Transpose matrix\n" +
                    "5. Calculate a determinant\n" +
                    "6. Inverse matrix\n" +
                    "0. Exit\n" +
                    "Your choice: > ");
            ans = scanner.next();
            switch (ans){
                case ("1"):
                    AddMatrix add = new AddMatrix();
                    add.addition();
                    break;
                case ("2"):
                    Multiplication multi = new Multiplication();
                    multi.multi();
                    break;
                case ("3"):
                    MultiMatrix mulMat = new MultiMatrix();
                    mulMat.multiMatrix();
                    break;
                case ("4"):
                    Transposition tr = new Transposition();
                    tr.matrixMenue();
                    break;
                case ("5"):
                    Determinant det = new Determinant();
                    det.matrixScanner();
                    break;
                case ("6"):
                    MatrixInverse inv = new MatrixInverse();
                    inv.matrixScanner();
                    break;
                case ("0"):
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR TRY AGAIN\n");
                    break;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
       Menue menue = new Menue();
       menue.menue();
    }
}
