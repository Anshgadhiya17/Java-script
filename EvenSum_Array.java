import java.util.*;
public class EvenSum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		int a[];

	
		System.out.println("enter array size: ");
		n=sc.nextInt();
		a=new int[n];
         
         for(int i=0;i<n;i++){
             System.out.println("enter no. ");
         	a[i]=sc.nextInt();
         	if(a[i]%2==0){
         		sum=sum+a[i];
         	}
         }
         System.out.println(sum);
	}
}