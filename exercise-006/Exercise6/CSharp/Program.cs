using System;
using System.Collections.Generic;

namespace Exercise5.CSharp
{
    class Exercise5
    {
        static void Main(string[] args)
        {
            Dictionary<string, int> sumsForCodes = new Dictionary<string, int>();


            DataObject elem1 = new DataObject(12, "friday");
            DataObject elem2 = new DataObject(1342, "saturday");
            DataObject elem3 = new DataObject(1244, "saturday");
            DataObject elem4 = new DataObject(122, "friday");
            DataObject elem5 = new DataObject(12, "saturday");

            DataObject[] arr = new DataObject[] { elem1, elem2, elem3, elem4, elem5 };

            foreach (DataObject obj in arr)
            {
                if (sumsForCodes.ContainsKey(obj.code))
                {
                    sumsForCodes[obj.code] = sumsForCodes[obj.code] + obj.count;
                }
                else
                {
                    sumsForCodes.Add(obj.code, obj.count);
                }
            }

            foreach (string key in sumsForCodes.Keys)
            {
                Console.WriteLine(key + " " + sumsForCodes[key]);
            }

        }
    }
}
