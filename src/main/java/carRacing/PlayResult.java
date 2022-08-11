package carRacing;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Role : 실행 결과를 반환해준다.
 * Responsibility : 각 실행에 따른 결과를 출력하고 최종 우승자를 보여준다.
 * Cooperation with : CarUtils, Car
 **/
public class PlayResult {

    public void is(int cnt, List<Car> cars){
        for ( int i = 0 ; i < cnt; i++){
            for ( int j = 0 ; j < cars.size(); j++) {
                cars.set(j, CarUtils.update(cars.get(j)));
            }
            System.out.println("Case " + i);
            CarUtils.print(cars);
            System.out.println("");
        }
        compare(cars);
    }

    private void compare(List<Car> cars){
        Comparator<Car> comparatorByPosition = Comparator.comparingInt(x -> x.getPosition().length());
        StringBuilder stringBuilder = new StringBuilder();

        Car firstCar = cars.stream()
                           .max(comparatorByPosition)
                           .orElseThrow(NoSuchElementException::new);

       cars.stream()
           .filter(x -> x.getPosition().length() == firstCar.getPosition().length())
           .collect(Collectors.toList())
           .forEach(x -> stringBuilder.append(","+x.getName()));

        String s = stringBuilder.deleteCharAt(0).toString();
        System.out.print(s + "가 최종 우승했습니다.");

    }

}
