package Lab3.src;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
    private String name;
    private ArrayList<LocalDateTime> timeOfBeginning;
    private LocalDateTime duration;
    Movie(String name) {
        this.name = name;
    }
    Movie(String name, ArrayList<LocalDateTime> beginning, LocalDateTime duration){
        this.name = name;
        this.timeOfBeginning =  beginning;
        this.duration = duration;
    };
    public static void printInfo() {}
    public void addShedule() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the duration of movie:");
        LocalDateTime duration = LocalDateTime.parse(s.nextLine());
        System.out.println("Add times of beginning:");
        ADD:
        while (true) {
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter the time:");
            LocalDateTime begin = LocalDateTime.parse(s1.nextLine());
            this.timeOfBeginning.add(begin);
            System.out.println("Want to add another time [Y/N]?");
            String answer = s1.nextLine();
            switch (answer) {
                case "Y":
                    continue ADD;
                case "N":
                default:
                    break ADD;
            }
        }

    }
    public String getName(){
        return this.name;
    };
    public ArrayList<LocalDateTime> getBeginning(){
        return this.timeOfBeginning;
    };
    public LocalDateTime getDuration(){
        return this.duration;
    };


}
