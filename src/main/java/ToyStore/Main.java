package ToyStore;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OneHandBandit bandit =new OneHandBandit();
        OneHandBanditView view = new OneHandBanditView(bandit);
    }
}
