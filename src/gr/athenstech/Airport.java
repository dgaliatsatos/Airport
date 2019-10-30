package gr.athenstech;

public class Airport {

    public static void main(String[] args) {
	Flights f1= new Flights();
	f1.setArAirport("Athens");
	f1.setDepAirport("California");
	System.out.println(f1);
	System.out.println("from"+f1.getArAirport());
	System.out.println(f1.getDepAirport());
    }
}
