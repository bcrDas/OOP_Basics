package first_me;

public class my_test {

	public static void main( String[] args ) {
		// TODO Auto-generated method stub

		System.out.println(" \\ Let's Try!!! \" \u00A3 Bamm!!! \" ") ;
	//	System.out.println(" Average : " + avg( 5, 5, 5, 2 ) ) ;
		
	}
	
	
	
	
	public static float avg( int ... numbers ) // Variable length arguments
	{
		float sum = 0, average = 0 ;
		
		for( int i : numbers )
		{
			
			sum += i ;
			
		}
		
		
		average = sum / numbers.length ;
		return average ;
		
	} 
	
	

}
