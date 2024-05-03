package ProblemOne;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class testOne {
    private problemOne problem;
    private starBucksCustomer customer;

    @Before
    public void setUp() {
        customer = new starBucksCustomer("John Doe", 12345, "1234567890", true, 5, 2);
        problem = new problemOne();
    }

    @Test
    public void testSwipeMembershipCard_ValidPhoneNumber_ActiveMembership() {
        problem.swipeMembershipCard(customer);
        assertEquals(1, customer.getCouponCount());
        assertEquals(6, customer.getCoffeeCount());
    }

    @Test
    public void testSwipeMembershipCard_InvalidPhoneNumber() {
        customer.setPhoneNumber("123456789");
        assertEquals("Invalid phone number", problem.swipeMembershipCard(customer));
    }

    @Test
    public void testSwipeMembershipCard_InactiveMembership() {
        customer.setActiveMembership(false);
        assertEquals("Membership card is not active", problem.swipeMembershipCard(customer));
    }

    @Test
    public void testPurchaseCoffee_CoffeeCountMultipleOf3() {
        customer.setCoffeeCount(6);

        problem.purchaseCoffee(customer);
        assertEquals(0,  customer.getCoffeeCount());
    }

    @Test
    public void testPurchaseCoffee_CoffeeCountNotMultipleOf3() {
        customer.setCoffeeCount(5);

        problem.purchaseCoffee(customer);

        assertEquals(5, customer.getCoffeeCount());
    }
}