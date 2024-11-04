package acessSpecifierTest;
public class ShowPasswordAfterChange {
	public static void main(String[] args) {
		GetterAndSetter gs = new GetterAndSetter();
		System.out.println(gs.getPassword());
		gs.setPassword(1478);
		System.out.println(gs.getPassword());
	}
}