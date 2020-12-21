public class TimeSpan {
   private int hours;
   private int minutes;
   
   public TimeSpan(int hours, int minutes) {
      this.hours = 0;
      this.minutes = 0;
      
      add(hours, minutes);
   }
   
   public void add(int hours, int minutes) {
      this.hours += hours;
      this.minutes += minutes;
      
      // Convert 60 minutes to an hour 
      this.hours += minutes / 60;
      this.minutes = this.minutes % 60;
   }
   
   public int getHours() { return hours; }
   public int getMinutes() { return minutes; }
   
   public String toString() {
      return hours + "h" + minutes + "m";
   }
}