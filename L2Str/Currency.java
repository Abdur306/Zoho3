import java.util.*;                     /* Currnecy count */
class Currency{
public static void main(String[] abu){
Scanner s=new Scanner(System.in);
int amt=s.nextInt();
curcount(amt);
}
public static void curcount(int amt){
	int notes[]={2000,500,200,100,50,20,10,5,1};
	int notecount[]=new int[notes.length];
	for(int i=0;i<notecount.length;i++){
		if(amt>=notes[i]){
			notecount[i]=amt/notes[i];
			amt=amt%notes[i];
			
		}
		if(notecount[i]!=0)
			System.out.println(notes[i]+"-"+notecount[i]);
		
	}
}
}