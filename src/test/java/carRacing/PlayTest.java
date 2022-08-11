package carRacing;

import carRacing.RacingGame;
import interfacefolder.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class PlayTest {

    MakeCars makeCars;

    @BeforeEach
    void gettingCars(){
        makeCars = new MakeCars();
    }

    @Test
    @DisplayName("게임 실행 테스트")
    void 게임결과_반환_테스트(){
        PlayResult playResult = new PlayResult();
        List<Car> cars = makeCars.making("alfre,doo,thig,dogi") ;

        playResult.is(5,cars);

    }

}
