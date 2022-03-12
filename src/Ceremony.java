public class Ceremony {
    public static void main(String[] args) {

        String[] defendersOfTheYear = {"Bellerin", "Vermaelen", "Tearny", "White"};
        String[] midfieldersOfTheYear = {"Xavi", "Iniesta", "Busquets"};
        String[] strikersOfTheYear = {"Ronaldo", "Benzema", "Baile"};

        System.out.println("The ceremony of Team of the year start right now!!!");

        FootballTeam goalkeeper= new Goalkeeper("Juventus", "Tourine", "Buffon");
        FootballTeam defenders = new Defenders("Arsenal", "London", defendersOfTheYear);
        FootballTeam midefielders = new Midefielders("Barcelona", "Barcelona", midfieldersOfTheYear);
        FootballTeam strikers = new Strikers("Real Madrid", "Madrid", strikersOfTheYear);

        goalkeeper.print();
        defenders.print();
        midefielders.print();
        strikers.print();

        FootballTeam teamOfTheYear = new FootballTeam(goalkeeper.getName(), defenders.getPlayersNames(),
                                                        midefielders.getPlayersNames(), strikers.getPlayersNames());
        teamOfTheYear.print();

    }
}
