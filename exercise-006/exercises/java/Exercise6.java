package exercises.java;

import java.util.HashMap;

public class Exercise6 {

    public static void main(String[] args) {

        HashMap<String, Integer> sumsForCodes = new HashMap<>();


        DataObject6 elem1 = new DataObject6(12, "friday");
        DataObject6 elem2 = new DataObject6(15, "saturday");
        DataObject6 elem3 = new DataObject6(24, "saturday");
        DataObject6 elem4 = new DataObject6(123, "saturday");
        DataObject6 elem5 = new DataObject6(122, "friday");


        DataObject6[] arr = new DataObject6[] {elem1, elem2, elem3, elem4, elem5};

        for (DataObject6 dobj: arr
             ) {
                if (sumsForCodes.containsKey(dobj.code)){
                    sumsForCodes.put(dobj.code, sumsForCodes.get(dobj.code) + dobj.count);
                } else {
                    sumsForCodes.put(dobj.code, dobj.count);
                }
        }

        for (String key : sumsForCodes.keySet()) {

            System.out.println(key + " " + sumsForCodes.get(key));
        }

    }
}
