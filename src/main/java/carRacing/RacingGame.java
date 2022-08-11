package carRacing;

import interfacefolder.Game;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class RacingGame implements Game {


    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        PlayResult playResult = new PlayResult();
        MakeCars carFactory = new MakeCars();

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        List<Car> cars = carFactory.making(scanner.nextLine());

        System.out.println("시도할 회수는 몇회인가요?");
        playResult.is(scanner.nextInt(),cars);
        // 돌리고 나면 비교해서 결과 출력

    }
}
