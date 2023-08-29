package FinalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxFloor;
        int baseFloor;
        Elevator elevator = new Elevator();

        Scanner scanner = new Scanner(System.in);
        Boolean inputTrue = true;
        while (inputTrue) {
            System.out.println("Введите максимальный этаж и минимальный этаж для настроек лифта, либо просто максимальный этаж. Вводить нужно через пробел. Значение может быть от -5 до 250 этажей");
            String[] input = (scanner.nextLine()).split(" ");
            if (input.length == 2) {
                ArrayList<Integer> arrInput = new ArrayList<>();
                arrInput.add(Integer.parseInt(input[0]));
                arrInput.add(Integer.parseInt(input[1]));


                if ((-5 < arrInput.get(0)) && (arrInput.get(0) < 250) && (arrInput.get(0) > arrInput.get(1))) {
                    maxFloor = arrInput.get(0);
                    baseFloor = arrInput.get(1);
                    elevator.setMaxFloor(arrInput.get(0));
                    elevator.setBaseFloor(arrInput.get(1));
                    inputTrue = false;
                } else {
                    System.out.println("Некорректный ввод");
                }
            } else if (input.length == 1) {
                maxFloor = Integer.parseInt(input[0]);
                if ((-5 < maxFloor) && (maxFloor < 250)) {

                    elevator.setMaxFloor(maxFloor);
                    inputTrue = false;

                } else {
                    System.out.println("Некорректный ввод");
                }
            } else {
                System.out.println("Некорректный ввод");

            }

        }

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите - exit)");

            String move = scanner.nextLine();
            if ("exit".equals(move)) {
                System.out.println("Завершение программы");
                break;
            }
            elevator.move(move);
        }
    }
}

