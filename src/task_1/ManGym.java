package task_1;

public class ManGym extends Man {

    private String prefer = "protein and exercise!";

    public ManGym(String name) {
        super(name);
    }

    @Override
    public void prefer() {
        System.out.println("I like " + this.prefer);
    }
}
