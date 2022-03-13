public class Coachs implements Skillable{
    private String name;
    public String position;

    public Coachs(String name , String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "I am " + position + " my name is " + getName() +'\n';
    }

    @Override
    public void skill() {
        System.out.println("My skill: I can train the team");
        System.out.println("__________");
    }

}
