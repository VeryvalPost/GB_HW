package OOP2.Creations;

public class Robot extends Humanoid{

    protected String name;
    protected String model;
    protected String type;


    @Override
    public void run(int length) {

    }

    @Override
    public void jump(int heigth) {
        System.out.println("Не могу прыгать");
    }
}
