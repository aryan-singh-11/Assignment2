class Distance {
    protected double miles;

    public Distance(double miles) {
        this.miles = miles;
    }

    public void travelTime() {
        double time = miles / 60; // assuming speed is 60 miles per hour
        System.out.println("Travel time (in hours): " + time);
    }
}

class DistanceMKS extends Distance {
    public DistanceMKS(double kilometers) {
        super(kilometers);
    }

    @Override
    public void travelTime() {
        double time = miles / 100; // assuming speed is 100 km per hour
        System.out.println("Travel time (in hours): " + time);
    }
}

public class q12 {
    public static void main(String[] args) {
        Distance distance = new Distance(120);
        distance.travelTime();

        DistanceMKS distanceMKS = new DistanceMKS(150);
        distanceMKS.travelTime();
    }
}
