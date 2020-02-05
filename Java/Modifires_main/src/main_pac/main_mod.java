package main_pac;

///import java.util.Scanner;
import side_mod.mod_side_1;

public class main_mod {
	

		static int p;

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			mod_1 m2 = new mod_1();
			mod_side_1 ms1 = new mod_side_1();

			p = m2.v1;
			p = m2.v2;
			// p = m1.v3; // private so can't accessible by other classes.
			p = ms1.vs1;
			//p = ms1.vs2; // protected so can't accessible by other packages.
			//p = ms1.vs3; // private so only accessible by that class only.
		
			System.out.println(p);

		}

	}

