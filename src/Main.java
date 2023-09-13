
import java.util.ArrayList;
import java.util.Objects;
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
    public static void lab3() {
        class Point {
            int _x, _y;
            public Point(int x, int y) {
                _x = x;
                _y = y;
            }
        }
        System.out.println("------Laboratory work №3------ ");
        System.out.println("Enter the position of treasure: ");

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        Point treasure = new Point(x, y);
        Point way = new Point(0, 0);
        int countOfSteps = 0;
        int minCountOfSteps = 0;
        String command = null;
        int coordinate = 0;

        while (!Objects.equals(command, "stop")) {
            command = s.nextLine();
            switch (command) {
                case "north":
                    coordinate = s.nextInt();
                    way._y += coordinate;
                    countOfSteps += 1;
                    break;
                case "south":
                    coordinate = s.nextInt();
                    way._y -= coordinate;
                    countOfSteps += 1;
                    break;
                case "west":
                    coordinate = s.nextInt();
                    way._x -= coordinate;
                    countOfSteps += 1;
                    break;
                case "east":
                    coordinate = s.nextInt();
                    way._x += coordinate;
                    countOfSteps += 1;
                    break;
            }
            if (treasure._x == way._x && treasure._y == way._y) {
                minCountOfSteps = countOfSteps;
            }
        }

        System.out.println("(!REQUIRED OUTPUT!) Min count of steps to find a treasure: " + minCountOfSteps);
        System.out.println("All count of steps in map to find a treasure: " + countOfSteps);
    }
    public static void lab4() {
        System.out.println("------Laboratory work №4------");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the count of roads:");
        int roads = s.nextInt();
        ArrayList<Integer> maxHeights = new ArrayList<>();

        for (int i = 0; i < roads; i++) {
            System.out.println("Enter the count of tunnels in road №" + (i+1) + ":");
            int countOfTunnels = s.nextInt();
            int maxPossibleHeight = Integer.MAX_VALUE;
            for (int j = 0; j < countOfTunnels; j++) {
                System.out.println("Enter the height of tunnel №" + (j+1) + ":");
                int currentHeight = s.nextInt();
                if (currentHeight < maxPossibleHeight) {
                    maxPossibleHeight = currentHeight;
                }
            }
            System.out.println("Max possible height of road №:" + (i+1) + " " + maxPossibleHeight);
            maxHeights.add(maxPossibleHeight);
        }
        int maxHeight = maxHeights.get(0);
        int numberOfRoad = 0;
        for (int i = 0; i < maxHeights.size(); i++) {
            if (maxHeights.get(i) > maxHeight) {
                maxHeight = maxHeights.get(i);
                numberOfRoad = (i+1);
            }
        }
        System.out.println("--------------------");
        System.out.println("Reccomended road: " + numberOfRoad + ". The max height of car: " + maxHeight);
    }
    /*public static void lab5() {
        System.out.println("------Laboratory work №5------");
        System.out.println("Enter the number");
        boolean error = false;
        Scanner s = new Scanner(System.in);
        String number = s.nextLine().trim();
        if (number.length() > 3) {
            System.out.println("Too long");
        } else {
            int sum = 0;
            int product = 1;

            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    System.out.println("Char is not a digit with pos at " + (i+1));
                    error = true;
                    break;
                } else {
                    sum += Character.getNumericValue(number.charAt(i));
                    product *= Character.getNumericValue(number.charAt(i));
                }
            }

            if (!error) {
                System.out.println("sum = " + sum);
                System.out.println("product = " + product);
                if ((sum % 2 == 0) && (product % 2 == 0)) {
                    System.out.println("The number is twice even");
                } else {
                    System.out.println("The number is NOT twice even");
                }
            } else {
                System.out.println("Try again");
            }
        }

    }*/

    public static void lab5 () {
        class Number {
            int _x, _y, _z;
            Number(int x, int y, int z) {
                _x = x;
                _y = y;
                _z = z;
            };
            final boolean isTwiseEven() {
                if (((_x+_y+_z) % 2 == 0) && ((_x*_y*_z) % 2 == 0)) {
                    return true;
                } else  {
                    return false;
                }
            }
        }

        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        String number = s.nextLine().trim();
        if (number.length() > 3) {
            System.out.println("Too much digits");
        } else {
            if (!Character.isDigit(number.charAt(0)) || !Character.isDigit(number.charAt(1)) || !Character.isDigit(number.charAt(2))) {
                System.out.println("Input is not a digit");
            } else {
                Number num = new Number(number.charAt(0), number.charAt(1), number.charAt(2));

                if (num.isTwiseEven()) {
                    System.out.println("The number is twice even");
                } else {
                    System.out.println("The number is NOT twice even");
                }
            }
        }

    }
    public static void main(String[] args) {
        lab5();
    }
}