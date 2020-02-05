
public class poly_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		animal a1 = new animal(); // class instantiation.
		animal c1 = new cow();
		animal g1 = new goat();
		
		animal[] animals = { a1, c1, g1 } ;
		
		for( animal a : animals )
		{
			a.dis_name() ;
			
		}
		
	 }
	
}
