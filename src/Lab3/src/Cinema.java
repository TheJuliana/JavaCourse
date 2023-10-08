package Lab3.src;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class Cinema {
    private ArrayList<Hall> halls;
/*    public void addHall(Hall hall) {
        halls.add(hall);
    }*/
public static void printInfo() {}
public Cinema() {};
    public void createHall(){
        CREATION:
        while (true) {
            System.out.println("------Welcome to the creation of halls------");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the width of the row and the number of seats and movies ");
            int rows = s.nextInt();
            int columns = s.nextInt();
            System.out.println("rows " + rows + " cols " + columns);
            if (rows == 0 && columns == 0) {
                System.out.println("Wrong");
                continue CREATION;
            } else {
                ArrayList<ArrayList<Boolean>> seats = new ArrayList<ArrayList<Boolean>>();
                ArrayList<ArrayList<Movie>> movies = new ArrayList<ArrayList<Movie>>();
                for (int i = 0; i < rows; i++) {
                    ArrayList<Boolean> row = new ArrayList<>(columns);
                    for (int j = 0; j < columns; j++) {
                        row.add(j, Boolean.TRUE);
                    }
                    seats.add(row);
                }
                System.out.println("seats sze = " + seats.size());
                System.out.println(seats);

                Hall hall = new Hall(seats, movies);
                this.halls.add(hall);
                System.out.println("------Created------");
                System.out.println("Want to add another hall? (TYPE: Y if yes)");
                String answer;
                Scanner s2 = new Scanner(System.in);
                answer = s2.nextLine();
                if (Objects.equals(answer, "Y") || Objects.equals(answer, "y")) {
                    continue CREATION;
                } else {
                    break CREATION;
                }
            }
        }
    }
}
