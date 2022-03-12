public class Goalkeeper extends FootballTeam {
    private String name;

    public Goalkeeper(String teamName, String originCity, String namesOfPlayers) {
        super(teamName, originCity);
        this.name = namesOfPlayers;
    }

    @Override
    public void print() {
        System.out.println("I am goalkeeper of " + super.getName() + " from " + super.getOriginCity());
        System.out.println("My name is " + name);
        System.out.println("__________");
    }

    @Override
    public String getName() {
        return name;
    }
}
