package Calculator;

public class Controller {

    BasicCalculator calculator;
    View view;
    public Controller(BasicCalculator calculator, View view){
        this.calculator=calculator;
        this.view = view;
    }

    public void start(){
        calculator.setA(view.inputValue("A"));
        calculator.setMethod(view.inputOperand());
        calculator.setB(view.inputValue("B"));
        view.showResult(calculator.calculate());
    }


}
