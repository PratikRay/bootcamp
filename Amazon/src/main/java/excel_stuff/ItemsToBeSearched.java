package excel_stuff;

import util.DataReader;

import java.io.IOException;

/**
 * Created by Pratik on 1/17/2016.
 */
public class ItemsToBeSearched {

    DataReader dr = new DataReader();
    public String [] getData()throws IOException {
        String path = System.getProperty("user.dir")+"/data/file1.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}
