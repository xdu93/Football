public class Midefielders extends FootballTeam implements Skillable{
    private String[] namesOfPlayers;

    public Midefielders(String teamName, String originCity, String[] namesOfPlayers) {
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
        String str = "We are midefielders of " + super.getName() + " from " + super.getOriginCity() + '\n'
                + "Our names: " + '\n';
        for (int i = 0; i < this.namesOfPlayers.length; i++) { str += namesOfPlayers[i] + '\n'; }
        return str;
    }

    @Override
    public void skill() {
        System.out.println("Our skill: We can pass the ball");
        System.out.println("__________");
    }

}
