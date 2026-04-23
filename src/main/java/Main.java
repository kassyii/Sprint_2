import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import java.util.ArrayList;

import static model.constants.Colour.*;

public class Main {

    public static void main(String[] args) {
        //Мясо в количестве 5 кг по цене 100 рублей за кг;
        Food meat = new Meat(5,100);
        //Яблоки красные в количестве 10 кг по цене 50 рублей;
        Food redApple = new Apple(10,50,RED);
        //Яблоки зелёные в количестве 8 кг по цене 60 рублей.
        Food greenAple = new Apple(8,60,GREEN);

        //Создай массив продуктов из этих элементов и проинициализируй корзину с помощью созданного массива.
        ArrayList<Food> food = new ArrayList<>();
        food.add(meat);
        food.add(redApple);
        food.add(greenAple);

        ShoppingCart shoppingCart = new ShoppingCart(food);


        //Посчитай и выведи на экран значения для созданной корзины:
        //общую сумму товаров без скидки,
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.totalSumWithoutDiscount());
        //общую сумму товаров со скидкой,
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.totalSumWithDiscount());
        //сумму всех вегетарианских продуктов без скидки.
        System.out.println("Общая сумма всех вегетарианских продуктов без скидки: " + shoppingCart.totalVeganSumWithoutDiscount());
    }

}
