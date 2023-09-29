package CompexCalculator;
// Базовый класс для любого калькулятора
public interface BasicCalculator<T> {
    abstract T sum(T a, T b);
    abstract T div(T a, T b);
    abstract T mult(T a, T b);

    public void setMethod(String method);

    abstract T calculate(T a, T b);
}
