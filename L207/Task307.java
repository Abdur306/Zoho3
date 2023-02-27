import java.util.*;
class Task307{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
int a[]=new int[n];
int p=0;
int ne=0;
int oo=0;
int ee=0;
int z=0;
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
	if(a[i]<0){
		ne++;
		if(a[i]%2==0){
		ee++;
		}
		else
			oo++;
	}
	else if(a[i]>0){
		p++;
		if(a[i]%2==0){
		ee++;
		}
		else
			oo++;
	}
	else{
		z++;
		}
}
	
System.out.println("positive "+p+"\n"+"negative "+ne+"\n"+"odd "+oo+"\n"+"even "+ee+"\n"+"zero "+z+"\n");


}
}