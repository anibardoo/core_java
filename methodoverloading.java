public class methodoverloading{
     void sum(int a ,int b)
    {
        System.out.println(a+b);
    }
     void sum(double a ,double b)
    {
        System.out.println(a+b);
    }
     void sum(char a ,chart b)
    {
        System.out.println(a+b);
    }
    public static void main(String args[]){

        methodoverloading obj1=new methodoverloading();
        methodoverloading obj2=new methodoverloading();
        methodoverloading obj3 =new methodoverloading();
        obj1.sum(5,3);
        obj2.sum(5.5,3.2);
        obj3.sum('5','3');


    }
    
    main();
}