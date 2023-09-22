package Calculator;

public class Main {
    public static void main(String[] args) {

        // Запуск консольного интерфейса калькулятора.
        View view = new SimpleView();
        BasicCalculator calculator = new SimpleCalc();
        Controller controller = new Controller(calculator,view);
       controller.start();

        // Замена на другой интерфейс калькулятора.
        View Jview = new SwingCalculatorView(calculator);
        Controller Jcontroller = new Controller(calculator,Jview);
        Jcontroller.start();

    }

}
