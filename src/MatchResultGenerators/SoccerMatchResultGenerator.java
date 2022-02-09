package MatchResultGenerators;

public class SoccerMatchResultGenerator extends MatchResultGenerator{
    
    @Override
    public int getResult(){ //Returns result of the match (0 = winA, 1 = draw, 2 = winB)
        return (int) Math.floor(Math.random()*3.0);
    }

}
