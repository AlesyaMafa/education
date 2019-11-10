package task_1;

public class ManProg extends Man {

    private String prefer = "OOP and Java!";

    public ManProg(String name) {
        super(name);
    }

    @Override
    public void prefer() {
        System.out.println("I like " + this.prefer);
    }
}
