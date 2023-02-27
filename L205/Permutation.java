import java.util.*;
public class Per{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String s=scan.next();
		char str[]=s.toCharArray();
		per(str,0,str.length-1);
	}
	public static void per(char str[],int start,int end){
		if(start==end){
			for(int i=0;i<str.length;i++)
			{
				System.out.print(str[i]+" ");
				
			}System.out.println();
			return;
		}
		for(int i=start;i<=end;i++){
			swap(str,i,start);
			per(str,start+1,end);
			swap(str,i,start);
		}
	}
	public static void swap(char str[],int i,int j){
		char temp=str[i];
		str[i]=str[j];
		str[j]=temp;
	}
}	


