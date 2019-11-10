package task_1;

public abstract class Man {

    protected String name;
    private String phrase = "I'm a man!";

    public Man(String name) {
        this.name = name;
    }

    public void say (){
            System.out.println(this.name + " says: " + this.phrase);
    }

    public abstract void prefer();
}
