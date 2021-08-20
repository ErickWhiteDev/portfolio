package assignments.java.phrase_solver_experimental.src.game.setup;

public class Player {
    
    private String name;
    private int score;

    public Player(String name){
        this.name = name;
        this.score = 0;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public void incScore(int pointValue){
        score += pointValue;
    }
}
