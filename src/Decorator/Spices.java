package Decorator;

public class Spices extends DrinkDecorator {

    public Spices(Drink drink) {
        this.drink = drink;
        this.name = "Spices";
        this.price = 3.00;
    }
}
