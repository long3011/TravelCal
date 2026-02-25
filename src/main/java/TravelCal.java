import java.util.*;
import java.util.Scanner;
public class TravelCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter distance (km):");
        int distance = input.nextInt(); // distance in kilometers
        System.out.println("Enter time (hours):");
        int time = input.nextInt(); // time in hours
        try {
            double speed = calculateSpeed(distance, time);
            System.out.println("The speed is: " + speed + " km/h");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculateSpeed(double distance, double time) {
        if (time <= 0) {
            throw new IllegalArgumentException("Time must be greater than zero.");
        }
        return distance / time;
    }
}
