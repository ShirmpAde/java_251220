package java_251220.ch02.forth;

public class EarthEx {
	
	public static void main(String[] args) {
		
		System.out.println("제일 높은 건물의 높이는" + Earth.TOP_BUILDING);
		
		Earth earth = new Earth();
		System.out.println("제일 높은 건물의 높이는" + earth.topBuilding + "입니다.");
//	제일 높은 건물의 높이는 ???입니다.
	}
}
