package project1;

import jdbc.CityCRUD;
import model.City;

import java.io.File;
import java.sql.SQLException;
import java.util.Scanner;

import static project1.Main.cities;

public class ReaderAndParser {

    public static void readFile(String fileName) throws Exception {
        CityCRUD cityCRUD = new CityCRUD();
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            cities.add(parseCities(scanner.nextLine()));
//            cityCRUD.insertRecord(parseCities(scanner.nextLine()));
        }

        cities.forEach(city -> {
            try {
                cityCRUD.insertRecord(city);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });

    }

    public static City parseCities(String line) throws Exception {

        String[] lineArr = line.split(";");

        if (lineArr.length != 6) {
            throw new Exception("Invalid data!");
        }

        String name = lineArr[1];
        String region = lineArr[2];
        String district = lineArr[3];
        int population = Integer.parseInt(lineArr[4]);
        int foundation = Integer.parseInt(lineArr[5]);
        if (foundation < 0 || foundation > 2021 || population < 0 || population > 35000000)
            throw new Exception("foundation < 0 || foundation > 2021 || population < 0 || population > 35000000");

        return new City(name, region, district, population, foundation);
    }

}
