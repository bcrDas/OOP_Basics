package main_pac;

public class mod_1 {

	public int v1; // Accessible everywhere(Same applicable for public classes and functions also).
	protected int v2; // Accessible only with the same package only(Same applicable for protected
						// classes and functions also).
	private int v3; // Accessible only within the same class only(Same applicable for private
					// classes and functions also).

	public mod_1() {

		v1 = 1;
		v2 = 2;
		v3 = 3;
	}

}
