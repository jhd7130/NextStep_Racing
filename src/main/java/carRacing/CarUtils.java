package carRacing;

import java.util.List;
import java.util.Random;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class CarUtils {
    public static void print(List<Car> listCars) {
        listCars.stream().forEach(c -> System.out.println(c.getName() +  " : " + c.getPosition()));
    }

    public static Car update(Car car){
        if(isUpdate()){
            return Car.builder(car.getName(),car.getPosition() + "-").build();
        }
        return car;
    }

    public static boolean isUpdate(){
        if ( new Random().nextInt(10) < 4 ) return false;
        return true;
    }


}
