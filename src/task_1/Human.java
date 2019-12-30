package task_1;

public abstract class Human implements Welcome {

    private String name;
    private int height;
    private int weight;
    private String phrase;
    private String prefer;
    private String hi;

    public Human(String name, int height, int weight, String phrase, String prefer, String hi) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.phrase = phrase;
        this.prefer = prefer;
        this.hi = hi;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setName(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPrefer() {
        return prefer;
    }

    public void setPrefer(String prefer) {
        this.prefer = prefer;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getHi() {
        return phrase;
    }

    public void setHi(String phrase) {
        this.hi = hi;
    }

    public abstract void parameters ();

    public void say () {
        System.out.println(getName() + " says: " + getPhrase());
    }

    public void prefer() {
        System.out.println("I like " + getPrefer());
    }

    public void greeting() {
        System.out.println("I am " + getName() + "." + getHi());
    }
}
