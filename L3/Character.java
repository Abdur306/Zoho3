import java.util.*;
class XoGame{
	static Scanner s=new Scanner(System.in);
	static String a[][]=new String[3][3];
public static void main(String[] abu){
	a[0][0]="1";
        a[0][1]="2";
		a[0][2]="3";
        a[1][0]="4";
		a[1][1]="5";
		a[1][2]="6";
		a[2][0]="7";
		a[2][1]="8";
		a[2][2]="9";
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	game(a);

}

	
	public static void game(String a[][])
	{
		System.out.println("Enter a number :");
		int n = s.nextInt();
		a[0][n-1]="X";
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
		