package Main;

import LeagueSimulations.LeagueSimulation;
import LeagueSimulations.SoccerLeagueSimulation;
import MatchResultGenerators.SoccerMatchResultGenerator;

public class Main {
    
    public static void main(String[] args) {
    
        SoccerMatchResultGenerator s = new SoccerMatchResultGenerator();
        LeagueSimulation soccer_league_1 = new SoccerLeagueSimulation(20);
        //for (int i = 1; i < 21; i++) {
        //    soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Team " + i, 0));
        //}
        //soccer_league_1.simulate();
        //soccer_league_1.viewResults();
        
        
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Barcelona", 0.95));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Atlético", 0.85));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Sevilla", 0.65));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Madrid", 0.99));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Tenerife", -0.99));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Albacete", -0.99));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Villarreal", 0.4));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Betis", 0.2));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Valladolid", -0.9));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Eibar", -0.99));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Girona", -0.85));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Las Palmas", -0.9));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Celta", -0.4));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Getafe", -0.5));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Mallorca", -0.65));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Athletic", 0.55));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Levante", -0.7));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Cadiz", -0.8));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Valencia", 0.4));
        soccer_league_1.teams.add(TeamsCreator.createSoccerTeam("Real Sociedad", 0.5));
        soccer_league_1.simulate();
        soccer_league_1.viewResults();
        //Team t = new SoccerTeam(" ", 2);
        /*
        double media = 0;
        for (int i = 0; i < 100000; i++) {
        PadelLeagueSimulation padel_league_1 = new PadelLeagueSimulation(12);
        padel_league_1.simulate();
        media += padel_league_1.getPointsOf(6);
        }
        double sixth_points = media/100000;
        //padel_league_1.viewResults();
        //int sixth_points = padel_league_1.getPointsOf(6);
        System.out.println("Sexto clasificado ==> " + sixth_points + " puntos");
        SoccerLeagueSimulation soccer_league_1 = new SoccerLeagueSimulation(20);
        soccer_league_1.simulate();
        soccer_league_1.viewResults();
        int safe_zone = soccer_league_1.getPointsOf(17);
        System.out.println("Fueron necesarios " + safe_zone + " puntos para evitar el descenso");
        /*
        double media = 0;
        for (int i = 0; i < 10000000; i++) {
        media += sexta_posicion_simulacion();
        }
        media = media/10000000;
        System.out.println("La media es de " + media + " puntos.");
         */
    }
    
    
    
}
