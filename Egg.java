package ru.timokhina.lesson6;

class Egg extends Ingredient {

    private int piece;

    Egg(int piece, int cost) {
        super(cost);
        this.piece = piece;
    }

    @Override
    public int getCost() {
        return super.getCost() * piece;
    }
}
