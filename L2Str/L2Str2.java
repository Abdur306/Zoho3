import java.util.*;
class L2Str2{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
char c[]=str.toCharArray();
int size=c.length;
int b[]=new int[size];
for(int i=0;i<size;i++)
	b[i]=-1;
for(int i=0;i<size;i++){
	int count=1;
	for(int j=i+1;j<size;j++){
		if(c[i]==c[j]){
			count++;
			b[j]=0;
		}
	}
	if(b[i]!=0)
		b[i]=count;
}
for(int i=0;i<size;i++){
	if(b[i]>0)
	System.out.println(c[i]+" "+b[i]);
}
}
}