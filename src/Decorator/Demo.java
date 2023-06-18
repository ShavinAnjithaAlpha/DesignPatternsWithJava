package Decorator;

public class Demo {

    public static void main(String[] args) {
        // create a wine
        Drink wine = new Wine();
        // get the name and price
        System.out.println("drink name: " + wine.getName());
        System.out.println("drink price: " + wine.getPrice());
        System.out.println();

        // add honey
        Drink drink2 = new Honey(wine);
        System.out.println("drink name: " + drink2.getName());
        System.out.println("drink price: " + drink2.getPrice());
        System.out.println();

        // create another drink with different ingredients
        Drink expensiveDrink = new Lime(new Lime(new Honey(new Spices(new Whiskey()))));
        System.out.println("drink name: " + expensiveDrink.getName());
        System.out.println("drink price: " + expensiveDrink.getPrice());
        System.out.println();


    }
}
