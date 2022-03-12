public class Defenders extends FootballTeam {
    private String[] namesOfPlayers;

    public Defenders(String teamName, String originCity, String[] names) {
        super(teamName, originCity);
        this.namesOfPlayers = names;
    }

    @Override
    public void print() {
        System.out.println("We are defenders of " + super.getName() + " from " + super.getOriginCity());

        System.out.println("Our names:");
        for (int i = 0; i < this.namesOfPlayers.length; i++) {
            System.out.println(namesOfPlayers[i]);
        }
        System.out.println("__________");
    }

    @Override
    public String[] getNamesOfPlayers() {
        return namesOfPlayers;
    }
}
