package Decorator;

public class Lime extends DrinkDecorator {

    public Lime(Drink drink) {
        this.drink = drink;
        this.name = "Lime";
        this.price = 5.00;
    }
}
