package Calculator;

public interface ComplexCalculator {
    abstract ComplexNumber calculate();
    public void setA(ComplexNumber a);
    public void setB(ComplexNumber b);
    public void setMethod(String method);

}
