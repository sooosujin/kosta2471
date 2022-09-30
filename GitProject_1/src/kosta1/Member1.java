package kosta1;

public class Member1 {
	
	public Member1() {}
	
	private String name;
	private int phoneNum;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Member1(String name, int phoneNum) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	

}
