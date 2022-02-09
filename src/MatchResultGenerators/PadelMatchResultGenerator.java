package MatchResultGenerators;

public class PadelMatchResultGenerator extends MatchResultGenerator{
    
    @Override
    public int getResult(){ //Returns points of the local team (0, 1, 2 or 3)
        return (int) Math.floor(Math.random()*4.0);
    }
}
