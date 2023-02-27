import java.util.*;
class L2Str1{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
//n+=1;
String str[]=new String[n];
for(int i=0;i<n;i++)
	str[i]=s.next();
System.out.println("Enter 1.Odd || 2.Even");
int in=s.nextInt();

if(in==1){
	for(int i=0;i<n;i+=2){
		
		str[i]=Evrev(str[i]);
	}
}
else if(in==2){
	for(int i=1;i<=n;i+=2){
		String temp1;
		str[i]=Odrev(str[i]);
	}

}
System.out.println(Arrays.toString(str));
}
public static String Evrev(String stt){
	String temp="";
	for(int i=stt.length()-1;i>=0;i--){
		temp+=stt.charAt(i);
	}
	return temp;
		
}
public static String Odrev(String stt1){
	String temp1="";
	for(int i=stt1.length()-1;i>=0;i--){
		temp1+=stt1.charAt(i);
	}
	return temp1;
		
	
	
}
}