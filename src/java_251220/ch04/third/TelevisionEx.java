package java_251220.ch04.third;

public class TelevisionEx {
	
	public static void main(String[] args) {

// RemoteControl remoteControl = new RemoteControl(); //error
		
		Television television = new Television();
		television.turnOn();
				
		RemoteControl remoteControl = new Television();
		remoteControl.turnOn();
		
	}
}
