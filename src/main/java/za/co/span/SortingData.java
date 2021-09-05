package za.co.span;
/*
Author : Liyabona Saki
Description : comparator class to compare our objects to sort our data
 */

import java.util.Comparator;

public class SortingData implements Comparator<Teams> {


    @Override
    public int compare( Teams t1, Teams t2){
        return t1.getPoints() - t2.getPoints();

    }

}
