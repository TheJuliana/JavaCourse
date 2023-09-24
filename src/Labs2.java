import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Labs2 {
    public static void lab1() {
        System.out.println("------Laboratory work №1------ \n");
        String input = "djfsnfjnsjfne";
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar) + 1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
        System.out.printf("String:" + output);
    }
    public static void lab2() {
        System.out.println("------Laboratory work №2------ \n");
        int n = 10;
        int[] mas1 = new int[n];
        int[] mas2 = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            mas1[i] = (rand.nextInt(1, Integer.MAX_VALUE));
            mas2[i] = (rand.nextInt(1, Integer.MAX_VALUE));
        }
        java.util.Arrays.sort(mas1);
        java.util.Arrays.sort(mas2);
        int[] mas3 = new int[n+n];
        int k = n;
        for (int i = 0; i < n; i++) {
            mas3[i] = mas1[i];
            mas3[k] = mas2[i];
            k++;
        }
        java.util.Arrays.sort(mas3);
        System.out.println("\nResult sorted mas:\n");
        for (int i = 0; i < mas3.length; i++) {
            System.out.println("i№" + i + ": " + mas3[i]);
        }

    }
    public static void lab3() {
        System.out.println("\n------Laboratory work №3------\n");
        int n  = 10;
        int[] mas = new int[n];
        Random rand = new Random();
        int maxSum = 0;
        int sumSubArray = 0;
        for (int i = 0; i < n; i++) {
            mas[i] = (rand.nextInt(1, Integer.MAX_VALUE));
        }
        for (int i = 0; i < n; i++) {
            sumSubArray += mas[i];
            sumSubArray = Integer.max(sumSubArray, 0);
            maxSum = Integer.max(sumSubArray, maxSum);
        }
        System.out.println("Max sum of subarray = " + maxSum);
    }
    public static void lab4() {
        System.out.println("------Laboratory work №4------");
        Random rand = new Random();
        int numRows = 5;
        int numCols = 7;
        int[][] matrix = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = (rand.nextInt(1, Integer.MAX_VALUE));
            }
        }
        System.out.println("\nMatrix\n");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.printf(" " + matrix[i][j]);
            }
            System.out.println();
        }
        int[][] matrixTranspose = new int[numCols][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrixTranspose[j][i] = matrix[i][j];
            }
        }
        System.out.println("\nTranspose matrix\n");
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                System.out.printf(" " + matrixTranspose[i][j]);
            }
            System.out.println();
        }
    }
    public static void lab5() {
        System.out.println("------Laboratory work №5------");
        int n  = 10;
        int target = 5;
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = i;
        }
        boolean founded = false;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                if (mas[i] + mas[j] == target) {
                    System.out.println("Founded: " + mas[i] + "+" + mas[j]);
                    founded = true;
                }
            }
        }
        if (!founded) {
            System.out.println("NULL");
        }
    }
    public static void lab6() {
        System.out.println("------Laboratory work №6------");
        Random rand = new Random();
        int numRows = 5;
        int numCols = 7;
        int[][] matrix = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = (rand.nextInt(1, Integer.MAX_VALUE));
            }
        }
        int sum = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum = " + sum);
    }
    public static void lab7() {
        System.out.println("------Laboratory work №7------");
        Random rand = new Random();
        int numRows = 5;
        int numCols = 7;
        int[][] matrix = new int[numRows][numCols];
        int[] maxElems = new int[numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = (rand.nextInt(1, Integer.MAX_VALUE));
            }
        }
        for (int i = 0; i < numRows; i++) {
            int maxElem = 0;
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] > maxElem) {
                    maxElem = matrix[i][j];
                }
            }
            maxElems[i] = maxElem;
        }
        System.out.println("Max elements: ");
        for (int i = 0; i < numRows; i++) {
            System.out.printf(maxElems[i] + " ");
        }
    }
    public static void lab8() {
        System.out.println("------Laboratory work №8------");
        Random rand = new Random();
        int numRows = 5;
        int numCols = 7;
        int[][] matrix = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = (rand.nextInt(1, Integer.MAX_VALUE));
            }
        }
        System.out.println("\nMatrix\n");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.printf(" " + matrix[i][j]);
            }
            System.out.println();
        }
        int[][] matrixTransposeReverse = new int[numCols][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrixTransposeReverse[numCols-j-1][i] = matrix[i][j];
            }
        }
        System.out.println("\nTranspose matrix\n");
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                System.out.printf(" " + matrixTransposeReverse[i][j]);
            }
            System.out.println();
        }
    }
}
