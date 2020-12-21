public class CircleMain {
   public static void main(String[] args) {
      Point center = new Point();
      double radius = 14;
      
      center.x = 7;
      center.y = 7;
      
      Circle circle = new Circle(center, radius);
      
      System.out.println("circle center = " + circle.getCenter());
      System.out.println("circle radius = " + circle.getRadius());
      System.out.println("circle area = " + circle.getArea());
      System.out.println(circle);
   }
}