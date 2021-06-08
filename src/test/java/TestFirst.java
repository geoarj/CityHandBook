import org.junit.Assert;
import org.junit.Test;


import static project1.ReaderAndParser.readFile;

public class TestFirst {

    //    todo: Check for file existence
    @Test
    public void testFileNotFoundException() {
        Assert.assertThrows(
                Exception.class,
                () -> readFile("")
        );
    }

    //    todo: Check for data correctness
    @Test
    public void testData() {
        Assert.assertThrows(Exception.class,
                () -> readFile("src/main/resources/test/wrongFiles")
        );
    }

    //  todo: Check for arguments quantity
    @Test
    public void testQuantity() {
        Exception ex = Assert.assertThrows(
                Exception.class,
                () -> readFile("src/main/resources/test/wrongNumber")
        );
        Assert.assertEquals(ex.getMessage(), "Invalid data!");
    }

    //    todo: Check for negative values
    @Test
    public void testNegativeNumbers() {
        Exception ex = Assert.assertThrows(
                Exception.class,
                () -> readFile("src/main/resources/test/negativeV")
        );
        Assert.assertEquals(ex.getMessage(), "foundation < 0 || foundation > 2021 || population < 0 || population > 35000000");
    }


}

