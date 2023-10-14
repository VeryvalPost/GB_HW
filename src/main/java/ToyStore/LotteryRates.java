package ToyStore;

public class LotteryRates {
    private int id;
    private String name;
    private int startRate;
    private int stopRate;

    public LotteryRates(int id, String name, int startRate, int stopRate) {
        this.id = id;
        this.name = name;
        this.startRate = startRate;
        this.stopRate = stopRate;
    }


    public int getStartRate() {
        return startRate;
    }


    public int getStopRate() {
        return stopRate;
    }

    public int getId() {
        return id;
    }
    public boolean isInRange (int winValue) {
        if ((winValue<=stopRate)&&(winValue>=startRate)){
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "TableRates{" +
                "id=" + id +
                ", name=" + name +
                ", startRate=" + startRate +
                ", stopRate=" + stopRate +
                '}';
    }


    public String getName() {
        return name;
    }
}
