package ua.kture.pi1311.entity;

import java.util.List;

public class Station {
	
	private int stationId;
	
	private String stationName;
	
	private List<Train> arrivalTrains;
	
	private List<Train> departureTrains;
	
	private Direction direction;
	
	private int urlId;

	public Station() {
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Station station = (Station) o;
		boolean result = (this.stationId == station.getStationId());
		return result;
	}
	
	
	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public List<Train> getArrivalTrains() {
		return arrivalTrains;
	}

	public void setArrivalTrains(List<Train> arrivalTrains) {
		this.arrivalTrains = arrivalTrains;
	}

	public List<Train> getDepartureTrains() {
		return departureTrains;
	}

	public void setDepartureTrains(List<Train> departureTrains) {
		this.departureTrains = departureTrains;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public int getUrlId() {
		return urlId;
	}

	public void setUrlId(int urlId) {
		this.urlId = urlId;
	}

}
