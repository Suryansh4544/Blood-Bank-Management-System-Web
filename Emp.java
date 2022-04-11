import java.util.Scanner;
class Emp{
public static void main(String arg[]){
double basic,da,ta,pf,netsal,gross;
String name;
int id;

Scanner sc=new Scanner(System.in);

System.out.println("Enter Emp id");
id=sc.nextInt();

System.out.println("Enter Emp name");
name=sc.next();

System.out.println("Enter Emp Basic Sal");
basic=sc.nextDouble();

da=basic*10/100;
ta=basic*12.65/100;
pf=basic*13.65/100;
netsal=basic+da+ta;
gross=netsal-pf;

System.out.println("The Emp id is "+id);
System.out.println("The Emp name is "+name);
System.out.println("The Emp da is "+da);
System.out.println("The Emp ta is "+ta);
System.out.println("The Emp pf is "+pf);
System.out.println("The Emp netsal is "+netsal);
System.out.println("The Emp gross sal is "+gross);

}
}