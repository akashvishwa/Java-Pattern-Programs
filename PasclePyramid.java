//program for pascle pyramid
import java.util.*;
public class PasclePyramid{
	
	public static void main(String...args){
		Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();
		int c=0;
        for(int i=0;i<n;i++){
			c=0;
			for(int j=0;j<n*2-1;j++){
			if(i+j>=n-1&&j<=i+n-1&&c==0){
				System.out.print("*");
				c=1;
				
			}else
			{
				if(j==i+n)
					break;
				
				System.out.print(" ");
				c=0;
			}			
		}
		System.out.println(" ");
		}
		
	}
	
}