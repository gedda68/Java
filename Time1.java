// time1 class declaration maintains the time in 24hr format
public class Time1
{
   private int hour;  //00-23
   private int min;  // 00-59
   private int sec;  //00-59
   
   // set new time value using universal time; throw an
   // exception if the hour, minute or second is invalid
   public void setTime(int h, int m, int s)
   {
      // validate hour minut second
      if((h >=0 && h <=23) && (m >=0 && m <= 59) && (s >=00 && s <= 59))
      {
         hour = h;
         min = m;
         sec = s;
      } // end if
      else 
         throw new IllegalArgumentException("hour, minute or second was out of range");
   } // end set time
   
   public String toUniversalString()
   {
      return String.format("%02d:%02d:%02d", hour, min, sec);
   }
   
   public String toString()
   {
      return String.format("%d:%02d:%02d %s", 
         ((hour == 0 || hour == 12) ? 12 : hour % 12),
         min, sec, (hour < 12 ? "AM" : "PM"));
   } // end method toString
} // end class time1