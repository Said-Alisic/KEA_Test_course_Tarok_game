package tarot_src;

import org.junit.Test;
import tarot_src.game.Game;
import tarot_src.models.Player;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    private static Scanner scn = new Scanner(System.in);  // Create a Scanner object
    private static Game game = new Game();

    @Test
    public static void main(String[] args) {

        ArrayList<Player> players = displayPlayers(game);
        System.out.println("-- Dealing cards to players --");
        int turn = 0;
        displayScore(players);
        while (true) {
            if(turn > 2) {
                turn = 0;
                displayScore(players);
            }
            promptAnnouncement(players.get(turn));
            turn++;
        }
    }

    @Test
    private static ArrayList<Player> displayPlayers(Game game) {
        ArrayList<Player> players = game.createPlayers();
        System.out.println("Current players: ");
        for(int i = 0; i < 3; i++) {
            System.out.println("PlayerID: " + players.get(i).getPlayerId() + "Name: " + players.get(i).getPlayerName());
        }
        return players;
    }

    @Test
    private static void promptAnnouncement(Player player) {

        System.out.println(" -- " + player.getPlayerName() + "\'s turn to announce!!! ");
        System.out.println(" -- Please announce one of the options below or enter 0 to exit.");
        displayOptions();
        int choice = scn.nextInt();
        game.updatePlayerScore(player, choice);
    }

    private static void displayOptions() {
        System.out.println("---------------------");
        System.out.println("10 tarots: 1");
        System.out.println("3 matadors: 2");
        System.out.println("Half kings: 3");
        System.out.println("Full kings: 4");
        System.out.println("Overfull kings: 5");
        System.out.println("Half cavalry: 6");
        System.out.println("Full cavalry: 7");
        System.out.println("Overfull cavalry: 8");
        System.out.println("EXIT SYSTEM: 0");
        System.out.println("---------------------");
    }
    private static void displayScore(ArrayList<Player> players) {
        System.out.println("-- Current Score --");
        System.out.println(players.get(0).getPlayerName() + ": " + players.get(0).getPoints());
        System.out.println(players.get(1).getPlayerName() + ": " + players.get(1).getPoints());
        System.out.println(players.get(2).getPlayerName() + ": " + players.get(2).getPoints());
        System.out.println("-------------------");
    }




}