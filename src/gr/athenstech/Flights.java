package gr.athenstech;

public class Flights {
    private String arAirport;
    private String depAirport;
    private Time depTime;
    private Time arTime;

    public String getArAirport() {
        return arAirport;
    }

    public void setArAirport(String arAirport) {
        this.arAirport = arAirport;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public void setDepAirport(String depAirport) {
        this.depAirport = depAirport;
    }

    public Time getDepTime() {
        return depTime;
    }

    public void setDepTime(Time depTime) {
        this.depTime = depTime;
    }

    public Time getArTime() {
        return arTime;
    }

    public void setArTime(Time arTime) {
        this.arTime = arTime;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "arAirport='" + arAirport + '\'' +
                ", depAirport='" + depAirport + '\'' +
                ", depTime=" + depTime +
                ", arTime=" + arTime +
                '}';
    }
}

