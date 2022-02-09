package LeagueSimulations;

import MatchResultGenerators.SoccerMatchResultGenerator;
import java.util.Collections;

public class SoccerLeagueSimulation extends LeagueSimulation {
    SoccerMatchResultGenerator resultGenerator = new SoccerMatchResultGenerator();
    public SoccerLeagueSimulation(int teams) {
        this.teams = teams;
    }

    
    @Override
    public void simulate() {
        for(int i=0; i<teams; i++){
            clasificacion.add(i, 0);
        }
        simulate_round();
        simulate_round();
        Collections.sort(clasificacion, Collections.reverseOrder());
    }
    
    private void simulate_round(){
        for(int i=0; i<teams-1; i++){
            for(int j=i+1; j<teams; j++){
                res = resultGenerator.getResult();
                switch(res){
                        case 0:
                            clasificacion.set(i, clasificacion.get(i) + 3);
                            break;
                        case 1:       
                            clasificacion.set(i, clasificacion.get(i) + 1);
                            clasificacion.set(j, clasificacion.get(j) + 1);
                            break;
                        default:
                            clasificacion.set(j, clasificacion.get(j) + 3);
                            break;
                }            
            }
        }
    }

}
