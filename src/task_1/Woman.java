package task_1;

public class Woman extends Human{

    private int Size;

    public Woman(String name, int height, int weight, String phrase, String prefer, int Size, String hi) {
        super(name, height, weight, phrase, prefer, hi);
        this.Size = Size;
    }

    public int getSize() {
        return Size;
    }

    public void setWomanSize(int womanSize) {
        this.Size = womanSize;
    }

    @Override
    public void parameters() {
        System.out.println("weight: " + getWeight() + " / hieght: " + getHeight() + " / penis lenght: " + getSize());
    }

}
