package com.product.immutable;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class VehicleTracker{

	
	private Map<String,Location> map = new ConcurrentHashMap<String,Location>();
	
	public void updateLocation(String vehicleId,Location location){
		map.put(vehicleId, location);
	}
	


}
