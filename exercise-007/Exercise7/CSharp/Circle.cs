using System;

namespace Exercise7.CSharp
{


    class Circle
    {

        private double radius;
        private string color;

        public Circle()
        {

        }

        public Circle(double radius)
        {
            this.radius = radius;
        }


        public void setColor(string color)
        {
            this.color = color;
        }

        public void setRadius(double radius)
        {
            this.radius = radius;
        }

        public string getColor()
        {
            return this.color;
        }

        public double getRadius()
        {
            return this.radius;
        }

        public double getArea()
        {
            return Math.Pow(this.radius, 2) * Math.PI;
        }
    }
}