package ToyStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class OneHandBandit implements LuckyMachine {

    private HashMap<Integer, Toy> toyStorage = new HashMap();

    AtomicInteger id = new AtomicInteger();
    private int winNumber=0;
    private String winName="";

    @Override
    public void clickPlayButton() throws InterruptedException {
        System.out.println("Проводим лоторею ");
        sleep(100);
        System.out.println("3 ");
        sleep(600);
        System.out.println("2 ");
        sleep(600);
        System.out.println("1 ");
        sleep(1000);
        System.out.println(" ");
        System.out.println("Количество на складе до розыгрыша");
        printStorge();
        lohotronGenerator();
        System.out.println(" ");

        removeToy((Integer) getWinNumber());

        System.out.println("Количество на складе после розыгрыша");
        printStorge();
    }

    public void addToy(Toy toy) {
        boolean found = false;
        for (Toy element : toyStorage.values()) {
            if (toy.getName().equals(element.getName())) {
                toy.increaseQty();
                found = true;
                break;
            }

        }

        if (!found) {
            toy.increaseQty();
            this.toyStorage.put(id.incrementAndGet(), toy);
        }

        System.out.println("Добавлена игрушка " + toy.getName());
    }

    public boolean removeToy(Integer id) {
        for (Map.Entry<Integer, Toy> entry : toyStorage.entrySet()) {
            if (entry.getKey()== id) {
                entry.getValue().decreaseQty();
                if (entry.getValue().getQty() == 0) {
                    toyStorage.remove(entry.getKey());
                }
                return true;
            }
        }
        return false;
    }

    public void lohotronGenerator() {
        ArrayList<LotteryRates> allRates = new ArrayList<>();
        int summPercent = 0;
        int startRate = 0;
        int stopRate = 0;
        int index = 0;

        // Создаем общий пул allRates из вероятностей выигрвть определенную игрушку
        for (Map.Entry<Integer, Toy> entry : toyStorage.entrySet()) {
            int tempPercent = entry.getValue().getPercentage();
            startRate = summPercent;
            stopRate = summPercent + tempPercent;
            allRates.add(index, new LotteryRates(index, entry.getValue().getName(), startRate, stopRate));
            summPercent += tempPercent;
            index++;
        }

        // Проводим лоторею и возвращаем ID элемента, который выиграл
        Random random = new Random();
        int winner = random.nextInt(summPercent);
        System.out.println(winner);
        for (LotteryRates lr : allRates
        ) {
            if (lr.isInRange(winner)) {
                System.out.println("Выпал лот под номером " + (lr.getId() + 1) + ": " + lr.getName());
                setWinNumber(lr.getId()+1);
                setWinName(lr.getName());
                }
            }
        }


    // Просто вывод в консоль для проверки
    public void printStorge() {
        System.out.println("__________________________________________________");
        for (Map.Entry<Integer, Toy> entry : toyStorage.entrySet()
        ) {
            System.out.println(entry.getValue().toString());
        }
        System.out.println("__________________________________________________");
    }


    public int getWinNumber() {
        return winNumber;
    }

    public void setWinNumber(int winNumber) {
        this.winNumber = winNumber;
    }

    public void setWinName(String winName) {
        this.winName = winName;
    }

    public String getWinName() {
        return winName;
    }
}