package OOP2.Creations;

public class Robot extends EntityClass{

    private String name;
    private Double maxJump;
    private int maxLength;

    public Robot(String name, Double maxJump, int maxLength) {
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
        return false;
    }

    @Override
    public boolean breathe() {
        return false;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }
}
