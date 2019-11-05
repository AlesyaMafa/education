package task_1;

public class WomanBoobs extends Woman{

    public String phrase = "(.)(.)";

    public WomanBoobs(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println(this.name + " says: " + this.phrase);
    }
}
