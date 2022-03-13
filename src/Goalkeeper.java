public class Goalkeeper extends FootballTeam implements Skillable{
    private String name;

    public Goalkeeper(String teamName, String originCity, String namesOfPlayers) {
        super(teamName, originCity);
        this.name = namesOfPlayers;
    }

    @Override
    public void print() { System.out.println(this);}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "I am goalkeeper of " + super.getName() + " from " + super.getOriginCity() + '\n' +
                "My name is " + name + '\n';
    }

    @Override
    public void skill() {
        System.out.println("My skill: I can catch the ball");
        System.out.println("__________");
    }

}
