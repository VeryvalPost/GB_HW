package Exceptions;

import FinalTest.Elevator;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        try(scanner) {
            Boolean inputTrue = true;
            while (inputTrue) {
                System.out.println("Введите действие:\n"+
                        "1. Добавить запись в файл\n"+
                        "2. Посмтореть записи из файла \n"+
                        "3. Завершить");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        addToFile();
                        break;
                    case "2":
                        listAllRecords();
                        break;
                    case "3":
                        inputTrue = false;
                        break;
                    default:
                        System.out.println("Нет такой команды");

                }
            }
            System.out.println("END");
        }
    }

    private static void listAllRecords() {
        File file = new File("contacts.db");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Считывание файла завершено");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void addToFile() {
        StringBuilder sb = new StringBuilder();
        System.out.println("Введите данные пользователя через пробел. \n"+
                "Форматы данных:\n" +
                "фамилия, имя, отчество - строки\n" +
                "датарождения - строка формата dd.mm.yyyy\n" +
                "номертелефона - целое беззнаковое число без форматирования\n" +
                "пол - символ латиницей f или m.");
        User newUser = new User();
        String[] splitInput = scanner.nextLine().split(" ");
        for (String element: splitInput
             ) {

            // Создаем дату и проверяем на ошибки
            if ((element.toCharArray().length == 10)&&(element.contains("."))){
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

                try {
                    Date date = dateFormat.parse(element);
                    System.out.println("Дата:" +  date);
                    newUser.setDateOfBirth(date);
                } catch (ParseException e) {
                    System.out.println("Ошибка преобразования даты:" + e);
                    e.printStackTrace();
                }
            }
            // Создаем пол
            else if ((element.equals("f")||(element.equals("m")))){
                if (element.equals("f")){
                    newUser.setGender(Gender.FEMALE);
                    System.out.println("Пол:" +  Gender.FEMALE);
                } else {
                    newUser.setGender(Gender.MALE);
                    System.out.println("Пол:" +  Gender.FEMALE);
                }
                // Создаем телефон и проверяем на ошибки
            } else if ((element.toCharArray().length == 11)&&(!element.contains("."))){
            // Создаем телефон
                try {
                    float number = Float.parseFloat(element);
                    System.out.println("Телефон:" +  number);
                    newUser.setTelephoneNum(number);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка преобразования числа:" + e);
                    e.printStackTrace();
                }
            } else {
                sb.append(element)
                        .append(" ");
            }
        }
        // Создаем ФИО пользователя
        newUser.setName(sb.toString());
        saveToFile(newUser);
    }

    private static void saveToFile(User newUser) {
        File file = new File("contacts.db");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(newUser.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

