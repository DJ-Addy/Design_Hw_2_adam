package ProblemTwo;
import org.junit.Before;
import org.junit.Test;
import java.util.PriorityQueue;
import static org.junit.Assert.assertEquals;

public class testTwo {
    private PriorityQueue<Meteor> meteors; // Use the imported Meteor class

    @Before
    public void setUp() {
        meteors = new PriorityQueue<>();
        meteors.add(new Meteor(10000, 12000)); // Use the imported Meteor class
        meteors.add(new Meteor(20000, 2000000)); // Use the imported Meteor class
        meteors.add(new Meteor(20000, 2000000)); // Use the imported Meteor class
        meteors.add(new Meteor(15000, 8000)); // Use the imported Meteor class
    }

    @Test
    public void testCompareTo() {
        // Test compareTo method by comparing expected results
        Meteor meteor1 = meteors.poll(); // Use the imported Meteor class
        Meteor meteor2 = meteors.poll(); // Use the imported Meteor class
        assertEquals(0, meteor1.compareTo(meteor2)); // Both meteors are equal distance from the surface
    }

    @Test
    public void testPriorityOrder() {
        // Test priority order by comparing expected order after polling from PriorityQueue
        assertEquals(20000.0, meteors.poll().getDistanceToSurface(), 0.0); 
        assertEquals(20000.0, meteors.poll().getDistanceToSurface(), 0.0); 
        assertEquals(10000.0, meteors.poll().getDistanceToSurface(), 0.0);
        assertEquals(15000.0, meteors.poll().getDistanceToSurface(), 0.0);
    }
}

