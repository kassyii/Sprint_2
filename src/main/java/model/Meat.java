package model;

public class Meat extends Food {

    /*
    Класс Meat — для мяса. Это класс с конструктором.
    Конструктор принимает два входных параметра — количество и цену.
    И устанавливает для флага isVegetarian правильное значение.
    */

    //@Override Переопределили конструктор абстрактного класса
    public Meat(int amount, double price){
        super(amount,price);
        isVegetarian = false;
    }

    //Переопределили метод интерфейса. Должен возвращать 0
    @Override
    public double getDiscount() {
        return 0;
    }
}
