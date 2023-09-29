package CompexCalculator;

public class Main {
    public static void main(String[] args) {

        // Запуск консольного интерфейса калькулятора.
        View view = new ComlexView();
        BasicCalculator calculator = new ComplexCalc();
        Controller controller = new Controller(calculator,view);
       controller.start();




    }

}
