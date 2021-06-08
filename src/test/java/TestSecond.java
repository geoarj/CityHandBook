import org.junit.Assert;
import org.junit.Test;
import project1.Main;
import project1.SortListByDistrictAndName;
import project1.SortListsByName;

import static project1.Main.*;
import static project1.ReaderAndParser.readFile;

public class TestSecond {

    SortListsByName sortListsByName = new SortListsByName();
    SortListByDistrictAndName sortListByDistrictAndName = new SortListByDistrictAndName();


//    todo: check for sorting by cities
    @Test
    public void testSortedByName() throws Exception {
        String s1 = "City{name='Абаза', region='Хакасия', district='Сибирский', population='17111', foundation='1867'}";
        String s2 = "City{name='Абакан', region='Хакасия', district='Сибирский', population='165183', foundation='1931'}";
        String s3 = "City{name='Абдулино', region='Оренбургская область', district='Приволжский', population='20663', foundation='1795'}";
        String s4 = "City{name='Агидель', region='Башкортостан', district='Приволжский', population='16365', foundation='1980'}";

        readFile("src/main/resources/test/sortedListName");
        sortListsByName.sort(Main.cities);

        Assert.assertEquals(Main.cities.get(0).toString(), s1);
        Assert.assertEquals(Main.cities.get(1).toString(), s2);
        Assert.assertEquals(Main.cities.get(2).toString(), s3);
        Assert.assertEquals(Main.cities.get(3).toString(), s4);
    }

//    todo: check for sorting by district and name
    @Test
    public void testSortedByDistrictAndName() throws Exception {
        String s1 = "City{name='Абдулино', region='Оренбургская область', district='Приволжский', population='20663', foundation='1795'}";
        String s2 = "City{name='Агидель', region='Башкортостан', district='Приволжский', population='16365', foundation='1980'}";
        String s3 = "City{name='Абаза', region='Хакасия', district='Сибирский', population='17111', foundation='1867'}";
        String s4 = "City{name='Абакан', region='Хакасия', district='Сибирский', population='165183', foundation='1931'}";

        readFile("src/main/resources/test/sortedListName");
        sortListByDistrictAndName.sort(Main.cities);

        Assert.assertEquals(Main.cities.get(0).toString(), s1);
        Assert.assertEquals(Main.cities.get(1).toString(), s2);
        Assert.assertEquals(Main.cities.get(2).toString(), s3);
        Assert.assertEquals(Main.cities.get(3).toString(), s4);
    }




}
