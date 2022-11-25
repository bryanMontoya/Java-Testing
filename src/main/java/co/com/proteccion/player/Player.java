package co.com.proteccion.player;

public class Player {

    private Dice dice;
    private int minToWin;

    public Player(Dice dice, int minToWin) {
        this.dice = dice;
        this.minToWin = minToWin;
    }

    public boolean play(){
        int roll = dice.roll();
        return roll> minToWin;
    }
}
