package Calculator;

public class ComplexNumber {
    private double a;
    private double b;
    private final double ICONST = Math.pow(-1,0.5);



    public ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getReal(){
        return a;
    }

    public double getImaginary(){
        return b*ICONST;
    }


    @Override
    public String toString() {
        return   a+"" + ICONST+ b;
    }
}
