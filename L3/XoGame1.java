import java.util.*;
class XoGame1{
	public static void result(char a[][],char op)
	{
class TicTacToe
{	
	static int n=1,count=0;
	
	public static void main(String[] args)
	{
		char a[][]=new char[3][3];
		char k='1';
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[i][j]=k;
					k++;
				}
			}
		game(a);	
	
	}
	public static void game(char a[][])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		getInput(a);
	}
	public static void getInput(char a[][])
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			if(n==1){
				System.out.println("Now X's turn......");
				System.out.println("Enter the number : ");
				char input=sc.next().charAt(0);
				char option='X';
				++n;
				setInput(a,input,option);	
			}
			else if(n==2)
			{
				System.out.println("Now O's turn......");
				System.out.println("Enter the number : ");	
				char input1=sc.next().charAt(0);
				char option='O';
				--n;
				setInput(a,input1,option);
			}
		}
	}
	public static void setInput(char a[][],char input,char op)
	{
		boolean c=true;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]==input)
				{
					count++;
					c=false;
					a[i][j]=op;
				}
			}
		}
		result(a,op);
		if(c)
		{
			System.out.println("The place is already filled !!!!");
			n=(n==2)?--n:++n;
		}
		if(count == 9)
		{
			print(a);
			System.out.println("The boxes are filled \n \tGAME OVER");
			System.exit(0);
		}
		game(a);
	}
	public static void result(char a[][],char op)
	{
		int count1=0,count2=0,count3=0,count4=0;
		for(int i=0;i<3;i++)
		{
			int m=0;
			for(int j=0;j<3;j++)
			{
				if(a[i][m]==op)
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
				if(i==j && a[i][j]==op)
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
				if(a[i][j]==op)
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
	public static void print(char a[][])
	{
		for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+"   ");
				}
				System.out.println();
			}
	}

}
				}
			}
		}
	}