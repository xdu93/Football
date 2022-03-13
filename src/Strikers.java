public class Strikers extends FootballTeam implements Skillable{
    private String[] namesOfPlayers;

    public Strikers(String teamName, String originCity, String[] namesOfPlayers) {
        super(teamName, originCity);
        this.namesOfPlayers = namesOfPlayers;
    }

    @Override
    public void print() { System.out.println(this); }

    @Override
    public String[] getNamesOfPlayers() {
        return namesOfPlayers;
    }

    @Override
    public String toString() {
        String str = "We are strikers of " + super.getName() + " from " + super.getOriginCity() + '\n'
                + "Our names: " + '\n';
        for (int i = 0; i < this.namesOfPlayers.length; i++) { str += namesOfPlayers[i] + '\n'; }
        return str;
    }

    @Override
    public void skill() {
        System.out.println("Our skill: We can score the goal");
        System.out.println("__________");
    }

}
