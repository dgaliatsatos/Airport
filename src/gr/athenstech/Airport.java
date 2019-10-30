package gr.athenstech;

public class Airport {

    public static void main(String[] args) {
	Flights f1= new Flights();
	f1.setArAirport("Athens");
	Time t1 = new Time();
	//t1.setHour(10);
	//t1.setMin(20);
	//t1.setSec(35);
	t1.setTime(10,20,35);
	t1.displayTime();
	f1.setDepTime(t1);
	f1.setDepAirport("California");
	Time t2 = new Time();
	t2.setTime(12,6,01);
	f1.setArTime(t2);
	System.out.println(f1);
    }
}
