package CompexCalculator;

public class Controller {

    BasicCalculator calculator;
    View view;
    public Controller(BasicCalculator calculator, View view){
        this.calculator=calculator;
        this.view = view;
    }

    public void start(){

        ComplexNumber firstValue = (ComplexNumber) view.inputValue("First");
        System.out.println("Введено число: " + firstValue.toString());
        ComplexNumber secondValue = (ComplexNumber) view.inputValue("Second");
        System.out.println("Введено число: " + secondValue.toString());
        calculator.setMethod(view.inputOperand());
        view.showResult(calculator.calculate(firstValue, secondValue));
    }


}
