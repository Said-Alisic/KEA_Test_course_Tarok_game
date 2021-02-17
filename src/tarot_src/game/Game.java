package tarot_src.game;

import java.util.ArrayList;
import java.util.Scanner;
import tarot_src.models.Player;

public class Game {

    private static Scanner scn = new Scanner(System.in);

    public static ArrayList<Player> createPlayers() {
        ArrayList<Player> players = new ArrayList<>(3);


        for(int i = 0; i < 3; i++) {
            Player player = new Player();
            player.setPlayerId(i+1);
            player.setPlayerName(scn.next());
            players.add(player);

        }

        return players;
    }

}
