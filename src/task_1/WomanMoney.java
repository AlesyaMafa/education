package task_1;

public class WomanMoney extends Woman {

    private String phrase = "where is the money!?";

    public WomanMoney(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println(this.name + " says: " + this.phrase);
    }
}