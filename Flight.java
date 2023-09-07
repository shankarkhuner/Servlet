package com.controller;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Flight_Table")
public class Flight {
	
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + ", flyTime=" + flyTime + ", flightPrice=" + flightPrice + "]";
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@SequenceGenerator(name= "flight_number_generator", initialValue= 1000, allocationSize = 10)
	@GeneratedValue(generator = "flight_number_generator", strategy=GenerationType.SEQUENCE)
	private int flightNumber;
	public Flight(int flightNumber, String flightName, String source, String destination, LocalDate flyTime,
			double flightPrice) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.flyTime = flyTime;
		this.flightPrice = flightPrice;
	}
	private String flightName;
	private String source;
	private String destination;
	private LocalDate  flyTime;
	private double flightPrice;
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getFlyTime() {
		return flyTime;
	}
	public void setFlyTime(LocalDate flyTime) {
		this.flyTime = flyTime;
	}
	public double getFlightPrice() {
		return flightPrice;
	}
	public void setFlightPrice(double flightPrice) {
		this.flightPrice = flightPrice;
	}
	
	
}
