package gr.athenstech;

public class Time {
    private int Sec;
    private int Min;
    private int hour;
    String checkampm(){
        if (hour <12) {
            return "am";
        }else{
            return "pm";
        }
    }
     public void displayTime(){
         String bm = checkampm();
         System.out.println(hour+":"+Min+":"+Sec+"bm");

         //if (hour <12){
             //System.out.println(hour+":"+Min+":"+Sec+"am");
        // } else {
           //      setHour(hour -12);
          //   System.out.println(hour+":"+Min+":"+Sec+"pm");

       //  }
         System.out.println(hour+":"+Min+":"+Sec);
     }

    public void setTime(int hour, int min, int sec) {
        this.hour = hour;
        //   setHour(hour);
        this.Min = min;
        this.Sec = sec;
    }

    public int getSec() {
        return Sec;
    }

    public void setSec(int sec) {
        Sec = sec;
    }

    public int getMin() {
        return Min;
    }

    public void setMin(int min) {
        Min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Time{" +
                "Sec=" + Sec +
                ", Min=" + Min +
                ", hour=" + hour +
                '}';
    }
}