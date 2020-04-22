using System;

namespace Exercise3.CSharp
{
    class Exercise3
    {
        static void Main(string[] args)
        {
            int[] arr = new int[] { 1, 2, 3, 4, 5 };
            int sum = 0;
            foreach (int number in arr)
            {
                sum += number;

            }
            Console.WriteLine(sum);
        }
    }
}
