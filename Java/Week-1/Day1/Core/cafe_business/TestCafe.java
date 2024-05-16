import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeUtil = new CafeUtil();
        int testSum = cafeUtil.getStreakGoal();
        System.out.println("The sum is " + testSum);
        // * ===============getOrderTotal==============================*/
        double[] prices = { 5, 10, 3, 4.5 };
        double testPrices = cafeUtil.getOrderTotal(prices);
        System.out.println("The total is " + testPrices);
        // *========================================menuItems======================= */
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("Coffe Drip");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");
        cafeUtil.displayMenu(menuItems);

        System.out.println("------------Add Customer---------");
        ArrayList<String> customers = new ArrayList<String>();
        cafeUtil.addCustomer(customers);
    }

}