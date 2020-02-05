package static_keyword;

public class static_1 {
	
	public String name;
	public static int number_of_boxes = 0 ;
	
	public static_1(String n)
	{
		
		name = n ;
		number_of_boxes++ ;
	}
	
	public void printName()
	{
		
		System.out.println("My name : " + name);
	}
	
	public static void print_number_of_boxes()
	{
		
		System.out.println("Total no. of boxes : " + number_of_boxes);
	}

}
