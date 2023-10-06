package Lab3.src;

import java.util.*;

public class Hall {
    private ArrayList<ArrayList<Boolean>> seats = new ArrayList<ArrayList<Boolean>>(); //кресла (занято/не занято)
    //private ArrayList<Movie> movieSessions = new ArrayList<Movie>();
    private ArrayList<ArrayList<Movie>> movies = new ArrayList<ArrayList<Movie>>();
    Hall(ArrayList<ArrayList<Boolean>> seats, ArrayList<ArrayList<Movie>>  movies) {
        this.seats = seats;
        this.movies = movies;
    }
    public static void createMovie(){
        System.out.println("------Movie Creation-------");

    };
    public static void printInfo(){}; //печатает план зала с  указанием занятых и свободных мест
    public static void createSeatsConfiguration(){};
}
