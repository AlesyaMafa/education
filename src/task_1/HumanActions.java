package task_1;

public class HumanActions implements Actions  {
    @Override
    public void say(Human human) {
        System.out.println(human.getName() + " says: " + human.getPhrase());
    }

    @Override
    public void prefer(Human human) {
        System.out.println("I like " + human.getPrefer());
    }

    @Override
    public void greeting(Human human) {
        System.out.println("I am " + human.getName() + "." + human.getHi());
    }
}
