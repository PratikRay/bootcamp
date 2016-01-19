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
        clickByCss("#persist_box");
        typeByCssThenEnter("#pass", "temppassword");
       // clickById("loginbutton");
        clickByCss(".linkWrap.noCount>span");
        clickByCss("._5qtp");
        typeByCss("._45m_._2vxa", "This is my first automated status");
        sleepFor(6);
    }
}
