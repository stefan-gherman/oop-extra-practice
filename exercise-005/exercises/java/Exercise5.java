package exercises.java;

public class Exercise5 {

    public static void main(String[] args) {
        DataObject1[] arr = new DataObject1[5];

        DataObject1 elem1 = new DataObject1(12, "friday");
        DataObject1 elem2 = new DataObject1(15, "saturday");
        DataObject1 elem3 = new DataObject1(24, "saturday");
        DataObject1 elem4 = new DataObject1(123, "saturday");
        DataObject1 elem5 = new DataObject1(122, "friday");

        arr[0] = elem1;
        arr[1] = elem2;
        arr[2] = elem3;
        arr[3] = elem4;
        arr[4] = elem5;

        int sum=0;

        for (DataObject1 dobj: arr
             ) {
            if(dobj.code.equals("friday")) {
                sum += dobj.count;
            }
        }
        System.out.println(sum);
    }
}
