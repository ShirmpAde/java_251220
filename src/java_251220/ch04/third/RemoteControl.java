package java_251220.ch04.third;

public interface RemoteControl {

	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; // public static final 생략 가능
	final String name = "ansdf";
	
	// 추상메서드 :
	public abstract void turnOn();
	void turnOff(); // public abstract 생략 가능
	void setVolume(int volume);
	
}
