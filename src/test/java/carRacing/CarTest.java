package carRacing;

import carRacing.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    String name;
    @BeforeEach
    void targetname(){
        name = "alfre,doo,thigi,dogi";
    }

    @Test
    @DisplayName("카레이싱 테스트")
    void 자동차_이름_생성_실패 (){

        assertThrows(IllegalArgumentException.class,
                () -> Car.builder("Longlongname","-").build());

    }
    @Test
    @DisplayName("카레이싱 테스트")
     void 자동차_생성_테스트(){

        Car firstCar = Car.builder("test1","-").build();
        assertThat(firstCar.getPosition()).isEqualTo("-");
        assertThat(firstCar.getName()).isEqualTo("test1");

    }

    @Test
    @DisplayName("카레이싱 테스트")
     void 자동차_길이_변경 (){

        Car firstCar = Car.builder("test1","-").build();
        firstCar = Car.builder(firstCar.getName(),firstCar.getPosition() + "-").build();
        assertThat(firstCar.getPosition()).isEqualTo("--");

    }




}
