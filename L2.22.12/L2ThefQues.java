import java.util.*;
class L2ThefQues{
public static void main(String []abu){
Scanner s=new Scanner(System.in);
System.out.println("enter size");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
int sum1=0;
int sum2=0;
int c=0;

for(int i=0;i<n;i++){
	c=sum1+a[i];
	sum1=sum1>sum2?sum1:sum2;
     
     sum2=c;
}
 System.out.println(sum1>sum2?sum1:sum2);
}
}

/*
public static void even(int a[]){
	for(int i=0;i<n;i+=2)
		sum1+=a[i];
	System.out.println(sum1);
}
public static void odd(int a[]){
	
	for(int i=1;i<n;i+=2)
		sum2+=a[i];
	System.out.println(sum2);
}/*
if(sum1>sum2)
	System.out.println(sum1);
else
	System.out.println(sum2);
*/