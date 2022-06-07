package stringprg;
********************
public class decimal_binary {
	public static void main(String[]args){
		int n=9;
		int t=n;
		int rem;
		String k="";
		while(t>=1){
		rem=t%2;
		k=rem+k;
		t=t/2;
		}
		System.out.println(k);
		}
}
