
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void lab1() {
        System.out.printf("------Laboratory work №1------ \n");
        Random rand = new Random();
        int number = rand.nextInt(1, Integer.MAX_VALUE/4); //генерируем положительное число (делим на 4 чтобы не было выхода за пределы int)
        int countOfSteps = 0;

        System.out.printf("Input number: " + number + "\n");

        while (number>1) {
            if (number % 2 == 0) {
                number = number / 2;
                countOfSteps++;
            } else {
                number = 3 * number + 1;
                countOfSteps++;
            }
        }
        System.out.printf("Output number:  " + number + "\n");
        System.out.printf("Count of steps: " + countOfSteps + "\n");
    }

    public static void  lab2() {
        System.out.printf("------Laboratory work №2------ \n");
        System.out.printf("Enter the size of array: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the number №" + (i+1) + ": ");
            numbers.add(s.nextInt());
        }
        for (int i = 0; i < n; i++) {
            if ((i+1)%2 != 0) {
                result += numbers.get(i);
            } else {
                result -= numbers.get(i);
            }
        }

        System.out.printf("Input number: " + n + "\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("i№" + i + ": " + numbers.get(i) + "\n");
        }
        System.out.printf("Result number: " + result + "\n");
    }
    public static void main(String[] args) {
        lab2();
    }
}