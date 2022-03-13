public class Coach {
    private String name;
    public String position;

    public Coach(String name , String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "I am " + position + " my name is " + getName() +'\n' +
                "__________" + '\n';
    }
}
