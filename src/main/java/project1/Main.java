package project1;

import jdbc.CityCRUD;
import model.City;

import java.sql.SQLException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static project1.CityLargestPopulation.findCityWithLargestPopulation;
import static project1.FindNumberOfCitiesInReg.findNumberOfCitiesInRegion;
import static project1.ReaderAndParser.readFile;


public class Main {

    public static List<City> cities = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        CityCRUD h2CityCRUD = new CityCRUD();
        readFile("referenceBook.txt");
//        City city = new City();
//        h2CityCRUD.createTable(city);

//        cities.forEach(city -> {
//            try {
//                h2CityCRUD.updateRecord(city);
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//        });
//        h2CityCRUD.updateRecord(new City("Краснодар", "Башкортостан", "Приволжский", 16365, 1980));

        h2CityCRUD.deleteRecord(45);

//        Module 1

//        Module 2
//        SortListsByName sortListsByName = new SortListsByName();
//        SortListByDistrictAndName sortListByDistrictAndName = new SortListByDistrictAndName();
//        sortListsByName.sort(cities);
//        sortListByDistrictAndName.sort(cities);
//
////        Module 3
//        findCityWithLargestPopulation(cities);
//
////        Module 4
//        findNumberOfCitiesInRegion(cities);

    }









}

