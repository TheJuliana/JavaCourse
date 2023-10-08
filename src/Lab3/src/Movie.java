package Lab3.src;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
    private String name;
    private ArrayList<Double> timeOfBeginning = new ArrayList<Double>();
    private double duration;
    Movie(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
    Movie(String name, ArrayList<Double> beginning, double duration){
        this.name = name;
        this.timeOfBeginning =  beginning;
        this.duration = duration;
    };
    public void printInfo() { //мне лень делать метод статическим и писать геттеры -_-
        System.out.println("------");
        System.out.print("NAME: ");
        System.out.println(this.name);
        System.out.print("Duration: ");
        System.out.println(this.duration);
        System.out.println("Schedule: ");
        for (int i = 0; i < timeOfBeginning.size(); i++) {
            System.out.println("№" + (i+1) + " " + timeOfBeginning.get(i));
        }
    }
    public void addSchedule() {
        ADD:
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the duration of movie (in format 00,00):");
            double dur;
            try {
                dur = s.nextDouble();
            } catch (Exception e) {
                System.out.println("ERROR");
                break ADD;
            }
            System.out.println("DUR:" + dur);
            this.duration = dur;
            ADD2:
            while (true){
                System.out.println("Add times of beginning:");
                Scanner s1 = new Scanner(System.in);
                System.out.println("Enter the time (in format 00,00):");
                double begin;
                try {
                    begin = s1.nextDouble();
                } catch (Exception e) {
                    System.out.println("ERROR");
                    break ADD2;
                }
                this.timeOfBeginning.add(begin);
                System.out.println("Want to add another time [Y/N]?");
                Scanner s2 = new Scanner(System.in);
                String answer = s2.nextLine();
                switch (answer) {
                    case "Y":
                        continue ADD2;
                    case "N":
                    default:
                        break ADD;
                }
            }
        }

    }


}
