package ua.kture.pi1311.dao;

import ua.kture.pi1311.entity.Station;

public interface StationDAO {
	
	public boolean insertStation(Station station);
	
	public Station findStation (int stationId);
	
	public boolean updateStation (Station station);
	
	public boolean deleteStation (int stationId);
}
