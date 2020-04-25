using System;

namespace Exercise5.CSharp
{
    class Exercise5
    {
        static void Main(string[] args)
        {
            int sum = 0;
            DataObject[] arr = new DataObject[5];

            DataObject elem1 = new DataObject(12, "friday");
            DataObject elem2 = new DataObject(1342, "saturday");
            DataObject elem3 = new DataObject(1244, "saturday");
            DataObject elem4 = new DataObject(122, "friday");
            DataObject elem5 = new DataObject(12, "saturday");

            arr[0] = elem1;
            arr[1] = elem2;
            arr[2] = elem3;
            arr[3] = elem4;
            arr[4] = elem5;

            foreach (DataObject obj in arr)
            {
                if (obj.code == "friday")
                {
                    sum += obj.count;
                }
            }

            Console.WriteLine(sum);
        }
    }
}
