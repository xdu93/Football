public class Strikers extends FootballTeam {
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
        str += "__________" + '\n';
        return str;
    }
}
