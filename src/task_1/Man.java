package task_1;

public class Man extends Human {

    private int lenght;

    public Man(String name, int height, int weight, String phrase, String prefer, int lenght, String hi) {
        super(name, height, weight, phrase, prefer,hi);
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int manSize) {
        this.lenght = lenght;
    }

    @Override
    public void parameters() {
        System.out.println("weight: " + getWeight() + " / hieght: " + getHeight() + " / penis lenght: " + getLenght());
    }
}
