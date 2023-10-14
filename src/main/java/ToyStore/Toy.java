package ToyStore;

import java.util.Objects;

public class Toy {
    private String name;
    private int qty;
    private int percentage;


    public void setQty(int qty) {
        this.qty = qty;
    }

    public Toy(String name, int qty, int percentage) {

        this.name = name;
        this.qty = qty;
        this.percentage = percentage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public void increaseQty(){
        this.qty = this.qty+ 1;
    }

    public void decreaseQty() {
        if (this.qty > 0) {
            setQty(this.qty - 1);
        } else {
            System.out.println("Недостаточно запасов игрушек");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Objects.equals(name, toy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + this.name + '\'' +
                ", qty=" + this.qty +
                ", percentage=" + this.percentage +
                '}';
    }
}
