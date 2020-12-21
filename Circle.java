import java.lang.Math;

public class Circle {
   private Point center;
   private double radius;
   
   public Circle(Point center, double radius) {
      this.setCenter(center);
      this.setRadius(radius);
   }  
   
   // Set properties 
   public void setCenter(Point center) { this.center = center; }
   public void setRadius(double radius) { this.radius = radius; }
   
   // Get properties 
   public Point getCenter() { return this.center; }
   public double getRadius() { return this.radius; }
   public double getArea() { return Math.pow(radius, 2) * Math.PI; }
   
   public String toString() {
      return this.center + ",r=" + this.radius;
   }
}