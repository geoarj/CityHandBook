package project1;

import model.City;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNumberOfCitiesInReg {

    public static Map<String, Integer> findNumberOfCitiesInRegion(List<City> cities) {
        Map<String, Integer> map = cities.stream().collect(Collectors.toMap(City::getRegion, x -> 1, (oldValue, newValue) -> oldValue + 1));
        map.forEach((a, b) -> System.out.println(a + " - " + b));
        return map;
    }
}
