package acessSpecifierTest;
public class GetterAndSetter {
	private int password = 1234;
	
//	Getter method is used to read value in the variable which is private,protected and default.
	public int getPassword() {
		return password;
	}
//	Setter method is used to write value in the variable which is private,protected and default.
	public void setPassword(int pass) {
		password = pass;
	}
}