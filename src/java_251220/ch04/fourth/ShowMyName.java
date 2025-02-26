package java_251220.ch04.fourth;

public class ShowMyName implements Member {

	@Override
	public void user() {
		System.out.println("내 이름은 User.실제이름");	
	}

	@Override
	public void admin() {
		System.out.println("내 이름은 Admin.실제이름");
		
	}

}
