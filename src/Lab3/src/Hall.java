package Lab3.src;

import java.util.*;

public class Hall {
    private String name;
    private ArrayList<ArrayList<Boolean>> seats; //кресла (занято/не занято)
    //private ArrayList<Movie> movieSessions = new ArrayList<Movie>();
    private ArrayList<ArrayList<Movie>> movies;
    Hall(String name) {
        this.name = name;
    }
    Hall(ArrayList<ArrayList<Boolean>> seats, ArrayList<ArrayList<Movie>>  movies) {
        this.seats = seats;
        this.movies = movies;
    }
    public static void createMovie(){
        System.out.println("------Movie Creation-------");

    };
    public static void printInfo(){}; //печатает план зала с  указанием занятых и свободных мест
    public void createSeatsConfiguration() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the width of the row and the number of seats");
        int rows = s.nextInt();
        int columns = s.nextInt();
        System.out.println("rows " + rows + " cols " + columns);
        if (rows == 0 && columns == 0) {
            System.out.println("Seats didn't create");
        } else {
            ArrayList<ArrayList<Boolean>> seats = new ArrayList<ArrayList<Boolean>>();
            for (int i = 0; i < rows; i++) {
                ArrayList<Boolean> row = new ArrayList<>(columns);
                for (int j = 0; j < columns; j++) {
                    row.add(j, Boolean.TRUE);
                }
                seats.add(row);
            }
            System.out.println("seats sze = " + seats.size());
            System.out.println(seats);
        }
    }
}
