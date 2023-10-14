package ToyStore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OneHandBanditView extends JFrame implements ActionListener {
    private JButton playButton;
    private JButton addButton;
    private JTextField toyNameField;
    private JTextField toyQtyField;
    private JTextField toyPercentageField;
    OneHandBandit luckyMachine;



    public OneHandBanditView(OneHandBandit luckyMachine) {
        this.luckyMachine = luckyMachine;
        playButton = new JButton("Play");
        playButton.addActionListener(this);

        addButton = new JButton("Add Toy");
        addButton.addActionListener(this);

        toyNameField = new JTextField(10);
        toyQtyField = new JTextField(10);
        toyPercentageField = new JTextField(10);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(new JLabel("Toy Name:"));
        panel.add(toyNameField);
        panel.add(new JLabel("Toy Qty:"));
        panel.add(toyQtyField);
        panel.add(new JLabel("Toy Percentage:"));
        panel.add(toyPercentageField);
        panel.add(addButton);
        panel.add(playButton);

        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playButton) {
            try {
                luckyMachine.clickPlayButton();
                String message = "Выпал лот под номером " + luckyMachine.getWinNumber() +": "+ luckyMachine.getWinName()+ "\n" ;
                JOptionPane.showMessageDialog(this, message, "Результат", JOptionPane.INFORMATION_MESSAGE);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == addButton) {
            String name = toyNameField.getText();
            int qty = Integer.parseInt(toyQtyField.getText());
            int percentage = Integer.parseInt(toyPercentageField.getText());
            Toy toy = new Toy(name, qty, percentage);
            luckyMachine.addToy(toy);
            String message = "Добавлена игрушка " + name + "\n";
            JOptionPane.showMessageDialog(this, message, "Результат", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
