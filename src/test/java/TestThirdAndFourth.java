import org.junit.Assert;
import org.junit.Test;
import model.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static project1.CityLargestPopulation.findCityWithLargestPopulation;
import static project1.FindNumberOfCitiesInReg.findNumberOfCitiesInRegion;
import static project1.Main.*;
import static project1.ReaderAndParser.readFile;

public class TestThirdAndFourth {

    List<City> cityList = new ArrayList<>();

//    todo: 3 - check if the max population is correct
    @Test
    public void testMaxPopulationNum() throws Exception {
        readFile("src/main/resources/test/population");
        Assert.assertEquals(findCityWithLargestPopulation(cities), 18000000);
    }

//    todo: 4 - check if city quantity in region is correct
    @Test
    public void testCityQuantityInRegion() throws Exception {
        readFile("src/main/resources/test/test4");

        Map<String, Integer> cityMap = new HashMap<>();
        cityMap.put("Адыгея", 2);
        cityMap.put("Оренбургская область", 2);
        cityMap.put("Хакасия", 4);

        Assert.assertEquals(cityMap, findNumberOfCitiesInRegion(cities));
    }

}
