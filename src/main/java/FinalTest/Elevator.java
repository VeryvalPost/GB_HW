package FinalTest;

public class Elevator {
    private int currentFloor;
    private int maxFloor;
    private int baseFloor;
    public Elevator() {
        maxFloor = 1;
        baseFloor = 1;
    }
    public Elevator(int maxFloor) {
        this.maxFloor = maxFloor;
        baseFloor = 1;
    }

    public Elevator(int maxFloor, int baseFloor) {
        this.maxFloor = maxFloor;
        this.baseFloor = baseFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }

    public int getBaseFloor() {
        return baseFloor;
    }

    public void setBaseFloor(int baseFloor) {
        this.baseFloor = baseFloor;
    }

    public void move(String move) {
        try {
            int intMove = Integer.parseInt(move);

        setCurrentFloor(intMove);
        if ((currentFloor>maxFloor)||(currentFloor<baseFloor)){
            System.out.println("Ошибка ввода, лифт не может добраться на этот этаж");
        } else {
            System.out.println("Лифт перемещен на " + currentFloor + "этаж");
        }

        } catch (NumberFormatException e){
            System.out.println("Введено что-то кроме номера этажа или комманды выхода");
        }
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "currentFloor=" + currentFloor +
                ", maxFloor=" + maxFloor +
                ", baseFloor=" + baseFloor +
                '}';
    }
}


