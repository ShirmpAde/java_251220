package java_251220.ch04.third;

public class Television implements RemoteControl {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("소리를 키웁니다.");		
	}
	
	
}
