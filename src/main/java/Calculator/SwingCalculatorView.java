package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
public class SwingCalculatorView extends JFrame implements View {
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JComboBox<String> comboBoxMethod;
    private JButton calculateButton;
    private JLabel resultLabel;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel methodLabel;

    private BasicCalculator calculator;

    public SwingCalculatorView(BasicCalculator calculator) {
        this.calculator = calculator;
        initializeComponents();
        addComponentsToFrame();
        setListeners();
        setTitle("Window Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void initializeComponents() {
        textFieldA = new JTextField(30);
        textFieldB = new JTextField(30);
        comboBoxMethod = new JComboBox<>(new String[]{"+", "-", "*", "/"});
        calculateButton = new JButton("Close");
        resultLabel = new JLabel("Result: ");
        aLabel = new JLabel("");
        bLabel = new JLabel("");
        methodLabel = new JLabel("");
    }

    private void addComponentsToFrame() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("A: "));
        panel.add(aLabel);
        panel.add(new JLabel("Method: "));
        panel.add(methodLabel);
        panel.add(new JLabel("B: "));
        panel.add(bLabel);
        panel.add(calculateButton);
        panel.add(resultLabel);
        add(panel);
    }

    private void setListeners() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // закрываем текущее окно

            }
        });
    }

    @Override
    public void showResult(Double calculate) {
        resultLabel.setText("Result: " + calculate);
    }

    @Override
    public Double inputValue(String name) {
        String input = JOptionPane.showInputDialog("Enter value for " + name + ":");
        if (name.equals("A")) {
            aLabel.setText(input);

        } else if (name.equals("B")) {
            bLabel.setText(input);
        }
        return Double.parseDouble(input);
    }

    @Override
    public String inputOperand() {
        String[] options = {"+", "-", "*", "/"};
        String input = (String) JOptionPane.showInputDialog(null, "Select operand:", "Operand", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        methodLabel.setText(input);
        return  input;
    }
}

*/
