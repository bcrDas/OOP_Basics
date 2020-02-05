import java.util.EnumSet ; 

public class enum_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fruit g = fruit.Guava ; // Enum accessing,can't instantiate because it's all const.
		
		for( fruit f : fruit.values())
		{
			
			System.out.println("The fruit is " + f + " and the color is " + f.color + ".") ;	
			
		}
		
		System.out.println(" \n ") ;	
		
		for(fruit f : EnumSet.of(fruit.Guava, fruit.Grape))
		{
			
			System.out.println("The fruit is " + f + " and the color is " + f.color + ".") ;
			
		}
		
		System.out.println(" \n ") ;
		
		for(fruit f : EnumSet.range(fruit.Guava, fruit.Grape))
		{
			
			System.out.println("The fruit is " + f + " and the color is " + f.color + ".") ;
			
		}
		
	    }

}
