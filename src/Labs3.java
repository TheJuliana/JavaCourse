import java.util.ArrayList;
import java.util.Scanner;

public class Labs3 {
    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string: ");
        String string = in.nextLine();
        if (string.equalsIgnoreCase(new StringBuffer(string).reverse().toString())) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is NOT palindrome");
        }
    }

    public static void task2() {
        System.out.println("Enter the size of array.");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int numRows = s.nextInt();
        System.out.println("Enter the size of columns: ");
        int numCols = s.nextInt();
        int[][] matrix = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        int[] sumOfRows = new int[numRows];
        int[] sumOfColumns = new int[numCols];

        for (int i = 0; i < numRows; i++) {
            int sumOfRow = 0;
            for (int j = 0; j < numCols; j++) {
                sumOfRow += matrix[i][j];
            }
            sumOfRows[i] = sumOfRow;
        }
         for (int j = 0; j < numCols; j++){
            int sumOfCol = 0;
             for (int i = 0; i < numRows; i++) {
                sumOfCol += matrix[i][j];
            }
            sumOfColumns[j] = sumOfCol;
        }
        System.out.println("\nSums of rows: ");
         for (int i = 0; i < sumOfRows.length; i++) {
             System.out.printf(sumOfRows[i]+" " );
         }
        System.out.println("\nSums of cols: ");
        for (int i = 0; i < sumOfColumns.length; i++) {
            System.out.printf(sumOfColumns[i]+" " );
        }
    }
}
