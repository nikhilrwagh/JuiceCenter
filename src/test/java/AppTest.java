import Entity.MenuList;
import org.junit.Assert;
import org.junit.Test;

import java.util.StringTokenizer;

public class AppTest {

    @Test
    public void appTest(){
        String tst = "Chai,-milk";
//        StringTokenizer tokenizer = new StringTokenizer(tst,",");
        String  arr = tst.split(",")[0].toString();
        System.out.println(MenuList.getByMenuName(arr));

//        System.out.println(MenuList."${arr}");
    }


}
