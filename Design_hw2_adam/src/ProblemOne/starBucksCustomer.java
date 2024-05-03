package ProblemOne;

public class starBucksCustomer{
    private String customerName;
    private int customerId;
    private String phoneNumber;
    private boolean activeMembership;
    private int coffeeCount;
    private int couponCount;

    public starBucksCustomer(String customerName, int customerId, String phoneNumber, boolean activeMembership, int coffeeCount, int couponCount) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.activeMembership = activeMembership;
        this.coffeeCount = coffeeCount;
        this.couponCount = couponCount;
    }

    public String getCustomerName() {return customerName;}
    public int getCustomerID() {return customerId;}
    public String getPhoneNumber() {return phoneNumber;}
    public boolean getActiveMembership() {return activeMembership;}
    public int getCoffeeCount() {return coffeeCount;}
    public int getCouponCount() {return couponCount;}
    public void setCustomerName(String customerName) {this.customerName = customerName;}
    public void setCustomerID(int id) {this.customerId = id;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public void setActiveMembership(boolean activeMembership) {this.activeMembership = activeMembership;}
    public void setCoffeeCount(int coffeeCount) {this.coffeeCount = coffeeCount;}
    public void setCouponCount(int couponCount) {this.couponCount = couponCount;}

}