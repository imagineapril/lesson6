package ru.timokhina.lesson6;

public class Ingredient {

    protected int cost;
    protected String name;

    Ingredient(int cost)    {
        this.cost = cost;
        this.name = "ингредиент по умолчанию";
    }

    public Ingredient(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public int getCost()   {
        return cost;
    }

    public String getName() {
        return name;
    }
}
