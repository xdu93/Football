public class Strikers extends FootballTeam {
    public String[] strikersNames;

    public Strikers(String teamName, String originCity, String[] strikersNames) {
        super(teamName, originCity);
        this.strikersNames = strikersNames;
    }

    @Override
    public void print() {
        System.out.println("We are strikers of " + super.getName() + " from " + super.getOriginCity());

        System.out.println("Our names:");
        for (int i = 0; i < this.strikersNames.length; i++) {
            System.out.println(strikersNames[i]);
        }
        System.out.println("__________");
    }

    @Override
    public String[] getPlayersNames(){
        return strikersNames;
    }
}
