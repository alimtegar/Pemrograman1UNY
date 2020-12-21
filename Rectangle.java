import java.lang.Math;

// A Rectangle stores an (x, y) coordinate of its top/left corner, a width and height.
public class Rectangle {
   private int x;
   private int y;
   private int width;
   private int height;

   // constructs a new Rectangle with the given x,y, width, and height
   public Rectangle(int x, int y, int w, int h) {
      this.x = x;
      this.y = y;
      this.width = w;
      this.height = h;
   }
    
   // initiates the field's values 
   public void setX(int x) { this.x = x; }
   public void setY(int y) { this.y = y; }
   public void setWidth(int w) { this.width = w; }
   public void setHeight(int h) { this.height = h; }
    
   // returns the fields' values
   public int getX() { return this.x; }
   public int getY() { return this.y; }
   public int getWidth() { return this.width; }
   public int getHeight() { return this.height; }

   // returns a string such as {(5,12), 4x8}
   public String toString() {
      return "{{" + this.x + ", " + this.y + "}, " + this.width + "x" + this.height + "}";
   }
   
   public void union(Rectangle r) {
      int diffx = r.getX() - this.x,
          diffy = r.getY() - this.y;
          
      this.x = Math.min(r.getX(), this.x);
      this.y = Math.min(r.getY(), this.y);
      this.width = Math.min(r.getWidth(), this.width) + Math.abs(diffx);
      this.height = Math.min(r.getHeight(), this.height) + Math.abs(diffy);
   }
   
   public boolean contains(int x, int y) {
      return (
         (x >= this.x && x <= (this.x + this.width)) &&
         (y >= this.y && y <= (this.y + this.height))
      );
   }
}