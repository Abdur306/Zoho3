import java.util.*;
class L2Str4{
public static void  main(String[] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
int max=0;
for(int i=0;i<str.length()-1;i++){
	   int c1=1;
	for(int j=i+1;j<str.length()-1;j++){
	if(str.charAt(i)==str.charAt(j))
		 break;
	 else if(str.charAt(j+1)==str.charAt(j))
		 break;
	 else
		 c1++;
	}
	if(max<c1)
		max=c1;
}
System.out.println(max);
}
}