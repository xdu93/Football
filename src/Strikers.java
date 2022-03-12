public class Strikers extends FootballTeam {
    private String[] names;

    public Strikers(String teamName, String originCity, String[] names) {
        super(teamName, originCity);
        this.names = names;
    }

    @Override
    public void print() {
        System.out.println("We are strikers of " + super.getName() + " from " + super.getOriginCity());

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
