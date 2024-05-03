package ProblemOne;

public class problemOne {
    // Simple swipe membership card method
    public String swipeMembershipCard(starBucksCustomer customer) {
        if (customer.getPhoneNumber().length() != 10) {
            System.out.println("Invalid phone number");
            return "Invalid phone number";
        }
        if (customer.getActiveMembership()) {
            System.out.println("Membership card swiped successfully: " + customer.getCustomerID());
            System.out.println("Hello " + customer.getCustomerName() + "!");
        } else {
            System.out.println("Membership card is not active");
            return "Membership card is not active";
        }
        if (customer.getCouponCount() > 0) {
            System.out.println("get one free: 'coupon applied'");
            customer.setCoffeeCount(customer.getCoffeeCount()+1);
            customer.setCouponCount(customer.getCouponCount()-1);
            return "'get one free: 'coupon applied'";
        }
        return "";
    }

    // Purchase coffee method
    public void purchaseCoffee(starBucksCustomer customer) {
        // If coffee count is a multiple of 3, generate a coupon
        if (customer.getCoffeeCount() % 3 == 0) {
            spawnCoupon(customer);
            customer.setCoffeeCount(0);
        }
    }

    // Generate coupon method
    private void spawnCoupon(starBucksCustomer customer) {
        customer.setCouponCount(customer.getCouponCount()+1);
    }

}