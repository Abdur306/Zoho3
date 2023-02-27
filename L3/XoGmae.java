import java.util.*;
class XoGmae{
public static void main(String[] abu){

Xo xo=new Xo();
xo.Display();

}
}
class Xo{
	int a[][]=new int[3][3];
	public void Display(){
		for(int i=1;i<=3;i++){
			for(int j=0;j<3;j++){
				
				a[i][j]=i;
			}
		}
		for(int i=1;i<=3;i++){
			for(int j=0;j<3;j++){
				
				System.out.println(a[i][j]+" ");
			}
		}
		
		
	}
	
	
}