import java.util.*;

class guesser {
    int guessNum;

    int guessingnumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("guesser !!please enter the number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class player {
    int guessnum;

    int guessingnumber() {
        Scanner sc = new Scanner(System.in);

        guessnum = sc.nextInt();
        return guessnum;
    }
}

class umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGusser() {
        guesser g = new guesser();
        numFromGuesser = g.guessingnumber();

    }

    void collectNumFromPlayer() {
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        System.out.println(" 1 player !!please enter the number");
        numFromPlayer1 = p1.guessingnumber();
        System.out.println("2 player !!please enter the number");
        numFromPlayer2 = p2.guessingnumber();
        System.out.println("3 player !!please enter the number");
        numFromPlayer3 = p3.guessingnumber();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            System.out.println("player 1 won");
        } else if (numFromGuesser == numFromPlayer2) {
            System.out.println("player 2 won");
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("player 3 won");
        } else {
            System.out.println("lost");
        }
    }
}

public class launch {
    public static void main(String[] args) {
        System.out.println("lets start the game");
        umpire u = new umpire();
        u.collectNumFromGusser();
        u.collectNumFromPlayer();
        u.compare();

    }

}
