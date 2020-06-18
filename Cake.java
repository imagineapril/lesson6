package ru.timokhina.lesson6;

public class Cake {
    private Ingredient[] ingredients;

    Cake() {
        ingredients = new Ingredient[3];
        ingredients[0] = new Ingredient(100);
        ingredients[1] = new Milk(200, 200);
        ingredients[2] = new Egg(3, 300);
    }

    int getCost() {
        int sum = 0;
        for (Ingredient i : ingredients) {
            sum += i.getCost();
        }
        return sum;
    }

    int getCustomerCost() {
        return getCost() * 2;
    }
}
