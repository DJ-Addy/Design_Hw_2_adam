package ProblemTwo;

import java.util.PriorityQueue;

public class problemTwo {
    private static class Meteor implements Comparable<Meteor> {
        private double distanceToSurface;
        private int velocity;

        public Meteor(double distanceToSurface, int velocity) {
            this.distanceToSurface = distanceToSurface;
            this.velocity = velocity;
        }

        public int compareTo(Meteor other) {
            double timeToSurface = this.distanceToSurface / this.velocity;
            double otherTimeToSurface = other.distanceToSurface / other.velocity;
            return Double.compare(timeToSurface, otherTimeToSurface);
        }
    }
    public static void main(String[] args) throws Exception {
        PriorityQueue<Meteor> meteors = new PriorityQueue<>();

        // Add meteors to the priority queue as they are discovered
        meteors.add(new Meteor(10000, 12000));
        meteors.add(new Meteor(20000, 2000000));
        meteors.add(new Meteor(15000, 8000));

        // Output the meteors in the correct order
        while (!meteors.isEmpty()) {
            Meteor nextMeteor = meteors.poll();
            System.out.println("Super Man destroyed meteor at distance " + nextMeteor.distanceToSurface);
        }
    }
}
