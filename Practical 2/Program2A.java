import java.util.*;
class Program2A{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[8];
        int i=0,m=0,n=0,sum=0;
	    
        System.out.println ("enter 1st binary number");
		int n1 = sc.nextInt();
	
        System.out.println ("enter 2nd binary number");
		int n2 = sc.nextInt();
		
        for(i=arr.length-1;i>=0;i--){
		    m=n1%10;
			n=n2%10;
			n1=n1/10;
			n2=n2/10;
			sum=m+n+arr[i];
	
			if(sum==1){
				arr[i]=sum;
			}
            else if(sum==2){
				arr[i]=0;
				arr[i-1]=1;
			}
            else if(sum==3){	
				arr[i]=1;
				arr[i-1]=1;
			}
			else{
                arr[i]=0;
			}
		}
        
        System.out.println("Addition of two binary numbers 
                            is");
		
        for(i=0;i<arr.length;i++){
			if(i==4){
                System.out.print(" ");
            }
        
            System.out.print(arr[i]);
		}
	}
}