import carRacing.RacingGame;
import interfacefolder.Game;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Role : Client
 * Responsibility : 게임의 실행
 * Cooperation with : 누구를 사용할지만 결정하고 start만 실행시키면된다.
 **/
public class Play {
    public static void main(String[] args) {

        Game racingGame = new RacingGame();
        racingGame.start();

        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();

        BigInteger aa = new BigInteger(a);
        BigInteger  bb = new BigInteger(b);
        System.out.println(aa.add(bb));
        System.out.println(aa.subtract(bb));
        System.out.println(aa.multiply(bb));
    }


}
