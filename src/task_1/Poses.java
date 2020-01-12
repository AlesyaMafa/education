package task_1;

public class Poses {

    private String poseName;
    private String howToDoIt;
    private String why;

    public Poses(String poseName, String howToDoIt, String why){
        this.poseName = poseName;
        this.howToDoIt = howToDoIt;
        this.why = why;
    }

    public void setPoseName(String poseName) {
        this.poseName = poseName;
    }

    public String getPoseName() {
        return poseName;
    }

    public void setHowToDoIt(String howToDoIt) {
        this.howToDoIt = howToDoIt;
    }

    public String getHowToDoIt() {
        return howToDoIt;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public String getWhy() {
        return why;
    }

    public void descrOutput () {
        System.out.println(getPoseName());
        System.out.println("How To Do It: " + getHowToDoIt());
        System.out.println("Why: " + getWhy());
    }

}
