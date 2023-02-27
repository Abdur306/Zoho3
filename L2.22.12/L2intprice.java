import java.util.*;
class L2intprice{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter n");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int sum=0;
System.out.println("enter k");
int k=s.nextInt();
for(int i=0;i<n-1;i++){ /*3,2,6,5,0,3*/

if(a[i+1]-a[i]>0){
	sum+=a[i+1]-a[i];
    k--;
 }
 if(k==0)
	 break;

}
System.out.println(sum);
}
}