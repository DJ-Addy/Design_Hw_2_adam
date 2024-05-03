## Probelem Set

1.
You are a Barista at a Starbuck coffee shop. The company recently implemented a membership program, for which customers swipe a membership card each time they come to the register. Based on the membership number on their card, the system brings up information on that customer. It includes what type of coffee they prefer so that Barista can provide better service and how many cups of coffee the customer has purchased. Every time a customer buys 3 cups of coffee, the system will automatically generate a coupon (“get one free”) in their account. (Note that the number of cups of coffee purchased will never exceed 3 because it is reset to 0 every time a coupon is generated.)

Intial Thoughts
-customer name, customer id,phoneNumber, Activemembership,coffeecounter,couponcounter, purchase method, create coupon method

Files: 
starBucksCustomer:
    -Contains customer object holds constructor and get n set methods: 
    String customerName;
    int customerId;
    String phoneNumber;
    boolean activeMembership;
    int coffeeCount;
    int couponCount;
problemOne:
    -Contains the coupon and swipe operators:
    -public String swipeMembershipCard(starBucksCustomer customer) //super difficult to test as a void method so switch to string didnt know how to model if the customer wanted to use coupons but it uses it automatically on a coffee
    -public void purchaseCoffee(starBucksCustomer customer) handles purchases
    - private void spawnCoupon(starBucksCustomer customer) generates coupon
testOne:
    -handles simple case of john doe, tried arrays of data tough time wrapping my head around it 

2.
The Justice League has had another run in with the Legion of Doom, led this time by Vandal Savage. The Legion’s newest scheme involves pelting the earth with a series of giant meteors. The plan is to cause widespread earthquakes and therefore destruction, ushering in a new age of civilization, with Vandal Savage in charge. Luckily, Batman has a contingency plan for every situation. He is going to have Superman fly up into the atmosphere and use his heat vision to destroy the meteors (or at least blow them up into smaller pieces) in the order that they are going to reach the ground. Batman needs a program into which he can enter meteors as they are discovered and which will output the meteors in the correct order so that he can tell Superman which one to destroy next.

Intial thoughts: 
-flying meteors stack or queue,destory method,bigmeteorbreaking method goes to the bottom of stack, metoers should store distance to surface;closest and or fastest velocity gets destoryed first. superman eyes are sharp but he needs a range where he can destory meteors in range of his beams.

todo/
implement range element!

Meteor:
    -Contains Metoer comparable object, hold distance and velocity
    - used time to compare meteors, faster eta means much more danger for earth so destory/poll first
    -get and set for distance and velocity
problem two:
    -simple case for metoer for functional testing
testTwo:
    -simple cases of meteors, the great thing with time is that no matter if it big or not if it not moving towards earth its going to be last to be destoryed, ei velocity is 0.


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
    - Problem One: Starbucks memebership program
    - Test-One: 
    - Problem Two: Justice League contingency plan
    - Test-Two: 
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
