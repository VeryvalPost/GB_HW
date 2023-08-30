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

        Category chemestry = new Category("Бытовая химия", new ArrayList<>());
        Category products = new Category("Продукты", new ArrayList<>());

        products.addToCategory(milk);
        products.addToCategory(eggs);
        products.addToCategory(bread);
        chemestry.addToCategory(toothpaste);

        store.add(products);
        store.add(chemestry);

        System.out.println("Итого в магазине: ");
        for (Category category: store
             ) { category.printCategory();
        }
        System.out.println("_________________________________1____________________________________ ");
        User valentin = new User("Valentin", "111", new Basket());
        User dima = new User("Dima", "222", new Basket());
        User elena = new User("Elena", "333", new Basket());


        System.out.println("________________________________2____________________________________ ");
        buy(valentin,store, "Хлеб", 3);
        buy(elena,store, "Зубная паста", 1);
        System.out.println("________________________________3____________________________________ ");
        valentin.showBasket();
        elena.showBasket();

        System.out.println("_________________________________4_____________________________________ ");
        System.out.println("_______________________________________________________________________ ");
        System.out.println("_______________________________________________________________________ ");


        System.out.println("Итого в магазине: ");
        for (Category category: store
        ) { category.printCategory();
        }
    }

    public static void buy (User user, ArrayList<Category> store, String prod, int qty){

        for (Category cat: store
             ) {
            int temp =cat.findByName(prod).getQty();
            cat.findByName(prod).setQty(temp-qty);
        }
        user.getBasket().addToBasket(prod,qty);
    }

}