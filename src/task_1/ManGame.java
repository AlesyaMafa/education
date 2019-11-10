package task_1;

public class ManGame extends Man {

    private String prefer = "Minecraft and WoW!";

    public ManGame(String name) {
        super(name);
    }

    @Override
    public void prefer() {
        System.out.println("I like " + this.prefer);
    }
}
