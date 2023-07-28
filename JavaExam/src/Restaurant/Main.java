package Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("", 20000,20);

        System.out.println();
        System.out.println("Price: " + restaurant.getPrice());
        System.out.println("Rating: " + restaurant.getRating());
        //adding items
        restaurant.addItem("Chips and Beef");
        restaurant.addItem("Gnuts and Kalo");
        System.out.println("\nAdding items");
        System.out.println("Items: " + restaurant.getItems());

        //removing items
        restaurant.removeItem("Gnuts and Kalo");
        System.out.println("\nRemoving items");
        System.out.println("Updated Items: " + restaurant.getItems());




    }
}
