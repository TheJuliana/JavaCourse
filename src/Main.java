// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
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
    public static void main(String[] args) {
        lab1();
    }
}