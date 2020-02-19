/**
 * This class models a television
 * @author aslazer
 * 
 */
public class Television {

	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	boolean powerOn;
	private int channel;
	private int volume;
	
	/**
	 * parameterized constructor, creates a television 
	 * object with a brand and size
	 * @param brand brand of television
	 * @param size size of screen
	 */
	public Television(String brand, int size) {
		
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	/**
	 * sets the channel number 
	 * @param station channel number
	 */
	public void setChannel(int station) {
		
		channel = station;
	}
	/**
	 * turns the power on/off
	 */
	public void power() {
		
		powerOn = !powerOn;
	}
	/**
	 * increases the volume
	 */
	public void increaseVolume() {
		
		volume++;
	}
	/**
	 * decreases the volume
	 */
	public void decreaseVolume() {
		
		volume--;
	}
	/**
	 * gets the channel number
	 * @return returns the channel number
	 */
	public int getChannel() {
		
		return channel;
	}
	/**
	 * gets the volume level
	 * @return returns the volume level
	 */
	public int getVolume() {
		
		return volume;
	}
	/**
	 * gets the brand of television
	 * @return returns the brand of television
	 */
	public String getManufacturer() {
		
		return MANUFACTURER;
	}
	/**
	 * gets the screen size
	 * @return returns the screen size
	 */
	public int getScreenSize() {
		
		return SCREEN_SIZE;
	}
}
