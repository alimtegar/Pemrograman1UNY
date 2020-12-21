public class RectangleMain {
   public static void main(String[] args) {
      testUnion();
      testContains();  
   }
   
   public static void testUnion() {
      Rectangle rect1 = new Rectangle(5, 12, 4, 6);
      Rectangle rect2 = new Rectangle(6,  8, 5, 7);
      Rectangle rect3 = new Rectangle(14, 9, 3, 3);
      Rectangle rect4 = new Rectangle(10, 3, 5, 8);
      
      rect1.union(rect2);        // {(5, 8), 6x10}
      System.out.println(rect1);
      rect4.union(rect3);        // {(10, 3), 7x9}
      System.out.println(rect4);
   }
   
   public static void testContains() {
      Rectangle rect = new Rectangle(2, 5, 8, 10);
      System.out.println(rect.contains(2, 5));
   }
}