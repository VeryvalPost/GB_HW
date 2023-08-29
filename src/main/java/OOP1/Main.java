package OOP1;

/*

Домашнее задание на закрепление:

1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
3)Создать класс Basket, содержащий массив купленных товаров.
4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
5)Вывести на консоль каталог продуктов. (все продукты магазина)
6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)

Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

Формат сдачи:
Ссылка на гитхаб проект
Подписать фамилию и номер группы
 */


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Category> store = new ArrayList<>();

        Goods milk = new Goods("Молоко", 86.30, 9.3, 15);
        Goods eggs = new Goods("Яйца", 121.50, 8.0, 18);
        Goods bread = new Goods("Хлеб", 35.0, 5.0, 150);
        Goods toothpaste = new Goods("Зубная паста", 235.0, 4.0, 40);

        Category chemestry = new Category("Бытовая химия", );

        store.add(milk);
        store.add(eggs);
        store.add(bread);
        chemestry.add(toothpaste);

        System.out.println("Итого в магазине: ");
        for (Goods goods: store
             ) { System.out.println(goods);
        }

        User Valentin = new User("Valentin", "111", new Basket());
        User Dima = new User("Dima", "222", new Basket());
        User Elena = new User("Elena", "333", new Basket());





    }
}