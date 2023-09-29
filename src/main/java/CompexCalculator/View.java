package CompexCalculator;

import Calculator.ComplexNumber;

public interface View <T>{

    public void showResult(T caluculate);

    public T inputValue(String name);

    public String inputOperand();
}
