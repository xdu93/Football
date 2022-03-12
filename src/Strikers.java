public class Strikers extends FootballTeam {
    private String[] namesOfPlayers;

    public Strikers(String teamName, String originCity, String[] namesOfPlayers) {
        super(teamName, originCity);
        this.namesOfPlayers = namesOfPlayers;
    }

    @Override
    public void print() {
        System.out.println("We are strikers of " + super.getName() + " from " + super.getOriginCity());

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
