package ProblemTwo;

public class Meteor implements Comparable<Meteor> {
    private double distanceToSurface;
    private int velocity;

    public Meteor(double distanceToSurface, int velocity) {
        this.distanceToSurface = distanceToSurface;
        this.velocity = velocity;
    }
    
    public double getDistanceToSurface() {return distanceToSurface;}
    public int getVelocity() {return velocity;}
    public double setDistanceToSurface(double distanceToSurface) {return this.distanceToSurface = distanceToSurface;}
    public int setVelocity(int velocity) {return this.velocity = velocity;}
    
    public int compareTo(Meteor other) {
        double timeToSurface = this.distanceToSurface / this.velocity;
        double otherTimeToSurface = other.distanceToSurface / other.velocity;
        return Double.compare(timeToSurface, otherTimeToSurface);
    }
}
