package ru.timokhina.lesson6;

class Milk extends Ingredient {

    private int miliLiters;

    Milk (int miliLiters, int cost)  {
        super (cost);
        this.miliLiters = miliLiters;
    }

    @Override
    public int getCost()  {
        return super.getCost() * miliLiters;
    }
}
