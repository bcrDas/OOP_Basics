package static_keyword;

public class static_main {
 
    // Static create only one instance only,no copy 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		static_1 s1 = new static_1("box1");
		static_1 s2 = new static_1("box2");
		static_1 s3 = new static_1("box3");
		
		s1.printName();
		s2.printName();
		s3.printName();
		
		s1.print_number_of_boxes();
		s2.print_number_of_boxes();
		s3.print_number_of_boxes();
	}

}
