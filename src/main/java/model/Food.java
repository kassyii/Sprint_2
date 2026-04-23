package model;

import static model.constants.Discount.NO_DISCOUNT;

public abstract class Food implements Discountable {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    // Конструктор, потом переопредлеиться в классах Meat и Apple
    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    //Геттеры для того что бы получить общую сумму в ShoppingCart

    public int getAmount(){
        return amount;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getDiscount() {
        return NO_DISCOUNT;
    }
}
