package Lab3.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    private ArrayList<Hall> _halls = new ArrayList<Hall>();
    public static void createHall(){
        Scanner s = new Scanner(System.in);
        System.out.println("------Welcome to the creation of halls------");
        System.out.println("Enter the width of the row and the number of seats and movies ");
        int rows = s.nextInt();
        int columns = s.nextInt();
        System.out.println("rows "+rows+" cols "+columns);
        ArrayList<ArrayList<Boolean>> seats = new ArrayList<ArrayList<Boolean>>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Boolean> row = new ArrayList<>(columns);
            for (int j = 0; j < columns; j++) {
                row.add(Boolean.TRUE);
            }
            seats.add(row);
        }
   /*     System.out.println("seats sze =" + seats.size());
        for (int i = 0; i < seats.size(); i++) {
            for (int j = 0; j < seats.get(i).size(); j++){
                //System.out.println(seats);
                System.out.println("1");
            }
        }*/
        System.out.println("------Created------");
    };
}
