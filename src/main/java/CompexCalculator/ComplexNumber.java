package CompexCalculator;

public class ComplexNumber {
    private double a;
    private double b;
    private String imagine = "i";



    public ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public String getImagine(){
        return imagine;
    }



    @Override
    public String toString() {
        if (b>=0){
            return   "("+ (int)a + " + "+ (int)b + imagine+ ")";
        } else return   "("+ (int)a + (int)b + imagine+ ")";

    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }


}
