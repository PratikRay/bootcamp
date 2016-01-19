package tests;


import CommonApi.Base;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by Pratik on 1/17/2016.
 */
public class test extends Base {

    @Test
    public void tester() throws InterruptedException {
        //clickByCss(".business>a>span");
        clickByCss(".careers>a>span");
        sleepFor(3);
        typeByCssThenEnter("#query" , "jobs");
        sleepFor(3);
        clickByXpath(".//*[@id='tab1']/div[1]/div[1]/div[3]/ul/li[1]/h4/a");
        sleepFor(5);

    }

}
