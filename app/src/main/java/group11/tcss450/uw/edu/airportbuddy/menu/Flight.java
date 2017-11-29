package group11.tcss450.uw.edu.airportbuddy.menu;

import java.sql.Time;

/**
 * A class that holds the data for each flight.
 */
public class Flight {

    /**
     * flight number string
     */
    private String flightNumber;
    /**
     * gate number reference
     */
    private int gateNumber;
    /**
     * departure time reference
     */
    private Time departure;
    /**
     * reference to the arrival
     */
    private Time arrival;
    /**
     * reference to boarding
     */
    private Time boarding;
    /**
     * reference to the location (destination)
     */
    private String locationTo;
    /**
     * reference to the location (origin)
     */
    private String locationFrom;

    /**
     * Constructs a flight data object.
     *
     * @param flightNumber flight number
     * @param gateNumber gate number
     * @param departure departure time
     * @param arrival arrival time
     * @param boarding boarding time
     * @param locationTo location to
     * @param locationFrom location from
     */
    public Flight(String flightNumber, int gateNumber, Time departure, Time arrival, Time boarding, String locationTo,
                  String locationFrom) {
        this.flightNumber = flightNumber;
        this.gateNumber = gateNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.boarding = boarding;
        this.locationTo = locationTo;
        this.locationFrom = locationFrom;
    }

    /**
     * Converts the flight into a human readable string.
     * @return flight as a human readable string
     */
    @Override
    public String toString() {
        return "FlightNumber: " + flightNumber + ", GateNumber: " + gateNumber
                + ", Departure: " + departure + ", Arrival: " + arrival
                + ", Boarding: " + boarding + ", Location To: " + locationTo
                + ", Location From: " + locationFrom;
    }

    /**
     * setter for flight number
     * @param flightNumber the flight number
     */
    private void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * setter for departure
     * @param departure the departure
     */
    private void setDeparture(Time departure) {
        this.departure = departure;
    }

    /**
     * Setter for arrival time
     * @param arrival the arrival time
     */
    private void setArrival(Time arrival) {
        this.arrival = arrival;
    }

    /**
     * Setter for boarding time
     * @param boarding the boarding time
     */
    private void setBoarding(Time boarding) {
        this.boarding = boarding;
    }

    /**
     * Setter for the location to
     * @param locationTo the location (destination)
     */
    private void setLocationTo(String locationTo) {
        this.locationTo = locationTo;
    }

    /**
     * setter for location from
     * @param locationFrom the location (origin)
     */
    private void setLocationFrom(String locationFrom) {
        this.locationFrom = locationFrom;
    }

    /**
     * Setter for the gate number
     * @return
     */
    public int getGateNumber() {
        return gateNumber;
    }

    /**
     * Setter for the gate number
     * @param gateNumber the gate number
     */
    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    /**
     * getter for the flight number
     * @return the flight number
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Getter for the departure
     * @return the departure
     */
    public Time getDeparture() {
        return departure;
    }

    /**
     * getter for arrival time
     *  @return the arrival time
     */
    public Time getArrival() {
        return arrival;
    }

    /**
     *  getter The boarding time
     * @return the boarding time
     */
    public Time getBoarding() {
        return boarding;
    }

    /**
     * getter for location to
     * @return the location to(destination)
     */
    public String getLocationTo() {
        return locationTo;
    }

    /**
     * getter for location from
     * @return the location  from (origin)
     */
    public String getLocationFrom() {
        return locationFrom;
    }
}
