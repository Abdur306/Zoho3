import java.util.*;
class Task407{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the a1 size");
int n=s.nextInt();
int a[]=new int[n];int count=0;
System.out.println("enter the a1 elements");
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
System.out.println("enter the a2 size");
int m=s.nextInt();
int b[]=new int[m];
System.out.println("enter the a2 elements");
for(int i=0;i<m;i++){
	b[i]=s.nextInt();
}
int c[]=new int[m+n];
int index=0;
for(int i=0;i<n;i++,index++){
	c[index]=a[i];
}
for(int i=0;i<m;i++,index++){
	c[index]=b[i];
}
System.out.println(Arrays.toString(c));
for(int i=0;i<c.length;i++){
	for(int j=i+1;j<c.length;j++){
		if(c[i]==c[j]){
		c[j]=0;
		//count++;
		}
	}
}
for(int i=0;i<c.length;i++){
	if(c[i]!=0){
		count++;
	}
}
System.out.println(count);

}
}
