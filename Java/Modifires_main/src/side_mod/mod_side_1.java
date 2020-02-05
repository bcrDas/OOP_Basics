package side_mod;

public class mod_side_1 {
	
	public int vs1; // Accessible everywhere(Same applicable for public classes and functions also).
	protected int vs2; // Accessible only with the same package only(Same applicable for protected
						// classes and functions also).
	private int vs3; // Accessible only within the same class only(Same applicable for private
					// classes and functions also).

	public mod_side_1() {

		vs1 = 4;
		vs2 = 5;
		vs3 = 6;
		
	}
	
}
