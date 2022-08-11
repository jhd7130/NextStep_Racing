import carRacing.RacingGame;
import interfacefolder.Game;

/**
 * Role : Client
 * Responsibility : 게임의 실행
 * Cooperation with : 누구를 사용할지만 결정하고 start만 실행시키면된다.
 **/
public class Play {
    public static void main(String[] args) {
        Game racingGame = new RacingGame();
        racingGame.start();
    }
}
