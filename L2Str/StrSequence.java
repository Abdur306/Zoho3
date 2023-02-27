import java.util.*;
public class StrSequence{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);	
String str=s.next();
Sequence(str,0,"");
}
public static void Sequence(String str,int index,String s2){
	if(index==str.length()){
		System.out.println(s2);
		return;
	}
	s2+=str.charAt(index);
	Sequence(str,index+1,s2);
	String s3=Rev(s2,0,s2.length()-1);
	Sequence(str,index+1,s3);
}
public static String Rev(String str,int st,int ed){
	String temp="";
	for(int i=st;i<ed;i++){
		temp+= str.charAt(i);
	}
	return temp;
}
}