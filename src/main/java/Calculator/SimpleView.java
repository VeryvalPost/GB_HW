package Calculator;

import java.util.Scanner;

public class SimpleView implements View{



    @Override
    public void showResult(Double caluculate) {
        System.out.println("Вывод итогового результата: " + caluculate);
    }

    @Override
    public Double inputValue(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение переменной " + name);
        try {
            String valueString = scanner.nextLine();
            Double value = Double.parseDouble(valueString);
            return value;
        } catch (NumberFormatException e){
            System.out.println("Ошибка ввода числа");
        }
        return null;
    }

    public String inputOperand(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действие, которое необходимо выполнить: \n " +
                "+ - сложение \n" +
                "- - вычитание \n" +
                "* - умножение \n" +
                "/ - деление \n");

        try {
            String valueString = scanner.nextLine();
            return valueString;
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка ввода");
        }

        return null;
    }




}
