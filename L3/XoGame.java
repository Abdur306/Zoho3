import java.util.*;
class XoGame{
public static void main(String[] abu){

Xo xo=new Xo();
xo.Display();

}
}
class Xo{
	static Scanner s=new Scanner(System.in);
	String a[][]=new String[3][3];
	String p1="X";
	String  p2="O";
	static int count=0;
	
	public void Display(){
		a[0][0]="1";
        a[0][1]="2";
		a[0][2]="3";
        a[1][0]="4";
		a[1][1]="5";
		a[1][2]="6";
		a[2][0]="7";
		a[2][1]="8";
		a[2][2]="9";

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		Xset();
		    
	}
	public void Xset(){
		System.out.println("enter slot for X");
		String slot1=s.next();
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(a[i][j].equals(slot1))
					a[i][j]=p1;
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		result(slot1);
		count++;
		System.out.println(count);
       if(count!=9){		
		Oset();
	   }
	   else{
		   System.out.println("Game over");
	   }
	}
	
	public void Oset(){
		System.out.println("enter slot for O");
		 slot1=s.next();
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(a[i][j].equals(slot2))
					a[i][j]=p2;
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
        result(slot1);		
		count++;
		Xset();
	}
	
	public void result(String slot1){
    int count1=0,count2=0,count3,count4=0;
		for(int i=0;i<3;i++)
		{
			int m=0;
			for(int j=0;j<3;j++)
			{
				if(a[i][m]==slot1)
				{
					m++;
					count1++;
					if(count1==3)
					{
						print(a);
						System.out.println(" Conratulations !!"+op+"'s won the match ");
						System.exit(0);
					}
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j && a[i][j]==slot1)
				{
					count2++;
					if(count2==3)
					{
						print(a);
						System.out.println(" Conratulations !!"+op+"'s won the match ");
						System.exit(0);
					}
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]==slot1)
				{
					count3=0;
					for(int m=i;m<3;m++)
					{
						if(a[m][j]==op)
						{
							count3++;
							if(count3==3)
							{
								print(a);
									System.out.println(" Conratulations !!"+op+"'s won the match ");
									System.exit(0);
							}
						}
					}
				}
			}
		}
		for(int i=0,j=2;i<3 && j>=0;i++,j--)
		{
			if(a[i][j]==op)
			{
				count4++;
				if(count4==3)
				{
					print(a);
					System.out.println(" Conratulations !!"+op+"'s won the match ");
					System.exit(0);
				}
			}
		}
 }
 

	
	
	
	
	
	
	
