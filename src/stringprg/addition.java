package stringprg;

public class addition {
public static void main(String[] args) {
	int i=12345;
	int sum;
	for(sum=0;i>0;i=i/10) {
		sum=sum+i%10;
		
	}
	System.out.println("addition of number:"+sum);
}
}