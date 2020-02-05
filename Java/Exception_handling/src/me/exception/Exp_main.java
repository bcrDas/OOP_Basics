package me.exception;

public class Exp_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y;
		
		try
		{
			
			//x = (Integer) null;
			//y = (Integer) null;
			x = 2;
			y = 4;
			
			//System.out.println("Product : " + (x * y)) ;
			PrintScreen("Product : " + (x * y));
			
		}catch(NullPointerException e)
		{
			
			System.out.println("There's a problem!!! \nPLease report to us.") ;
			
		}catch(Exception e)
		{
			System.out.println(" Error!!! ") ;
			
		}finally
		{
			
			System.out.println("Execution complete.") ;
		}
		

	}
	
	public static void PrintScreen(String s) throws NullPointerException
	{
		
		System.out.println(s) ;
		System.out.println(" OK !!! ") ;
		
	}

}
