package java_251220.ch03.first;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
					
//		CellPhone cellPhone = new CellPhone();		
//		cellPhone.model = "SAMSUNG";
//		cellPhone.color = "Black";
//		System.out.println();
//		
//		CellPhone cellPhone1 = new CellPhone();
//		cellPhone.model = "iPhone";
//		cellPhone.color = "16";
//		System.out.println(cellPhone1.model);
//		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		dmbCellPhone.model = "SAMSUNG2";
		dmbCellPhone.color = "Black2";
		System.out.println(dmbCellPhone.model);
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		
		CellPhone cellPhone2 = new CellPhone("iphone 16e", "Black");
		System.out.println(cellPhone2.model);
	}

}
