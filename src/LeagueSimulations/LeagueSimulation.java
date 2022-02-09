package LeagueSimulations;

import java.util.ArrayList;
import java.util.List;

public abstract class LeagueSimulation {
    int teams;
    List <Integer> clasificacion = new ArrayList<>();
    int res;
    public abstract void simulate();
    
    public int getPointsOf(int position){
        return clasificacion.get(position - 1);
    }
    
    public void viewResults(){
        for(int i=1; i<teams+1; i++){
            System.out.println("Clasificado número " + i + " ==> " + clasificacion.get(i-1) + " puntos.");
        }
    }
}
