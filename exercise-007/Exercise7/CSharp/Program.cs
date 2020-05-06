using System;

namespace Exercise7.CSharp
{
    class Program
    {
        static void Main(string[] args)
        {

            Circle square = new Circle();

            square.setRadius(14d);

            square.setColor("violent");

            Console.WriteLine($"Circle is {square.getColor()} has a radius of {square.getRadius()} and an area of {square.getArea()}");
        }
    }
}
