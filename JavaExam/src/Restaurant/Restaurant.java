package Restaurant;



import java.util.*;

public class Restaurant {
    private List<String> items;
    private int price;
    private int rating;


    public Restaurant(String item, int price, int rating) {
        this.items=new ArrayList<>();
        this.price = price;
        this.rating = rating;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }



    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
    //method for adding items
    public void addItem(String item){
        items.add(item);
    }

    public void removeItem(String item){
        items.remove(item);
    }
}
