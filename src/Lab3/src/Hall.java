package Lab3.src;

import java.util.*;

public class Hall {
    private String name;
    private ArrayList<ArrayList<Boolean>> seats = new ArrayList<ArrayList<Boolean>>(); //кресла (занято/не занято)
    //private ArrayList<Movie> movieSessions = new ArrayList<Movie>();
    private ArrayList<ArrayList<Movie>> movies;
    Hall(String name) {
        this.name = name;
    }
    Hall(ArrayList<ArrayList<Boolean>> seats, ArrayList<ArrayList<Movie>>  movies) {
        this.seats = seats;
        this.movies = movies;
    }
    String getName() {
        return this.name;
    }
    public void printInfo(){
        System.out.println("Name:" + this.name);
        System.out.println("Capacity: " + seats.size());
        System.out.println("Seats: ");
        for (int i = 0; i < seats.size(); i++) {
            System.out.println("Row №"+ i + " :");
            for (int j = 0; j < seats.get(i).size(); i++) {
                System.out.print(j);
            }
        }
    }; //печатает план зала с  указанием занятых и свободных мест
    public void createSeatsConfiguration() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the width of the row and the number of seats: ");
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
