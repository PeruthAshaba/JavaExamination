package Box;

public class Main {
    public static void main(String[] args) {
        //Instance of the Box class
        Box box = new Box(9);

        //getting the width of box
        System.out.println("\nGetting width of the box");
        System.out.println("Width: " + box.getWidth());

        //Updating the width of box
        box.setWidth(19);
        System.out.println("\nUpdated Width of the box");
        System.out.println("Width: " + box.getWidth());

    }
}
