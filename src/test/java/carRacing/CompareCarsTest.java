package carRacing;

import carRacing.Car;
import carRacing.MakeCars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CompareCarsTest {
    MakeCars makeCars;

    @BeforeEach
    void gettingCars(){
        makeCars = new MakeCars();
    }

    @Test
    @DisplayName("자동차테스트")
    void 자동차_이름_분배_실패(){

        assertThrows(IllegalArgumentException.class,
                () -> makeCars.making("alfre,doo,thigiiiii,dogi") );

    }

    @Test
    @DisplayName("자동차테스트")
    void 자동차_이름_분배(){
        MakeCars makeCar = new MakeCars();
        String name = "alfre,doo,thigi,dogi";
        List<Car> carList = makeCars.making(name);

        assertThat(carList.size()).isEqualTo(4);
    }

}
