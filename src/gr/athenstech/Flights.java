package gr.athenstech;

public class Flights {
    private String arAirport;
    private String depAirport;
    public String getArAirport(){
        return getArAirport();
    }
    public void setArAirport(String arAirport){
        this.arAirport = arAirport;
    }
    public String getDepAirport(){
        return getDepAirport();
    }
    public String toString(){
        return "Flight From:"+depAirport+",To:"+ arAirport;
    }
    public void setDepAirport(String depAirport) {
        this.depAirport = depAirport;
    }
}
