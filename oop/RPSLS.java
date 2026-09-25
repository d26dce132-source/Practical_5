import java.util.Scanner;
import java.util.Random;

enum Move {
    ROCK, PAPER, SCISSORS, LIZARD, SPOCK
}

public class RPSLS {

    static int winner(Move a, Move b) {

        if (a == b)
            return 0;

        if (a == Move.ROCK && (b == Move.SCISSORS || b == Move.LIZARD))
            return 1;

        if (a == Move.PAPER && (b == Move.ROCK || b == Move.SPOCK))
            return 1;

        if (a == Move.SCISSORS && (b == Move.PAPER || b == Move.LIZARD))
            return 1;

        if (a == Move.LIZARD && (b == Move.SPOCK || b == Move.PAPER))
            return 1;

        if (a == Move.SPOCK && (b == Move.SCISSORS || b == Move.ROCK))
            return 1;

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int playerScore = 0;
        int computerScore = 0;

        Move[] moves = Move.values();

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nRound " + i);
            System.out.print("Enter Move (ROCK, PAPER, SCISSORS, LIZARD, SPOCK): ");

            Move player = Move.valueOf(sc.next().toUpperCase());
            Move computer = moves[r.nextInt(5)];

            System.out.println("Computer Move: " + computer);

            int result = winner(player, computer);

            if (result == 1) {
                System.out.println("You Win!");
                playerScore++;
            } else if (result == -1) {
                System.out.println("Computer Wins!");
                computerScore++;
            } else {
                System.out.println("Tie!");
            }
        }

        System.out.println("\nPlayer Score = " + playerScore);
        System.out.println("Computer Score = " + computerScore);

        if (playerScore > computerScore)
            System.out.println("Overall Winner: Player");
        else if (computerScore > playerScore)
            System.out.println("Overall Winner: Computer");
        else
            System.out.println("Overall Result: Tie");

        sc.close();
    }
}