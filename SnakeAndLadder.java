import java.util.Scanner;
import java.util.Random;

public class SnakeAndLadder {
    public static final int No_Play = 1;
    public static final int Ladder = 2;
    public static final int Snake = 3;
    public static final int Win_position = 100;
    public static final int Position_check = 0;
    public static final int START_POSITION = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to SnakeAndLadder program");
        boolean player1IsPlaying = true;
        int player1Position = START_POSITION, player2Position = START_POSITION, dieRoll, options, dieRolledTimes = 0;
        Random random = new Random();
        while (player1Position != Win_position && player2Position != Win_position) {
            dieRoll = random.nextInt(6) + 1;
            dieRolledTimes++;
            options = random.nextInt(3) + 1;

            switch (options) {
                case No_Play:
                    if (player1IsPlaying) {
                        player1Position += 0;
                        player1IsPlaying = false;
                    }else{
                        player2Position += 0;
                        player1IsPlaying = true;
                    }
                    break;
                case Ladder:
                    if(player1IsPlaying) {

                        if (player1Position + dieRoll <= Win_position) {

                            player1Position += dieRoll;
                            System.out.println("Player 1 landed on a ladder");

                        }

                    } else {

                        if (player2Position + dieRoll <= Win_position) {

                            player2Position += dieRoll;
                            System.out.println("Player 2 landed on a ladder");

                        }

                    }
                    break;
                case Snake:
                    if(player1IsPlaying) {

                        player1Position -= dieRoll;
                        player1IsPlaying = false;

                        if (player1Position < 0) {

                            player1Position = 0;

                        }

                        System.out.println("Player 1 landed on a snake");

                    } else {

                        player2Position -= dieRoll;
                        player1IsPlaying = true;

                        if (player2Position < 0) {

                            player2Position = 0;

                        }

                        System.out.println("Player 2 landed on a snake");
                        break;
                    }
                default:
                    System.out.println("Enter proper value");
                    break;

            }
            System.out.println("Player 1 position  = " + player1Position);
            System.out.println("Player 2 position  = " + player2Position);

        }

        if(player1Position == 100) {

            System.out.println("Player 1 won the game!");

        } else {

            System.out.println("Player 2 won the game!");

        }
        System.out.println("Dice was rolled " + dieRolledTimes + " to win the game");
    }
}