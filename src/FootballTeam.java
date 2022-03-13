import java.util.Arrays;

public class FootballTeam {
    private String teamName;
    private String originCity;
    private String[] namesOfPlayers = new String[11];

    //Коструктор команды
    public FootballTeam(String teamName, String originCity) {
        this.teamName = teamName;
        this.originCity = originCity;
    }

    //Конструктор команды года
    public FootballTeam(String goalkeeperName, String[] defendersNames, String[] miedfieldersNames, String[] strikersNames) {
        this.teamName = "Team of the year";
        this.originCity = "Europe";
        namesOfPlayers[0] = goalkeeperName;

        for (int i = 1; i < defendersNames.length + 1; i++) {
            namesOfPlayers[i] = defendersNames[i - 1];
        }
        for (int i = defendersNames.length + 1; i < defendersNames.length + miedfieldersNames.length + 1; i++) {
            namesOfPlayers[i] = miedfieldersNames[i - (defendersNames.length + 1)];
        }
        for (int i = defendersNames.length + miedfieldersNames.length + 1;
             i < defendersNames.length + miedfieldersNames.length + strikersNames.length + 1; i++) {
            namesOfPlayers[i] = strikersNames[i - (defendersNames.length + miedfieldersNames.length + 1)];
        }
    }

    public String getOriginCity() {
        return originCity;
    }

    public String getName() {
        return teamName;
    }

    public String[] getNamesOfPlayers() { return namesOfPlayers;}

   public void print() { System.out.println(this); }

    @Override
    public String toString() { return Arrays.toString(namesOfPlayers) ; }
}
