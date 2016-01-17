package searcher;

import CommonApi.Base;
import excel_stuff.ItemsToBeSearched;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import db_stuff.Search;
import util.ConnectDB;

import java.io.IOException;
import java.util.List;

/**
 * Created by Pratik on 1/17/2016.
 */


public class item extends Base {
    @Test
    public void SearcherDB() throws Exception {
        ConnectDB db = new ConnectDB();
        Search search = PageFactory.initElements(driver , Search.class);
        List<String> string = db.readDataBase();
        for(String data:string){
            search.searchFor(data);
            sleepFor(3);
            search.clearSearchInput();
        }
    }


    @Test
    public void SearcherExcel() throws InterruptedException, IOException {

        Search search =  PageFactory.initElements(driver , Search.class);
        ItemsToBeSearched sercher = new ItemsToBeSearched();
        String[] string = sercher.getData();
        for(String data:string){
            search.searchFor(data);
            sleepFor(3);
            search.clearSearchInput();
        }

    }


}
