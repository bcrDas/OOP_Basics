package this_main;

public class this_1 {
	
	public String first, middle, last; // Accessible only within the same class only(Same applicable for private
					// classes and functions also).

	public this_1(String first, String middle, String last) {

		this.first = first ;
		this.middle = middle ;
		this.last = last ;
		
		System.out.println("The name is : " + this );
		
	}
	
	public String toString() // How ' this ' and ' t1 ' will be look like as a string here.
	{
		
		return new String(first + " " + middle + " " + last);
		
	}
	
	
	}
