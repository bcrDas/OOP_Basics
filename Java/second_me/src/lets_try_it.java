import java.util.Scanner;

public class lets_try_it {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[] = new int[4];
		int a[][] = { { 6, 0, 4, 7 }, { 2, 5, 4 } };
		//int a[] = { 26, 0, 4 };
		//int sum = 0;
		
		//a[0] = 26;
		//a[2] = 4;
		/*for(int i : a)
		{
				sum += i;
		}*/
		for(int i = 0; i < a.length; i++)
		{
			
			for(int j = 0; j< a[i].length; j++)
			{
				
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		/*Scanner myScan = new Scanner(System.in);
		new_1 su = new new_1("Subhajit Das", 22);
		new_1 ar = new new_1();
		calculator cal_1 = new calculator();
		
		//su.name = "Subhajit Das";
		//su.age = 22;
		ar.name = "Arpita Paul";
		ar.age = 8;
		cal_1.name = "My Calc.(+, -, *, /)" ;
		System.out.println("Name : " + su.name + ", age : " + su.age);
		System.out.println("Name : " + ar.name + ", age : " + ar.age);
		System.out.print("Name : " + cal_1.name + ", Add : " + cal_1.add(2, 9));
		//System.out.print("Enter name : ");
		// String name = myScan.next();
		//String name = myScan.nextLine(); 
		//System.out.print("Enter age : ");
		//int age = myScan.nextInt(); 
		//System.out.println(name +" " + "you are welcome!!!" + ",age" + " " + age);
		 * 
		 */
		
		//System.out.print(sum);

	}

}
