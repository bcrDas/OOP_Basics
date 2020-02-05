package side_mod;

import main_pac.mod_1;

public class mod_side_main {
	
	static int r;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mod_1 m2 = new mod_1();
		
		r = m2.v1;
		//r = m2.v2; // protected so can't accessible by other packages.
	    //r = m2.v3; // private so only accessible by that class only.
		
		System.out.println(r);
		
	}
	
}
