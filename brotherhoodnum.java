import java.util.Scanner;
public class brotherhoodnum {
    public static void main(String[]args) 
    {
        Scanner sc=new Scanner(System.in);
int x,y;
System.out.println("Enter the number ");
x=sc.nextInt();
y=sc.nextInt();
int s1,s2;
brotherhoodnum obj=new brotherhoodnum();
s1=obj.sumofproperdiviser(x);
s2=obj.sumofproperdiviser(y);
if(s1==y+1 && s2==x+1)
System.out.println(x+" and "+y+"are brotherhood number");
else
System.out.println(x+" and "+y+"are not brotherhood number");

 hello();
    }
     int sumofproperdiviser(int x)
    {
       int i,s=0;
       for(i=1;i<=x/2;i++)
       if(x%i==0)
       s=s+i;
       return s;
    }
    static void hello(){
        System.out.println("hello");
    }

}
