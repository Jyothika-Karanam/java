import java.util.Scanner;
class Jyo{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
int n,rev=0;
System.out.println("enter n");
n=ob.nextInt();
while(n>0){
int digit=n%10;
 rev=rev*10+digit;
n=n/10;
}
System.out.println("the reverse number"+rev);
}
}
