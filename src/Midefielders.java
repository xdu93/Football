public class Midefielders extends FootballTeam {
    public String[] midfieldersNames;

    public Midefielders(String teamName, String originCity, String[] midfieldersNames) {
        super(teamName, originCity);
        this.midfieldersNames = midfieldersNames;
    }

    @Override
    public void print() {
        System.out.println("We are midfielders of " + super.getName() + " from " + super.getOriginCity());

        System.out.println("Our names:");
        for (int i = 0; i < this.midfieldersNames.length; i++) {
            System.out.println(midfieldersNames[i]);
        }
        System.out.println("__________");
    }

    @Override
    public String[] getPlayersNames(){
        return midfieldersNames;
    }
}
