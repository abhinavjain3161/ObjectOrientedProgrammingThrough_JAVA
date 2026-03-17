interface WiFiEnabled{
	void connectToWiFi(String network);
	void disconnectWiFi();
}
interface BluetoothEnabled{
	void pairDevice(String deviceName);
	void unpairDevice();
}
class SmartSpeaker implements WiFiEnabled, BluetoothEnabled{
	private String connectedNetwork;
	private String pairedDevice;
	@Override
	public void connectToWiFi(String network){
		this.connectedNetwork = network;
		System.out.println("Connected to WiFi network: " + network);
	}
	@Override
	public void disconnectWiFi(){
		System.out.println("Disconnected from WiFi network: " + connectedNetwork);
		connectedNetwork = null;
	}
	@Override
	public void pairDevice(String deviceName){
		this.pairedDevice = deviceName;
		System.out.println("Paired with Bluetooth device: " + deviceName);
	}
	@Override
	public void unpairDevice(){
		System.out.println("Unpaired Bluetooth device: " + pairedDevice);
		pairedDevice = null;
	}
	public void playMusic(String songName){
		System.out.println("Now Playing: " + songName);
	}
}
class smartDeviceDemo{
	public static void main(String[] args){
	SmartSpeaker speaker = new SmartSpeaker();
	// WiFi Operations
	speaker.connectToWiFi("Home_WiFi");
	speaker.playMusic("Shape of You");
	speaker.disconnectWiFi();
	System.out.println();
	speaker.pairDevice("Smartphone");
	speaker.playMusic("Believer");
	speaker.unpairDevice();
	}
}