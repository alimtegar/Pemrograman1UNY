// A ClockTime object represents an hour:minute time during
// the day or night, such as 10:45 AM or 6:27 PM.
public class ClockTime {
   private int hour;
   private int minute;
   private String amPm;
   
   // Constructs a new time for the given hour/minute
   public ClockTime(int h, int m, String ap) {
      this.setHour(h);
      this.setMinute(m);
      this.setAmPm(ap);
   }
   
   // initates the field values 
   public void setHour(int h) { this.hour = h; }
   public void setMinute(int m) { this.minute = m; }
   public void setAmPm(String ap) { this.amPm = ap; }
    
   // returns the field values
   public int getHour() { return this.hour; }
   public int getMinute() { return this.minute; }
   public String getAmPm() { return this.amPm; }
   
   // returns a String for this time; for example, "6:27 PM"
   public String toString() {
      return hour + ":" + String.format("%02d", minute) + " " + amPm;
   }
   
   public void advance(int m) {
      this.minute += m;
      
      if(this.minute >= 60) {
         this.hour += this.minute / 60;
         this.minute = this.minute % 60;
      }
      
      if(this.hour >= 12) {
         int convertedHour = this.hour % 12;
         this.hour = convertedHour;
         this.amPm = (convertedHour % 2 == 1) ? "AM" : "PM";
      }
   }
   
   public boolean isWorkTime() {
      if (
         (this.amPm == "AM" && this.hour >= 9 && this.hour < 12) ||
         (this.amPm == "PM" && (
            (this.hour == 12) || 
            (this.hour == 5 && this.minute == 0) ||
            (this.hour >= 1 && this.hour < 5)
         ))
      ) {
         return true;
      }
      
      return false;
   }
}