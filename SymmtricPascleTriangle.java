//symmetric pascle Triangle   or Diamond with *
import java.util.Scanner;
public class SymmtricPascleTriangle{
	
	
	public static void main(String...args){
		Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();
	    if(n%2==1){
		int c=0,i;
        for(i=0;i<n/2+1;i++){
			c=0;
			for(int j=0;j<n;j++){
			if(i+j>=n/2&&j<=i+n/2&&c==0){
				System.out.print("*");
				c=1;
				
			}else
			{
              if(j==i+n/2+1)
					break;
				
				System.out.print(" ");
				c=0;
              
			}			
		}
		System.out.println(" ");
		}
		for(i=n/2+1;i<n;i++){
			c=0;
			for(int j=0;j<n;j++){
			if(j>=i-n/2&&i+j<=(n*3/2)&&c==0){
				System.out.print("*");
				c=1;
				
			}else
			{
				if(i+j==n*3/2)
					break;
				
				System.out.print(" ");
				c=0;
			}			
		}
		System.out.println();
		}
		
		
	}else{
		System.out.print("Invalid line number");
	}
	}
	
}