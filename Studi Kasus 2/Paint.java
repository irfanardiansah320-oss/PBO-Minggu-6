//********************************************************************
//  Paint.java       Author: Lewis/Loftus
//
//  Represents a type of paint that has a coverage.
//********************************************************************
public class Paint
{
   private double coverage;   // number of square feet per gallon

   //-----------------------------------------------------------------
   //  Constructor: sets up the paint object.
   //-----------------------------------------------------------------
   public Paint (double c)
   {
      coverage = c;
   }

   //-----------------------------------------------------------------
   //  Returns the amount of paint needed to paint a shape.
   //-----------------------------------------------------------------
   public double amount (Shape s)
   {
      System.out.println ("Computing amount for " + s);
      return s.area() / coverage;
   }
}