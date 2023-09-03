package OOP2.Creations;

public class Cat extends EntityClass{

    private String name;
    private Double maxJump;
    private int maxLength;


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public Cat(String name, Double maxJump, int maxLength) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxLength = maxLength;

    }


    @Override
    public boolean run(int length) {
        if (length>this.maxLength){
            return false;
        } else return true;
    }

    @Override
    public boolean jump(Double height) {
        if (height>this.maxJump){
            return false;
        } else return true;
    }

    @Override
    public boolean breathe() {
        return true;
    }
}
