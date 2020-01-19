package task_1;

public class Woman extends Human{

    private int Size;

    public Woman(String name, int height, int weight, String phrase, String prefer, int Size) {
        super(name, height, weight, phrase, prefer);
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
        System.out.println("My parameters.");
        System.out.println("weight: " + getWeight() + " / hieght: " + getHeight() + " / boobs size: " + getSize());
    }

}
