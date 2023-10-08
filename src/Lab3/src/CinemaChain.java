package Lab3.src;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CinemaChain {
    private  String name;
    public CinemaChain(String name){
        this.name = name;
    }
    public void Enter(){
        System.out.println("------Welcome to the ticket system------");

        ENTER:
        while (true) {
            Scanner s = new Scanner(System.in);
            String key;
            System.out.println("Enter access level: [A]dmin/[U]ser/[E]xit from program");
            key = s.nextLine();
            switch (key) {
                case "A":
                    Admin();
                case "U":
                    User();
                case "E":
                    System.out.println("The program was stopped");
                    break ENTER;
                default:
                    System.out.println("Wrong input");
                    continue ENTER;
            }
        }

    }
    public static void Admin(){
        ADMIN:
        while (true) {
            System.out.println("Available methods:");
            System.out.println("Add:");
            System.out.println("[0]info\n[1]movie\n[2]cinema\n[3]hall\n[4]exit");
            Scanner s = new Scanner(System.in);
            String key;
            key = s.nextLine();
            switch (key) {
                case "0":
                    PrintInfo();
                case "1":
                    AddMovie();
                case "2":
                    AddCinema();
                case "3":
                    AddHall();
                case "4":
                    break ADMIN;
                default:
                    System.out.println("Wrong input");
                    continue ADMIN;
            }
        }
    }

    public static void User() {
        USER:
        while (true) {
            System.out.println("Available methods:");
            System.out.println("Add:");
            System.out.println("[0]info\n[1]buy tickets\n[2]find upcoming\n[3]exit");
            Scanner s = new Scanner(System.in);
            String key;
            key = s.nextLine();
            switch (key) {
                case "0":
                    PrintInfo();
                case "1":
                    BuyTickets();
                case "2":
                    FindUpcoming();
                case "3":
                    break USER;
                default:
                    System.out.println("Wrong input");
                    continue USER;
            }
        }
    }
    public static void PrintInfo(){}
    public static void AddCinema(){}
    public static void AddMovie(){
        System.out.println("------Welcome to the creation of movies------");
        MOVIE:
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the name, time of beginning and duration of movie ('/' to exit):");
            String name, beginning, duration;
            name = s.nextLine();
            if (name.isEmpty()) {
                System.out.println("Movie can't be without name");
                continue MOVIE;
            } else if(name.equals("/")){
                break MOVIE;
            } else {
                Movie movie = new Movie(name);
                System.out.println("Want to add show schedule [Y/N]?");
                Scanner s2 = new Scanner(System.in);
                String key;
                key = s2.nextLine();
                switch (key) {
                    case "Y":
                        movie.addShedule();
                    case "N":
                    default:
                }
                System.out.println("Want to add another hall [Y/N]?");
                String key2;
                key2 = s2.nextLine();
                switch (key) {
                    case "Y":
                        continue MOVIE;
                    case "N":
                    default:
                        break MOVIE;
                }
            }
        }
    }
    public static void AddHall() {
        System.out.println("------Welcome to the creation of halls------");
        HALL:
            while (true) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the name of hall ('/' to exit):");
                String name;
                name = s.nextLine();
                if (name.isEmpty()) {
                    System.out.println("Hall can't be withount name");
                    continue HALL;
                } else if(name.equals("/")){
                    break HALL;
                } else {
                    Hall hall = new Hall(name);
                    System.out.println("Want to add seats [Y/N]?");
                    Scanner s2 = new Scanner(System.in);
                    String key;
                    key = s.nextLine();
                    switch (key) {
                        case "Y":
                            hall.createSeatsConfiguration();
                        case "N":
                        default:
                    }
                    System.out.println("Want to add another hall [Y/N]?");
                    Scanner s3 = new Scanner(System.in);
                    String key2;
                    key2 = s.nextLine();
                    switch (key) {
                        case "Y":
                            continue HALL;
                        case "N":
                        default:
                            break HALL;
                    }
                }
            }

    }
    public static void BuyTickets(){}
    public static void FindUpcoming(){};//ищет ближайший фильм

}
