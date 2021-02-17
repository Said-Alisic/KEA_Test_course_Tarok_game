package tarot_src.models;

public class Player {

    // Attributes
    private int playerId;
    private String playerName;
    private int points = 100;

    // Constructor
    public Player(int playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPoints() {
        return this.points;
    }

    public void addPoints(int addition) {
        this.points = this.points - addition;
    }

    public void subtractPoints(int subtraction) {
        this.points = this.points - subtraction;
    }
}
