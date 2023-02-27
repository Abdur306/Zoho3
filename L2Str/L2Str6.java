import java.util.*;
class L2Str6{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String str=s.nextLine();
//str+=" ";
String te="";int k=0;
String []sarr=new String[10];
for(int i=0;i<str.length();i++){
	if(str.charAt(i)!=32){
	if(str.charAt(i)>=65 && str.charAt(i)<=90 ||str.charAt(i)>=97 && str.charAt(i)<=122 )
		   //continue;
           	te+=str.charAt(i);			
	}
	else if(str.charAt(i)==32){
		sarr[k]=te;
	k++;
	te="";
	}
}int var1=0;
int var2=0;
String s1=s.next();
String s2=s.next();
for(int i=0;i<k;i++){
	if(s1.equals(sarr[i]))
		 var1=i;
	 if(s2.equals(sarr[i]))
		 var2=i;
}int c=0;
int res=var2-var1;
res-=1;

System.out.print(res+" ");
}
}