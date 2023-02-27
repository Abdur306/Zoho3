import java.util.*;
class BallBrick2{
public static void main(String [] abu){
Brick board=new Brick();
board.SetBoard();

}
}
class Brick{
	int count=3;
	public void SetBoard(){
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
	Display1(board,n);
	}
	
	public void Dis(String B[][],int N){
		Scanner s1=new Scanner(System.in);
		System.out.println("Y-Yes || S-Show || 3.N-Next");
		String str=s1.next();
		do{
			switch(str){
				case "Y":
				     Display1(B,N);  
				    break;
				case "S":
				     Show(B,N);
				    break;
				case "N":
				
				  break;
			}
			
		}while(str!="N");
	}
	public void Display1(String B[][],int N){
		Scanner s2=new Scanner(System.in);
		System.out.println("Bricks row position");
		int bposr=s2.nextInt();
		System.out.println("Bricks column position");
		int bposc=s2.nextInt();
		System.out.println("enter brick type");
		String btype=s2.next();
		
				B[bposr][bposc]=btype;
        Dis(B,N);				
	}						
		public void Show(String B[][],int N){	
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
			}
			System.out.println("The Ball Count is "+count);
			Dis(B,N);
			Straight_traverse(B,N);
			
	
	}
	public void Straight_traverse(String B[][],int N){
		
		
	}
	
}