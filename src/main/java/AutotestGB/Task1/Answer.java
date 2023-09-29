package AutotestGB.Task1;

/*

Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b, и возвращающий новый массив c,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.

Если длины массивов не равны - верните нулевой массив длины 1.

Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:

int[] a - первый массив
int[] b - второй массив
Пример


a = new int[]{4, 5, 6};
b = new int[]{1, 2, 3};

Вывод: [3, 3, 3]

a = new int[]{4, 5, 6};
b = new int[]{1, 2, 3, 5};

Вывод: [0]
 */


import java.util.ArrayList;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] c;
        if (a.length != b.length){
           c = new int[1];
           c[0]=0;
        } else {
            c = new int[a.length];
            try {
                for (int i = 0; i < a.length; i++) {
                    c[i] = a[i] / b[i];
            }

            }catch (ArithmeticException e){
                System.out.println("Деление на ноль");
            }
        }

        return c;
    }

}