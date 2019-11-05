package task_1;

public class WomanResentment extends Woman{

    public String phrase = "I was offended";

    public WomanResentment(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println(this.name + " says: " + this.phrase);
    }
}
