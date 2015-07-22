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


        assertTrue(EveryFifthAndSeventh.getListOfFifthsAndSevenths(array).containsAll());
    }
}
