import java.util.*;
class Task07{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the values");
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
int mid1,mid2;
if(n%2==0){
	 mid1=n/2;
	 mid2=n/2;
}
else{
	mid1=n/2;
	mid2=n-mid1;
}
int b[]=new int[mid1];
int c[]=new int[mid2];
for(int i=0;i<mid1;i++){
	b[i]=a[i];
}
for(int i=0;i<mid2;i++){
	c[i]=a[i+mid1];
}
System.out.println(Arrays.toString(b));
System.out.println(Arrays.toString(c));
}
}