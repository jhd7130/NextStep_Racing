package carRacing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class MakeCars {

    public List<Car> making(String name) {

        String[] names = name.split(",");

        return Arrays.stream(names)
                .map(s -> Car.builder(s,"-").build())
                .collect(Collectors.toList());
    }
}
