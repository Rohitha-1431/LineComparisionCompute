package com.bridgelabz.linecomparisioncompute;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("welcome to line cmparision program");		
	}
	static int x1=10;
	static int x2=40;
	static int y1=30;
	static int y2=40;
	int length1=0;
	int length2=0;
	public void calLengthUC1()
	{
		System.out.println("UC1 output:");
		double length=0;
		length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1), 2));
		System.out.println("Length : "+length);
	}
	public void checkEqualUC2()
	{
		System.out.println("UC2 output:");
		 length1=x2-x1;
		 length2=y2-y1;
		 boolean res=num1.equals(num2);
		 if(res==true)
		 {
			 System.out.println("two lines are equal");
		 }
		 else
		 {
			 System.out.println("Two lines are not equal");
		 }
		 if(length1==length2)
		 {
			 System.out.println("two lines are equal");
		 }
		 else
		 {
			 System.out.println("Two lines are not equal");
		 }
	}
	public void checkGrtLesUC3()
	{
		System.out.println("UC3 output:");
		 if(length1<length2)
		 {
			 System.out.println("line1 is less than line2");
		 }
		 else if(length1>length2)
		 {
			 System.out.println("line1 is greater than line2");
		 }
		 else
		 {
			 System.out.println("lines are equal");
		 }
	}
}
