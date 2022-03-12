public class Goalkeeper extends FootballTeam {
    public String goalkeeperName;

    public Goalkeeper(String teamName, String originCity, String goalkeeperName) {
        super(teamName, originCity);
        this.goalkeeperName = goalkeeperName;
    }

    @Override
    public void print() {
        System.out.println("I am goalkeeper of " + super.getName() + " from " + super.getOriginCity());
        System.out.println("My name is " + goalkeeperName);
        System.out.println("__________");
    }

    @Override
    public String getName() {
        return goalkeeperName;
    }
}
