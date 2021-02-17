package tarot_src;

import org.junit.Test;
import tarot_src.game.Game;
import tarot_src.models.Player;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    private static Scanner scn = new Scanner(System.in);  // Create a Scanner object
    private static Game game = new Game();

    public static void main(String[] args) {

        displayPlayers(game);
        System.out.println("-- Dealing cards to players --");

        int playerTurn = 1;
        while (true) {
            System.out.println();

        }

    }


    @Test
    private static void displayPlayers(Game game) {

        ArrayList<Player> players = game.createPlayers();
        System.out.println("Current players: ");
        for(int i = 0; i < 3; i++) {
            System.out.println("PlayerID: " + players.get(i).getPlayerId() + "Name: " + players.get(i).getPlayerName());
        }
    }

    private static void promptAnnouncement() {

    }



}