package BaiThi.commons;

import org.testng.annotations.DataProvider;

public class DataProviderFactory {
    @DataProvider(name = "test")
    public static Object[][] dataTest(){
        return new Object[][]{
                {"admin@demo.com","riseDemo"}
        };
    }
}
