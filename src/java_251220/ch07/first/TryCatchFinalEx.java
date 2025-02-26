package java_251220.ch07.first;

import java.awt.Toolkit;
import java.util.Iterator;

public class TryCatchFinalEx {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}		
		}				
	}
	
	public void abc() throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			Thread.sleep(500);
			
		}		
	}
	
	public void xyz() throws InterruptedException {
		abc();
			
	}
	
}


