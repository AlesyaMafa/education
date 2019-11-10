package task_1;

public class WomanDemo {
    public static void main(String[] args) {
        Woman w = new WomanBoobs("Ann");
        w.say();
        Woman w1 = new WomanMoney("Kate");
        w1.say();
        Woman w2 = new WomanResentment("Sara");
        w2.say();
        Man m1 = new ManGym("Adam");
        m1.say();
        m1.prefer();
        Man m2 = new ManProg("Karl");
        m2.say();
        m2.prefer();
        Man m3 = new ManGame("Tom");
        m3.say();
        m3.prefer();
    }
}
