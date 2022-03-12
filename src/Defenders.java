public class Defenders extends FootballTeam {
    public String[] defendersNames;

    public Defenders(String teamName, String originCity, String[] defendersNames) {
        super(teamName, originCity);
        this.defendersNames = defendersNames;
    }

    @Override
    public void print() {
        System.out.println("We are defenders of " + super.getName() + " from " + getOriginCity());

        System.out.println("Our names:");
        for (int i = 0; i < this.defendersNames.length; i++) {
            System.out.println(defendersNames[i]);
        }
        System.out.println("__________");
    }

    @Override
    public String[] getPlayersNames(){
        return defendersNames;
    }
}
