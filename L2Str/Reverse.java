import java.util.*;
class Reverse{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String []str=new String[3];
for(int i=0;i<3;i++)
	str[i]=s.next();

for(int i=str.length()-1;i>=0;i--)
	System.out.println(str[i]);
}
}