package Lab3.src;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class CinemaChain {
    private  String name;
    private ArrayList<Cinema> cinemas = new ArrayList<Cinema>();
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
                    continue ENTER;
                case "U":
                    User();
                    continue ENTER;
                case "E":
                    System.out.println("The program was stopped");
                    break ENTER;
                default:
                    System.out.println("Wrong input");
                    continue ENTER;
            }
        }

    }
    public void Admin(){
        ADMIN:
        while (true) {
            System.out.println("Available methods:");
            System.out.println("Add:");
            System.out.println("[0]info\n[1]movie\n[2]cinema\n[3]hall\n[4]add session\n[5]exit");
            Scanner s = new Scanner(System.in);
            String key;
            key = s.nextLine();
            switch (key) {
                case "0":
                    PrintInfo();
                    continue ADMIN;
                case "1":
                    AddMovie();
                    continue ADMIN;
                case "2":
                    AddCinema();
                    continue ADMIN;
                case "3":
                    AddHall();
                    continue ADMIN;
                case "4":
                    AddSession();
                    continue ADMIN;
                case "5":
                    break ADMIN;
                default:
                    System.out.println("Wrong input");
                    continue ADMIN;
            }
        }
    }

    private void AddSession() {
        System.out.println("Enter the name of cinema where you want to create a session");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        for (int i = 0; i < this.cinemas.size(); i++) {
            if (Objects.equals(this.cinemas.get(i).getName(), name)) {
                this.cinemas.get(i).addSessions();
            }
        }
    }

    private void AddHall() {
        ADH:
        while (true) {
            if (!cinemas.isEmpty()){
                System.out.println("Available cinemas: ");
                for (int i = 0; i < this.cinemas.size(); i++) {
                    System.out.println(" © " + this.cinemas.get(i).getName());
                }
            } else {
                System.out.println("No available cinemas");
                break ADH;
            }
            System.out.println("------Welcome to the creation of halls------");
            System.out.println("Enter the name of cinema where you want to create a hall");
            Scanner s = new Scanner(System.in);
            String name = s.nextLine();
            if (Objects.equals(name, "E")) {
                break ADH;
            } else {
                for (int i = 0; i < this.cinemas.size(); i++) {
                    if (Objects.equals(this.cinemas.get(i).getName(), name)) {
                        this.cinemas.get(i).AddHall();
                    }
                }
            }
        }
    }

    private void AddMovie() {
        ADM:
        while (true) {
            System.out.println("------Welcome to the creation of movies------");
            if (!cinemas.isEmpty()){
                System.out.println("Available cinemas: ");
                for (int i = 0; i < this.cinemas.size(); i++) {
                    System.out.println(" © " + this.cinemas.get(i).getName());
                }
            } else {
                System.out.println("No available cinemas");
                break ADM;
            }
            System.out.println("Enter the name of cinema where you want to create a movie (TYPE [E] to exit):");
            Scanner s = new Scanner(System.in);
            String name = s.nextLine();
            if (Objects.equals(name, "E")) {
                break ADM;
            } else {
            for (int i = 0; i < this.cinemas.size(); i++) {
                if (Objects.equals(this.cinemas.get(i).getName(), name)) {
                    this.cinemas.get(i).AddMovie();
                    break ADM;
                } else {
                    System.out.println("There are no such cinemas");
                    continue ADM;
                }
            }}
        }
    }

    public void User() {
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
                    break;
                case "1":
                    BuyTickets();
                    break;
                case "2":
                    FindUpcoming();
                    break;
                case "3":
                    break USER;
                default:
                    System.out.println("Wrong input");
                    continue USER;
            }
        }
    }
    public void PrintInfo(){
        System.out.println("-------------------------");
        System.out.println(this.name);
        System.out.println("-------------------------");
        for (int i =0; i < this.cinemas.size(); i++) {
            System.out.println("Cinema №" + (i+1) + ": "+this.cinemas.get(i).getName());
            this.cinemas.get(i).printInfo();
        }
    }
    public void AddCinema(){
        CINEMA:
        while (true) {
            System.out.println("------Welcome to the creation of cinema------");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the name of cinema ('/' to exit):");
            String name;
            name = s.nextLine();
            if (name.isEmpty()) {
                System.out.println("Cinema can't be withount name");
                continue CINEMA;
            } else if(name.equals("/")){
                break CINEMA;
            } else {
                Hall hall = new Hall(name);
                Cinema cinema = new Cinema(name);
                this.cinemas.add(cinema);
                System.out.println("Want to add another cinema [Y/N]?");
                Scanner s2 = new Scanner(System.in);
                String key2;
                key2 = s2.nextLine();
                switch (key2) {
                    case "Y":
                        continue CINEMA;
                    case "N":
                    default:
                        break CINEMA;
                }
            }
        }
    }
    public  void BuyTickets(){
        System.out.println("------Welcome!------");
        TICKET:
        while (true) {
            if (!cinemas.isEmpty()){
                System.out.println("Available cinemas: ");
                for (int i = 0; i < this.cinemas.size(); i++) {
                    System.out.println(" © " + this.cinemas.get(i).getName());
                }
            } else {
                System.out.println("No available cinemas");
                break TICKET;
            }
            System.out.println("Enter the name of cinema where you want to buy a ticket (TYPE [E] for exit):");
            Scanner s = new Scanner(System.in);
            String name = s.nextLine();
            if (Objects.equals(name, "E")) {
                break TICKET;
            }  else {
                for (int i = 0; i < this.cinemas.size(); i++) {
                    if (Objects.equals(this.cinemas.get(i).getName(), name)) {
                        this.cinemas.get(i).getTickets();
                        System.out.println("Want to buy another ticket?");
                        Scanner s2 = new Scanner(System.in);
                        String answer = s2.nextLine();
                        switch (answer) {
                            case "Y":
                                continue TICKET;
                            case "N":
                            default:
                                break TICKET;
                        }
                    } else {
                        System.out.println("There is no such a cinemas");
                        continue TICKET;
                    }
                }
            }
        }
    }
    public static void FindUpcoming(){};//ищет ближайший фильм

}
