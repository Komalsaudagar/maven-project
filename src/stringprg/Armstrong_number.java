package stringprg;

import java.util.Scanner;
*********88************5555555555555555
public class Armstrong_number {
public static void main(String[] args) {
	//armstrong number==153=1^3+5^3+3^3=1+125+27=153
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no.");
	int num=sc.nextInt();
	int original=num;
	int sum,rem;
	for(sum=0;num>0;num=num/10) {
		rem=num%10;
		sum=sum+rem*rem*rem;//27+125+1
		
	}
	if(original==sum) {
		System.out.println("Armstrong number");
	}
	else {
		System.out.println("not armstrong number");
	}
}
}
