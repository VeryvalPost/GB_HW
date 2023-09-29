package CompexCalculator;

import java.util.Scanner;

public class ComlexView implements View{
    @Override
    public void showResult(Object calculate) {
        System.out.println(" Результат вычислений: "+ calculate.toString());
    }

    @Override
    public ComplexNumber inputValue(String name) {
        ComplexNumber complexNumber = new ComplexNumber(0,0);
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите действительную часть комлексного числа " + name);
            String valueReal = scanner.nextLine();
            Double RealString = Double.parseDouble(valueReal);
            complexNumber.setA(RealString);

            System.out.println("Введите мнимую часть комлексного числа " + name);
            String valueImage = scanner.nextLine();
            Double ImageString = Double.parseDouble(valueImage);
            complexNumber.setB(ImageString);

            return complexNumber;
        } catch (NumberFormatException e){
            System.out.println("Ошибка ввода");
        }
        return null;
    }


    @Override
    public String inputOperand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действие, которое необходимо выполнить: \n " +
                "+ - сложение \n" +
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
