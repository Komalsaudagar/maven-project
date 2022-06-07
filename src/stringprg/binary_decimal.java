package stringprg;

public class binary_decimal {
	*****************************
	public static void main(String []args){
		@@@@@@@@@@@@@@@@@@@@@@@
		int n=1021;
		int t=n;
		int rem,k=0,i=0;
		while(t!=0){
		rem=t%10;
		k=(int) (k+ rem*Math.pow(2, i++));
		t=t/10;
		}
		System.out.println(k);
		}}
