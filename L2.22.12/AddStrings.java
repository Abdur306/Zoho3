import java.util.*;
class AddStrings{
public static void main(String []abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
ArrayList<String>ars=new ArrayList<String>();
for(int i=0;i<n;i++)
	ars.add(i,s.next());
//for(String data:ars)
	System.out.println(ars);
	ars.set(0,"abu");
	System.out.println(ars);
	System.out.println(ars.indexOf("grey"));
	ars.remove(0);
	System.out.println(ars);
	Collections.sort(ars);
	System.out.println(ars);
	ArrayList<String>ars2=new ArrayList<String>(ars);
	System.out.println("second arr is :");
	for(int i=0;i<n;i++){
		ars2.add(i,s.next());
	}
	System.out.print(ars2);
}
}
