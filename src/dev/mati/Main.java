package dev.mati;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        //all others references, we can assign bird to:
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;
        ////
        animal.move();

        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();

        inFlight(flier);
        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();

        double kmTraveled = 100;
        double milesTraveled = kmTraveled * FlightEnabled.KM_TO_MILES;
        System.out.println("The truck traveled %.2f km or %.2f miles ".formatted(kmTraveled,milesTraveled));

        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);


    }
    private static void inFlight(FlightEnabled flier) {
        System.out.println("calling function: inFlight");
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}
