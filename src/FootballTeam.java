import java.util.Arrays;

public class FootballTeam {
    private String teamName;
    private String originCity;
    private String[] namesOfTheYearPlayers = new String[11];

    //Коструктор команды
    public FootballTeam(String teamName, String originCity) {
        this.teamName = teamName;
        this.originCity = originCity;
    }

    //Конструктор команды года
    public FootballTeam(String goalkeeperName, String[] defendersNames, String[] miedfieldersNames, String[] strikersNames) {
        this.teamName = "Team of the year";
        this.originCity = "";
        namesOfTheYearPlayers[0] = goalkeeperName;

        for (int i = 1; i < defendersNames.length + 1; i++) {
            namesOfTheYearPlayers[i] = defendersNames[i - 1];
        }
        for (int i = defendersNames.length + 1; i < defendersNames.length + miedfieldersNames.length + 1; i++) {
            namesOfTheYearPlayers[i] = miedfieldersNames[i - (defendersNames.length + 1)];
        }
        for (int i = defendersNames.length + miedfieldersNames.length + 1;
             i < defendersNames.length + miedfieldersNames.length + strikersNames.length + 1; i++) {
            namesOfTheYearPlayers[i] = strikersNames[i - (defendersNames.length + miedfieldersNames.length + 1)];
        }
    }

    public void print() {
        System.out.println("This is team of the 2022 year!!!");
        System.out.println(Arrays.toString(this.getPlayersNames()));
    }

    public String getOriginCity() {
        return originCity;
    }

    public String getName() {
        return teamName;
    }

    public String[] getPlayersNames() {
        return namesOfTheYearPlayers;
    }
}
