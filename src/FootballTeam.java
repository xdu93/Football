import java.util.Arrays;

public class FootballTeam {
    private String teamName;
    private String originCity;
    private String[] namesOfTheYearPlayers = new String[11];

    public FootballTeam(String teamName, String originCity) {
        this.teamName = teamName;
        this.originCity = originCity;
    }

    public FootballTeam(String goalkeeperName, String[] defendersNames, String[] miedfieldersNames, String[] strikersNames) {
        this.teamName = "Team of the year";
        this.originCity = "";
        namesOfTheYearPlayers[0] = goalkeeperName;
        for (int i = 1; i < 5; i++) {
            namesOfTheYearPlayers[i] = defendersNames[i-1];
        }
        for (int i = 5; i < 8; i++) {
            namesOfTheYearPlayers[i] = miedfieldersNames[i-5];
        }
        for (int i = 8; i < 11; i++) {
            namesOfTheYearPlayers[i] = strikersNames[i-8];
        }

    }

    public void print() {
        System.out.println("This is football team of the 2022 year!!!");
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
