package project1;

import model.City;

import java.util.List;

public class SortListsByName implements SortingAlgorithm {

    @Override
    public List<City> sort(List<City> citiesList) {
        citiesList.sort((City c1, City c2) -> {
            return c1.getName().compareToIgnoreCase(c2.getName());
        });

        return citiesList;
    }
}
