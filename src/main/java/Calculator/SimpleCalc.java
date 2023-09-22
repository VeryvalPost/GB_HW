package Calculator;

public class SimpleCalc implements BasicCalculator{
    private Double a;
    private Double b;
    private String method;

    public SimpleCalc() {
    }


    @Override
    public Double calculate() {
    Double result = null;
    Double a = this.a;
    Double b = this.b;
    String method = this.method;


        switch (method) {
            case ("+"):
                result = a+b;
                break;
            case ("-"):
                result = a-b;
                break;
            case ("*"):
                result = a*b;
                break;
            case ("/"):
                if (b != 0)
                {
                result = a/b;
                } else System.out.println("Деление на ноль недопустимо");
                break;
            default:
                System.out.println("Неверный ввод");
                break;
        }
        return result;
    }


    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
