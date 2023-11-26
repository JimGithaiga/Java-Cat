import java.util.Scanner;
 public class leapyear{
	public static void main(String[]args){
	
Scanner input = new Scanner(System.in);

	int year;
	int num=4;
	

System.out.println("Enter the year");
 year=input.nextInt();
  
	
if(year%num == 0)
{
	System.out.println("This year is a leap");
}
else
{
	System.out.println("This year is not a leap year!");
}

 }
}