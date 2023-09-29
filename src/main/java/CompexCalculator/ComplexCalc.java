package CompexCalculator;
// Класс для  калькулятора комплексных чисел
public class ComplexCalc implements BasicCalculator{

    private String method;

    @Override
    public ComplexNumber sum(Object aComplex, Object bComplex) {

        ComplexNumber first = (ComplexNumber) aComplex;
        ComplexNumber second = (ComplexNumber) bComplex;

        double a = first.getA();
        double b = first.getB();

        double c = second.getA();
        double d = second.getB();

        ComplexNumber sum = new ComplexNumber((a+c), (b+d));
        return sum;
    }

    @Override
    public ComplexNumber div(Object aComplex, Object bComplex) {
        ComplexNumber first = (ComplexNumber) aComplex;
        ComplexNumber second = (ComplexNumber) bComplex;

        double a = first.getA();
        double b = first.getB();

        double c = second.getA();
        double d = second.getB();


        try {
            ComplexNumber div = new ComplexNumber((a*c+b*d)/(c*c+d*d), (b*c-a*d)/(c*c+d*d));
            return div;
        } catch (ArithmeticException e){
            System.out.println("Такое число делить нельзя");
            return null;
        }

    }

    @Override
    public ComplexNumber mult(Object aComplex, Object bComplex) {
        ComplexNumber first = (ComplexNumber) aComplex;
        ComplexNumber second = (ComplexNumber) bComplex;

        double a = first.getA();
        double b = first.getB();

        double c = second.getA();
        double d = second.getB();

        ComplexNumber mult = new ComplexNumber((a*c-b*d), (a*d+b*c));
        return mult;
    }

    @Override
    public ComplexNumber calculate(Object aComplex, Object bComplex) {
        ComplexNumber result = null;
        ComplexNumber first = (ComplexNumber) aComplex;
        ComplexNumber second = (ComplexNumber) bComplex;

            String method = this.method;


            switch (method) {
                case ("+"):
                    result = sum(first,second);
                    break;
                case ("*"):
                    result = mult(first,second);
                    break;
                case ("/"):
                    result = div(first,second);
                    break;
                default:
                    System.out.println("Неверный ввод");
                    break;
            }
            return result;
    }

    public void setMethod(String method) {
        this.method = method;
    }

}
