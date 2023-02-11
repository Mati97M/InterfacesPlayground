package dev.mati;

public class Test {
    public static void main(String[] args) {
        inFlight(new Jet());
        //OrbitEarth.log("Testing " + new Satellite());

        orbit(new Satellite());
    }

    private static void inFlight(FlightEnabled flier) {
        System.out.println("calling function: inFlight");
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void orbit(OrbitEarth flier) {
        System.out.println("calling function: inFlight");
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
