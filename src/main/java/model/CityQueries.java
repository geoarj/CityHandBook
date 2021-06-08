package model;

public enum CityQueries {

    CREATE_TABLE_SQL("create table cities (\r\n " +
                    " id int primary key auto_increment,\r\n" +
                    " name varchar(40),\r\n" +
                    " region varchar(40), \r\n" +
                    " district varchar(40), \r\n" +
                    " population int, \r\n " +
                    " foundation int \r\n);"),

    INSERT_CITIES_SQL("INSERT INTO cities" +
            " (name, region, district, population, foundation) VALUES " +
            " (?, ?, ?, ?, ?);"),

    SELECT_QUERY("SELECT * FROM cities WHERE id = ?;"),

    UPDATE_CITIES_SQL("UPDATE cities SET region = ? WHERE id = ?;"),

    DELETE_CITIES_SQL("DELETE FROM cities WHERE id = ?");


    private String query;

    CityQueries(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    @Override
    public String toString() {
        return query;
    }
}
