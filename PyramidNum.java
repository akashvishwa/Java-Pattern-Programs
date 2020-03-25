import java.util.Scanner;
public class PyramidNum{
	public static void main(String...args){
		Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();
		int c=0,sum=0;
        for(int i=0;i<n;i++){
			c=1;
			for(int j=0;j<n*2-1;j++){
			if(i+j>=n-1&&j<=i+n-1){
				System.out.print(c+" ");
				sum=sum+c;
				c++;
								
			}else
			{
				if(j==i+n)
					break;
				
				System.out.print("  ");
			}			
		}
		System.out.println();
		}
		System.out.println(sum);
	}
	

}