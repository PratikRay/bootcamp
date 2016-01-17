package test;

import CommonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by Pratik on 1/17/2016.
 */
public class fbTest extends Base {

    @Test
    public void tester() throws InterruptedException {

        typeByCss("#email", "horizen35@gmail.com");
        typeByCss("#pass", "sumnima");
        clickByCss("#persist_box");
        clickById("loginbutton");
        clickByCss("#u_0_11");

        sleepFor(6);



    }
}
