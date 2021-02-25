import java.text.DecimalFormat;

/**
* Class that stores the label, height, and radius of a cone object
*
* Project 5
* @author Noah Jones
* @version 02/09/2021
*/

public class Cone
{
   //Instance variables
   private String label;
   private double height;
   private double radius;
   
   //Constructor
   /**
   * Initializes all variables.
   *
   * @param labelIn command line arguments.
   * @param heightIn command line arguments.
   * @param radiusIn command line arguments.
   */
   public Cone(String labelIn, double heightIn, double radiusIn)
   {
      label = labelIn;
      height = heightIn;
      radius = radiusIn;
   }
   
   //Methods
   /**
   * Checks to see if the label is null and if it is not
   * then it trims the label and returns true.
   *
   * @param labelIn command line args.
   * @return isSet returns true or false value.
   */
   public boolean setLabel(String labelIn)
   {
      boolean isSet = false;
      if (labelIn != null)
      {
         isSet = true;
         label = labelIn.trim();
      }
      return isSet;
   }
   
   /**
   * Returns the string label.
   *
   * @return label returns the label.
   */
   public String getLabel()
   {
      return label;
   }
   
   /**
   * Checks to see if the height is greater than 0.
   *
   * @param heightIn command line args.
   * @return isSet returns true or false value.
   */
   public boolean setHeight(double heightIn)
   {
      boolean isSet = false;
      if (heightIn > 0)
      {
         isSet = true;
         height = heightIn;
      }
      return isSet;
   }
   
   /**
   * Returns the double height.
   *
   * @return height returns the height.
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   * Checks to see if the radius is greater than 0.
   *
   * @param radiusIn command line args.
   * @return isSet returns true or false value.
   */
   public boolean setRadius(double radiusIn)
   {
      boolean isSet = false;
      if (radiusIn > 0)
      {
         isSet = true;
         radius = radiusIn;
      }
      return isSet;
   }
   
   /**
   * Returns the double radius.
   *
   * @return radius returns the radius.
   */
   public double getRadius()
   {
      return radius;
   }
   
   /**
   * Calculates the base perimeter of the cone.
   *
   * @return perimeter returns the perimeter.
   */
   public double basePerimeter()
   {
      double perimeter = 2 * radius * Math.PI;
      return perimeter;
   }
   
   /**
   * Calculates the base area of the cone.
   *
   * @return area returns the area.
   */
   public double baseArea()
   {
      double area = radius * radius * Math.PI;
      return area;
   }
   
   /**
   * Calculates the slant height of the cone.
   *
   * @return slantHeight returns the slant height.
   */
   public double slantHeight()
   {
      double slantHeight = Math.sqrt(radius * radius + height * height);
      return slantHeight;
   }
   
   /**
   * Calculates the side area of the cone.
   *
   * @return sideArea returns the side area.
   */
   public double sideArea()
   {
      double sideArea = Math.PI * radius * slantHeight();
      return sideArea;
   }
   
   /**
   * Calculates the surface area of the cone.
   *
   * @return surfaceArea returns the surface area.
   */
   public double surfaceArea()
   {
      double surfaceArea = Math.PI * radius * (radius + slantHeight());
      return surfaceArea;
   }
   
   /**
   * Calculates the volume of the cone.
   *
   * @return volume returns the volume.
   */
   public double volume()
   {
      double volume = Math.PI * radius * radius * height / 3;
      return volume;
   }
   
   /**
   * Formats the output jsut like in the example projects.
   *
   * @return output returns the formatted output.
   */
   public String toString()
   {
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
     
      String output = "\"" + label + "\" is a cone with height = " + height
         + " units and radius = " + radius + ",\n"
         + "which has a base perimeter = " + df1.format(basePerimeter())
         + " units," + " base area = " + df1.format(baseArea())
         + " square units,\n" + "slant height = " + df1.format(slantHeight())
         + " units, " + "side area = " + df1.format(sideArea())
         + " square units,\n" + "surface area = " + df1.format(surfaceArea())
         + " square units, and" + " volume = " + df1.format(volume())
         + " cubic units.";
     
      return output;
   }
}