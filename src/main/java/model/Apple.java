package model;


import static model.constants.Colour.*;
import static model.constants.Discount.*;

public class Apple extends Food {

    /*Класс Apple — для яблок. У него есть ещё строковое поле colour — цвет яблок.
    Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.
     */

    private String color;

    //@Override Переопределили конструктор абстрактного класса
    public Apple(int amount, double price, String color){
        super(amount,price);
        isVegetarian = true;
        this.color = color;
    }

    //Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.

    //Переопределили метод интерфейса и использовали константы из constants

    @Override
    public double getDiscount() {
        if (color.equals(RED)) {
            return DISCOUNT;
        } else{
            return NO_DISCOUNT;
        }

    }
}
