abstract public class Coachs implements Skillable{
    String name;
    String position;

    @Override
    public String toString() {
        return "I am " + position + " my name is " + getName();
    }

    public String getName() { return name; }
}
