package jdbc;

import model.City;

import java.sql.*;

import static model.CityQueries.*;

public class CityCRUD {

    public void createTable(City city) throws ClassNotFoundException {
        System.out.println(CREATE_TABLE_SQL.toString());
        try (Connection connection = H2JDBCUtils.getConnection();
             Statement statement = connection.createStatement()) {
            statement.execute(CREATE_TABLE_SQL.toString());
        } catch (SQLException e) {
            H2JDBCUtils.printSQLException(e);
        }
    }


    public void insertRecord(City city) throws SQLException {
        System.out.println(INSERT_CITIES_SQL.toString());
//        establishing connection
        try (Connection connection = H2JDBCUtils.getConnection();
//        create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CITIES_SQL.toString())) {
            preparedStatement.setString(1, city.getName());
            preparedStatement.setString(2, city.getRegion());
            preparedStatement.setString(3, city.getDistrict());
            preparedStatement.setInt(4, city.getPopulation());
            preparedStatement.setInt(5, city.getFoundation());

            System.out.println(preparedStatement);
//            execute query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            H2JDBCUtils.printSQLException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//          try-with-resource will auto close the connection
    }

    public void selectRecord(City city) {
        try (Connection connection = H2JDBCUtils.getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY.toString())) {
                preparedStatement.setInt(1, 1);
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String region = rs.getString("region");
                String district = rs.getString("district");
                int population = rs.getInt("population");
                int foundation = rs.getInt("foundation");
                System.out.println(id + ", " + name + ", " + region + ", " + district +
                        ", " + population + ", " + foundation);
            }
        } catch (SQLException e) {
            H2JDBCUtils.printSQLException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void updateRecord(City city) {
        System.out.println(UPDATE_CITIES_SQL.toString());
        try (Connection connection = H2JDBCUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CITIES_SQL.toString())) {
            preparedStatement.setString(1, city.getName());
            preparedStatement.setInt(2, 44);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            H2JDBCUtils.printSQLException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void deleteRecord(int id) {
        System.out.println(DELETE_CITIES_SQL.toString());

        try (Connection connection = H2JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CITIES_SQL.toString())) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            H2JDBCUtils.printSQLException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
