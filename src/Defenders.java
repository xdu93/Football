public class Defenders extends FootballTeam {
    private String[] names;

    public Defenders(String teamName, String originCity, String[] names) {
        super(teamName, originCity);
        this.names = names;
    }

    @Override
    public void print() {
        System.out.println("We are defenders of " + super.getName() + " from " + super.getOriginCity());

        System.out.println("Our names:");
        for (int i = 0; i < this.names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("__________");
    }

    @Override
    public String[] getPlayersNames(){
        return names;
    }
}
