package test;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args)
	{
		int val1,val2,result=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of val1");
		val1=obj.nextInt();
		System.out.println("Enter the value of val2");
		val2=obj.nextInt();
		System.out.println("choose ur option : \n 1.Addition 2.Subtraction 3.Multiplicatin 4.Division");
		int choice=obj.nextInt();
		switch(choice)
		{
		case 1:
			result=val1+val2;
			break;
		case 2:
			result=val1-val2;
			break;
		case 3:
			result=val1*val2;
			break;
		case 4:
			result=val1/val2;
			break;
		}
			
		System.out.println("result"+result);
	}
}
