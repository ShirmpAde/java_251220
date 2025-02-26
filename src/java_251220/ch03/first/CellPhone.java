package java_251220.ch03.first;

public class CellPhone {
	
	//parent class
	
	//필드
	String model;
	String color;
	
	//생성자
	CellPhone() {
		
	}
	
	CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void cell(String model, String color) {
		System.out.println();
	}	
	//메소드
	void powerOn() { 
		System.out.println("전원을 끕니다.");	 
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
