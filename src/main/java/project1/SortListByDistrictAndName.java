package project1;

import model.City;

import java.util.List;

public class SortListByDistrictAndName implements SortingAlgorithm {

    @Override
    public List<City> sort(List<City> citiesList) {
        citiesList.sort((City c1, City c2) -> {
            return c1.getDistrict().equals(c2.getDistrict()) ? c1.getName().compareTo(c2.getName()) :
                    c1.getDistrict().compareTo(c2.getDistrict());
        });

        return citiesList;
    }
}
