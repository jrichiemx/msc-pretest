import java.util.ArrayList;
import java.util.List;

/**
 * Created by jrichiemx on 7/21/15.
 */
public class EveryFifthAndSeventh {

    public static <T> List<T> getListOfFifthsAndSevenths( T[] arrayOfObjects){
        List<T> listOfFifthsAndSevents= new ArrayList<>();

        for(int i=1; i< arrayOfObjects.length; i++){
            if(i%5 == 0)
                listOfFifthsAndSevents.add((T) arrayOfObjects[i]);
            else if (i%7 == 0)
                listOfFifthsAndSevents.add((T) arrayOfObjects[i]);
        }

        return listOfFifthsAndSevents;

    }
}
