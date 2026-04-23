package service;

import model.*;

import java.util.ArrayList;

public class ShoppingCart {

    //Добавь в него поле — массив элементов из объектов типа Food.
    private ArrayList<Food> foods;

    //Понадобится конструктор с одним параметром — массивом элементов Food
    //Попробовал использовать ArrayList , после прохождения 3го спринта

    public ShoppingCart(ArrayList<Food> foods) {

        this.foods = foods;
    }

    //В классе ShoppingCart реализуй методы для работы с корзиной:
    //получить общую сумму товаров в корзине без скидки. Товары умножаем на цену

    public double totalSumWithoutDiscount() {
        double total = 0.0;
        for (Food food: foods){
            total = total + food.getAmount() * food.getPrice();
        }
        return total;
    }


    //получить общую сумму товаров в корзине со скидкой,

    public double totalSumWithDiscount(){
        double total = 0.0;
        for (Food food: foods){
            //в корзине могут быть товары со скидкой и без, считает цену со скидкой для каждого.
            total = total + food.getAmount() * (food.getPrice() * (1 - food.getDiscount()));
        }
        return total;
    }


    //получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    public double totalVeganSumWithoutDiscount(){
        double total = 0.0;
        for (Food food: foods){
            if (food.isVegetarian()) {
                total = total + food.getAmount() * food.getPrice();
            }
        }
        return total;
    }

    }


