package Lab3.src;

import java.util.*;

public class Cinema {
    private String name;
    Cinema(String name) {
        this.name = name;
    }
    ArrayList<Hall> halls = new ArrayList<Hall>();
    ArrayList<Movie>  movies = new ArrayList<Movie>();
    ArrayList<ArrayList<Object>> sessions = new ArrayList<ArrayList<Object>>();
    //Map<Movie, Hall> sessions = new LinkedHashMap<Movie, Hall>();

    String getName() {
        return this.name;
    }

    public void AddMovie(){
        MOVIE:
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the name of movie");
            String name;
            name = s.nextLine();
            if (name.isEmpty()) {
                System.out.println("Movie can't be without name");
                continue MOVIE;
            } else if(name.equals("/")){
                break MOVIE;
            } else {
                Movie movie = new Movie(name);
                this.movies.add(movie);
                System.out.println("Want to add show schedule [Y/N]?");
                Scanner s2 = new Scanner(System.in);
                String key;
                key = s2.nextLine();
                switch (key) {
                    case "Y":
                        movie.addSchedule();
                        break;
                    case "N":
                    default:
                        break;
                }
                System.out.println("Want to add another movie [Y/N]?");
                Scanner s3 = new Scanner(System.in);
                String key2;
                key2 = s3.nextLine();
                switch (key2) {
                    case "Y":
                        continue MOVIE;
                    case "N":
                    default:
                        break MOVIE;
                }
            }
        }
    }
    public void AddHall() {
        HALL:
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the name of hall ('/' to exit):");
            String name;
            name = s.nextLine();
            if (name.isEmpty()) {
                System.out.println("Hall can't be without name");
                continue HALL;
            } else if(name.equals("/")){
                break HALL;
            } else {
                Hall hall = new Hall(name);
                this.halls.add(hall);
                System.out.println("Want to add seats [Y/N]?");
                Scanner s2 = new Scanner(System.in);
                String key;
                key = s2.nextLine();
                switch (key) {
                    case "Y":
                        hall.createSeatsConfiguration();
                    case "N":
                    default:
                }
                System.out.println("Want to add another hall [Y/N]?");
                Scanner s3 = new Scanner(System.in);
                String key2;
                key2 = s3.nextLine();
                switch (key2) {
                    case "Y":
                        continue HALL;
                    case "N":
                    default:
                        break HALL;
                }
            }
        }
    }

    public void printAvailableMovies() {
        for (int i = 0; i < this.movies.size(); i++) {
            System.out.println("№" + (i+1) + ": " + this.movies.get(i));
        }
    }
    public void printAvailableHalls() {
        for (int i = 0; i < this.halls.size(); i++) {
            System.out.println("№" + (i+1) + ": " + this.halls.get(i));
        }
    }
    public void printInfo() {
        if (sessions.isEmpty()) {
            System.out.println("No available sessions");
            if (!movies.isEmpty()) {
                System.out.println("Saved movies: ");
                for (int i = 0; i < movies.size(); i++) {
                    System.out.println("Movie №" + (i+1) + ": " + movies.get(i).getName());
                }
            }
            if (!halls.isEmpty()) {
                System.out.println("Saved halls: ");
                for (int i = 0; i < halls.size(); i++) {
                    System.out.println("Hall №" + (i+1) + ": " + halls.get(i).getName());
                }
            }
        } else {
            for (int i = 0; i < sessions.size(); i++) {
                System.out.print("№" + i + ": ");
                for (int j = 0; j < sessions.get(i).size(); j++) {
                    System.out.print(j);
                }
                System.out.println("------------------");
            }
        }
    }
    public void addSessions() {
        System.out.println("------Welcome to the adding of sessions------");
        this.printAvailableHalls();
        this.printAvailableMovies();
        if (halls.isEmpty() || movies.isEmpty()) {
            System.out.println("We apologize, there are no sessions available at this time");
        }  else {
            System.out.println("Choose pair: evailable hall + movie");
            Scanner s = new Scanner(System.in);
            int numHall = s.nextInt();
            int numMovie = s.nextInt();
            int i = sessions.size();
            this.sessions.get(i).add(movies.get(numMovie - 1));
            this.sessions.get(i).add(halls.get(numHall - 1));
        }
    }

    public void getTickets() {
        this.printInfo();
        if (!sessions.isEmpty()) {
            System.out.println("Enter the number of session");
            Scanner s = new Scanner(System.in);
            int number = s.nextInt();
            sessions.get(number-1);
        } else {
            System.out.println("No available sessions");
        }
    }
}

