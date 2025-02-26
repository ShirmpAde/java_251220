package java_251220.ch05.first;

import java.awt.Toolkit;

public class BeepPrintRunnable {
	
	Thread thread = new Thread(new Runnable() {
		
		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i <5; i++) {
				toolkit.beep();
				try {Thread.sleep(500);} catch (Exception e) {}
			}
		}
	});
}
