package com.ibm.bluelist;

import com.ibm.mobile.services.data.IBMDataObject;
import com.ibm.mobile.services.data.IBMDataObjectSpecialization;
@IBMDataObjectSpecialization("Sensor")
public class SensorTable extends IBMDataObject{
	public static final String CLASS_NAME = "Sensor";
	private static String XAXIS = "xAxis";
	private static String YAXIS = "yAxis";
	private static String ZAXIS = "zAxis";
	/**
	 * @return the xaxis
	 */
	public  String getXaxis() {
		//return XAXIS;
		return (String) getObject(XAXIS);
	}
	/**
	 * @param xaxis the xaxis to set
	 */
	public  void setXaxis(String xaxis) {
		//XAXIS = xaxis;
		setObject(XAXIS, (xaxis != null) ? xaxis : "");
	}
	/**
	 * @return the yaxis
	 */
	public  String getYaxis() {
		//return YAXIS;
		return (String) getObject(YAXIS);
	}
	/**
	 * @param yaxis the yaxis to set
	 */
	public  void setYaxis(String yaxis) {
		//YAXIS = yaxis;
		setObject(YAXIS, (yaxis != null) ? yaxis : "");
	}
	/**
	 * @return the zaxis
	 */
	public  String getZaxis() {
		//return ZAXIS;
		return (String) getObject(ZAXIS);
	}
	/**
	 * @param zaxis the zaxis to set
	 */
	public  void setZaxis(String zaxis) {
		//ZAXIS = zaxis;
		setObject(ZAXIS, (zaxis != null) ? zaxis : "");
	}
	public void storeSensorData(){
		
	}
}
