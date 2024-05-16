import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(String.format("%d %s", i, menuItems.get(i)));

        }

    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        customers.add(username);
        System.out.println(String.format("Hello %s", username));
        System.out.printf("There are %s people in front of you", customers.size());
        System.out.println(customers);
    }

}