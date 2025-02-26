package java_251220.ch02.third;

public class Arithmetic {
	
	int a;
	int b;
	
	Arithmetic(){
		
	}
	
	Arithmetic(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void plus(int a, int b) {		
		System.out.printf("%d + %d = %d" ,a ,b ,a+b);
	}
}
