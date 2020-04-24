using System;

namespace Exercise4.CSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            DataObject[] arr = new DataObject[3];

            DataObject obj1 = new DataObject();
            DataObject obj2 = new DataObject();
            DataObject obj3 = new DataObject();

            arr[0] = obj1;
            arr[1] = obj2;
            arr[2] = obj3;

            int sum = 0;

            foreach (DataObject obj in arr)
            {
                sum += obj.count;
            }

            Console.WriteLine(sum);
        }
    }
}
