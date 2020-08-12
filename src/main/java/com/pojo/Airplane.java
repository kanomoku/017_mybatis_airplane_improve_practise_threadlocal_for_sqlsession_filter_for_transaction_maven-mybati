package com.pojo;

public class Airplane {
	private int id;
	private String airNo;
	private int time;
	private double price;
	private Airport takePort;
	private Airport landPort;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the airNo
	 */
	public String getAirNo() {
		return airNo;
	}
	/**
	 * @param airNo the airNo to set
	 */
	public void setAirNo(String airNo) {
		this.airNo = airNo;
	}
	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the takePort
	 */
	public Airport getTakePort() {
		return takePort;
	}
	/**
	 * @param takePort the takePort to set
	 */
	public void setTakePort(Airport takePort) {
		this.takePort = takePort;
	}
	/**
	 * @return the landPort
	 */
	public Airport getLandPort() {
		return landPort;
	}
	/**
	 * @param landPort the landPort to set
	 */
	public void setLandPort(Airport landPort) {
		this.landPort = landPort;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Airplane [id=" + id + ", airNo=" + airNo + ", time=" + time + ", price=" + price + ", takePort="
				+ takePort + ", landPort=" + landPort + "]";
	}
	
	

}
