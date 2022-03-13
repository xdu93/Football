public class Ceremony {
    public static void main(String[] args) {

        //Старт церемонии
        System.out.println("The ceremony of Team of the year start right now!!!");
        System.out.println("__________");

        //Инициализация
        FootballTeam goalkeeper = new Goalkeeper("Juventus", "Tourine", "Buffon");
        FootballTeam defenders = new Defenders("Arsenal", "London",
                                                    new String[] {"Bellerin", "Vermaelen", "Tearny", "White"});
        FootballTeam midefielders = new Midefielders("Barcelona", "Barcelona",
                                                    new String[] {"Xavi", "Iniesta", "Busquets"});
        FootballTeam strikers = new Strikers("Real Madrid", "Madrid",
                                                    new String[] {"Ronaldo", "Benzema", "Baile"});

        //Вывод информации по каждому типу игроков
        for (FootballTeam t:new FootballTeam[] {goalkeeper, defenders, midefielders, strikers}) {
            t.print();
        }

        //Команда года
        FootballTeam teamOfTheYear = new FootballTeam(goalkeeper.getName(), defenders.getNamesOfPlayers(),
                                        midefielders.getNamesOfPlayers(), strikers.getNamesOfPlayers());
        System.out.println("This is team of the 2022 year!!!");
        teamOfTheYear.print();
    }
}
