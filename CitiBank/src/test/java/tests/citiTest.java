package tests;

import CommonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by Pratik on 1/17/2016.
 */
public class citiTest extends Base {


    @Test
    public void tester() throws InterruptedException {

        clickByCss("#banking");
        sleepFor(2);
        clickByCss("#creditcards");
        sleepFor(2);
        clickByCss("#lending");
        sleepFor(2);
        clickByCss("#investing");
        sleepFor(2);
        clickByCss(".cta-button.button-blue");
        sleepFor(3);
        typeByCss("#gsc-i-id1", "Student Loans");
        clickByCss(".searchBtn");
        sleepFor(3);
        clickByCss("#headerLogoLink>img");


    }

}
