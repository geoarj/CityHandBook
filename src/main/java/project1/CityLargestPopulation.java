package project1;

import model.City;

import java.util.List;

public class CityLargestPopulation {

    public static int findCityWithLargestPopulation(List<City> citiesList) {
        City[] array = citiesList.toArray(new City[0]);
        int maxPopulation = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getPopulation() > maxPopulation) {
                maxPopulation = array[i].getPopulation();
                index = i;
            }
        }
        System.out.println("[" + index + "] = " + maxPopulation);
        return maxPopulation;
    }

}
