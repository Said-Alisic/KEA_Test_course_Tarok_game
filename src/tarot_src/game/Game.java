package tarot_src.game;

import java.util.ArrayList;
import java.util.Scanner;

import tarot_src.models.Card;
import tarot_src.models.Player;

public class Game {

    private static Scanner scn = new Scanner(System.in);

    public static ArrayList<Player> createPlayers() {
        ArrayList<Player> players = new ArrayList<>(3);
        for(int i = 0; i < 3; i++) {
            Player player = new Player();
            player.setPlayerId(i+1);
            System.out.println("Write player name: ");
            player.setPlayerName(scn.next());
            players.add(player);
        }
        return players;
    }

    public static void updatePlayerScore(Player player, int points) {
        player.addPoints(announcementPoints(points));

    }

    // Implementing player announce game logic as dummy implementation
    // for week 2 assignment
    private static int announcementPoints(int announcement) {
        switch(announcement)
        {
            case 1: // 10 tarots
                return 10;
            case 2: // 3 matadors
                return 10;
            case 3: // half kings
                return 5;
            case 4: // full kings
                return 10;
            case 5: // overfull kings
                return 15;
            case 6: // half cavalry
                return 5;
            case 7: // full cavalry
                return 10;
            case 8: // overfull cavalry
                return 15;
            default:
                System.exit(0);
                return 0;
        }
    }

    // This is not necessary for week 2 assignment
//    public static ArrayList<Card> createCards() {
//        ArrayList<Card> cards = new ArrayList<>(78);
//        //Card card;
//        for(int i = 0; i < 78; i++) {
//
//            if(i < 22) {
//                //card = new Card();
//            } else {
//                //card = new Card();
//            }
//            //cards.add(card);
//        }
//        return cards;
//    }

}
