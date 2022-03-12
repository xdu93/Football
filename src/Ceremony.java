public class Ceremony {
    public static void main(String[] args) {

        //Списки игроков года, максимум 11 игроков
        String[] defendersOfTheYear = {"Bellerin", "Vermaelen", "Tearny", "White"};
        String[] midfieldersOfTheYear = {"Xavi", "Iniesta", "Busquets"};
        String[] strikersOfTheYear = {"Ronaldo", "Benzema", "Baile"};
        String goalkeeperOfTheYear = "Buffon";

        //Старт церемонии
        System.out.println("The ceremony of Team of the year start right now!!!");

        //Инициализация
        FootballTeam goalkeeper = new Goalkeeper("Juventus", "Tourine", goalkeeperOfTheYear);
        FootballTeam defenders = new Defenders("Arsenal", "London", defendersOfTheYear);
        FootballTeam midefielders = new Midefielders("Barcelona", "Barcelona", midfieldersOfTheYear);
        FootballTeam strikers = new Strikers("Real Madrid", "Madrid", strikersOfTheYear);

        //Вывод  информации по каждому классу игроков
        goalkeeper.print();
        defenders.print();
        midefielders.print();
        strikers.print();

        //Вывод команды года
        FootballTeam teamOfTheYear = new FootballTeam(goalkeeper.getName(), defenders.getPlayersNames(),
                midefielders.getPlayersNames(), strikers.getPlayersNames());
        teamOfTheYear.print();

    }
}
