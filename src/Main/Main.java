package Main;

import LeagueSimulations.LeagueSimulation;
import LeagueSimulations.PadelLeagueSimulation;
import LeagueSimulations.SoccerLeagueSimulation;

public class Main {
    
    public static void main(String[] args) {
    
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
        
        
        */
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
