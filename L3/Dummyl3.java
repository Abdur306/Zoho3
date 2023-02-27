import java.util.*;
class Dummyl3{
public static void main(String [] abu){

Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s.nextInt();
	String board[][]=new String[size][size];
	int n=board.length;
	int mid=size/2;
	
		for(int i=0;i<=board.length-1;i++){
		for(int j=0;j<=board.length-1;j++){
		 if(i==0||j==board.length-1 ||j==0){

             board[i][j]="W";

		  } 
        else if(i==board.length-1 && j==mid){
          board[i][j]="O";
		}
       else if(i==board.length-1 && j>0 && j<board.length-1){
		 board[i][j]="G";  
		}
		else{
			board[i][j]=" ";
		}
	 }
		}
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		System.out.print(board[i][j]+" ");	
		}
		System.out.println();
	}
	Dis(board,n);
}

public static void Dis(String B[][],int N){
		Scanner s2=new Scanner(System.in);
		System.out.println("Bricks row position");
		int bposr=s2.nextInt();
		System.out.println("Bricks column position");
		int bposc=s2.nextInt();
		System.out.println("enter brick type");
		int btype=s2.nextInt();
		for(int i=bposr;i<=N-4;i++){
			for(int j=bposc;j<=N-4;j++){
				if(i==j||j<=N-3){
				B[i][j]="1";	
				}
				else{
					B[i][j]=" ";
				}
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
			}
			
			}
			}