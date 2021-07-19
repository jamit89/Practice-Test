import java.util.Scanner;

public class PrintName {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The First Name:");
		String str1=sc.next();
		System.out.println("Enter the Last Name:");
		String str2=sc.next();
		System.out.println("Hello \n"+str1+" "+str2);
	}
}
