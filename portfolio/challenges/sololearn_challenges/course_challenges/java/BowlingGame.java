/* 
The program iterates through a HashMap and returns the player with the highest score

Finished 8/19/21 
*/

package sololearn_challenges.course_challenges.java;

import java.util.*; 

class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    public void getWinner(Map<String, Integer> playerMap)
    {
        int max = Collections.max(new ArrayList<Integer>(playerMap.values()));
        for (Map.Entry<String, Integer> m : playerMap.entrySet()){
            if (m.getValue() == max){
                System.out.println(m.getKey());
            }
        }
    }
    
}

public class BowlingGame {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner(game.players);
        sc.close();
    }
}
