package search;

import CommonApi.Base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Pratik on 1/17/2016.
 */
public class SearchNews extends Base {



    @Test
    public void test() throws InterruptedException {

        clickByCss("#search-button");
        typeByCss("#search-input-field", "Bernie Sanders");
        clickByCss("#submit-button");
        sleepFor(3);
        clickByCss("#logo");
        sleepFor(3);

    }


}
