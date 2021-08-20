package assignments.java.phrase_solver_experimental.src;

import assignments.java.phrase_solver_experimental.src.game.*; //Phrase, Player, and PhraseSolver classes

public class Main {

    public static void main(String[] args) throws Exception {

        PhraseSolver game = new PhraseSolver();

        game.init();

        while(!game.getSolved()){ //Gameplay
            game.getPlayers().get(game.getPlaying()).incScore(game.takeTurn(game.getGamePhrase().getPhrase()));
            if (game.getPlaying() == game.getPlayerPosition() - 1){
                game.setPlaying(0);
            } else{
                game.incPlaying(1);
            }
        }
        
        game.endGame();
    }
}
