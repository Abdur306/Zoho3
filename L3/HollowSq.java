import java.util.*;
class HollowSq{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int side=s.nextInt();
for(int i=1;i<=side;i++){
	for(int j=1;j<=side;j++){
		if(i==1||i==side||i==j|| j==1 || j==side|| j==side-i+1){
			System.out.print("* ");
		}
		else{
			System.out.print(" ");
		}
	}
	System.out.println();
}
}
}