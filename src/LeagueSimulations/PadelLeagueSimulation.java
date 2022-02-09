package LeagueSimulations;

import LeagueSimulations.LeagueSimulation;
import MatchResultGenerators.PadelMatchResultGenerator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PadelLeagueSimulation extends LeagueSimulation{
    PadelMatchResultGenerator resultGenerator = new PadelMatchResultGenerator();
    
    public PadelLeagueSimulation(int teams) {
        this.teams = teams;
    }    
    
    
    @Override
    public void simulate(){
        
        for(int i=0; i<teams; i++){
            clasificacion.add(i, 0);
        }
        
        for(int i=0; i<teams-1; i++){
            for(int j= i+1; j<teams; j++){
                res = resultGenerator.getResult();
                clasificacion.set(i, clasificacion.get(i) + res);
                clasificacion.set(j, clasificacion.get(j) + 3 - res);
            }
        }
        
        Collections.sort(clasificacion, Collections.reverseOrder());
    }
}
