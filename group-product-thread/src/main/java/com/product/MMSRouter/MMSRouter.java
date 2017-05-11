package com.product.MMSRouter;

import java.util.HashMap;
import java.util.Map;

public class MMSRouter {
	
	private static volatile MMSRouter instance = new MMSRouter();
	

	
	private static Map<String,MMSInfo> retrieveRouterMapFromDB(){
		Map<String,MMSInfo> map = new HashMap<String,MMSInfo>();
		return map;
	}
	
	public static MMSRouter getInstance(){
		return instance;
	}
	
	public MMSInfo getMMS(String msisdnPrefix){
		return routeMap.get(msisdnPrefix);
	}

	public static void setInstance(MMSRouter instance) {
		MMSRouter.instance = instance;
	}
	
	

}
