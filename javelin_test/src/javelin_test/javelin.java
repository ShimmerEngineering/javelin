package javelin_test;

public class javelin {
	public static native String[] listBLEDevices();
	public static native String[] listBLEDeviceServices(String a_dev_id);
	public static native String getBLEDeviceName(String a_dev_id);
}
