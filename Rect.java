import java.util.*;
public class Rect
{
	int l,b;
	void area()
	{
		int a=l*b;

		System.out.println("The area is "+a);
	}
	Rect(int i, int j)
	{
		System.out.println("Constructor called");
		l=i;
		b=j;
	}
	public static void main(String s[])
	{
		/*Rect r1=new Rect(12,9);
		Rect r2=new Rect(15,18);
		r1.area();
		r2.area();*/
		int x,y;
		Scanner p=new Scanner(System.in);
		System.out.print("Enter length & breadth ");
		x=p.nextInt();
		y=p.nextInt();
		Rect r=new Rect(x,y);
		r.area();
	}
}