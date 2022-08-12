package carRacing;

import carRacing.Car;
import carRacing.CarUtils;
import carRacing.MakeCars;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Random;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class CarUtilstest {
    private CarUtils utilCars;
    private String name;
    private MakeCars makeCars;

    @BeforeEach
    void setting() {
        utilCars = new CarUtils();
        name = "alfre,doo,thi,dogi";
        makeCars = new MakeCars();
    }

    @Test
    void 자동차_이름_프린트 (){
        List<Car> listCars = makeCars.making(name);
        utilCars.print(listCars);
    }

    @Test
    void 자동차_위치_이동() {
        List<Car> listCars = makeCars.making(name);
        listCars.set(1 ,utilCars.update(listCars.get(1)));

        Assertions.assertThat(listCars.get(1).getPosition()).isEqualTo("--");

    }


    @Test
    @DisplayName("업그레이드가 가능한지 아닌지 체크")
    void 유틸_업그레이드_테스트(){
        boolean test = utilCars.isUpdate();
        // 어쩔 수 없이 시스아웃(값이 매번 달라짐)
        System.out.println(test);
        System.out.println(new Random().nextInt(10));
    }
}
