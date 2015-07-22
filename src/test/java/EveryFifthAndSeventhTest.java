import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by jrichiemx on 7/21/15.
 */
public class EveryFifthAndSeventhTest {

    @Test
    public void get_a_list_of_every_fifth_and_seventh_elements(){

        List<String> listOfString = new ArrayList<>();
        listOfString.add("5");
        listOfString.add("7");
        listOfString.add("10");
        listOfString.add("14");
        listOfString.add("15");
        listOfString.add("21");

        String[] arrayOfStringForComparing = {"0","1", "2", "3" ,"4" ,"5" ,"6" ,"7" ,"8" ,"9" ,"10" ,
                                             "11" ,"12" ,"13" ,"14" ,"15" ,"16" ,"17" ,"18" ,"19" ,"20" ,"21"};

        for( String s :  EveryFifthAndSeventh.getListOfFifthsAndSevenths(arrayOfStringForComparing)){
            System.out.println(s);
        }

        assertTrue(EveryFifthAndSeventh.getListOfFifthsAndSevenths(arrayOfStringForComparing).containsAll(listOfString));
    }
}
