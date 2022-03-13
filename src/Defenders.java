import java.util.Arrays;

public class Defenders extends FootballTeam {
    private String[] namesOfPlayers;

    public Defenders(String teamName, String originCity, String[] names) {
        super(teamName, originCity);
        this.namesOfPlayers = names;
    }

    @Override
    public void print() { System.out.println(this);}

    @Override
    public String[] getNamesOfPlayers() { return namesOfPlayers; }

    @Override
    public String toString() {
        String str = "We are defenders of " + super.getName() + " from " + super.getOriginCity() + '\n'
                + "Our names: " + '\n';
        for (int i = 0; i < this.namesOfPlayers.length; i++) { str += namesOfPlayers[i] + '\n'; }
        str += "__________" + '\n';
        return str;
    }
}
