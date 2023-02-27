import java.util.*;
class BallBrick{
public static void main(String [] abu){
Brick board=new Brick();
board.SetBoard();

}
}
class Brick{
	public void SetBoard(){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s.nextInt();
	String board[][]=new String[size][size];
	int limit=0;int l=0;int r=size-1;int n=size;
	while(limit<size){
		for(int i=l;i<=r;i++){
		for(int j=l;j<=r;j++){
		 if(i==l||j==l ||j==r){

             board[i][j]="W";

		  } 
        else{
          board[i][j]="G";
		}			
		}
	}
		limit++;l++;r--;size--;
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		System.out.print(board[i][j]+"  ");	
		}
		System.out.println();
	}
	}
	
	
}