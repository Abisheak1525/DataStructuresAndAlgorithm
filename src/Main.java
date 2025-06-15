
import java.util.Scanner;

class ComplexNumbers {
	private int re;
	private int im;
	// Write your code here
	ComplexNumbers(int re, int im){
		this.re = re;
		this.im = im;
	}

	public void Add(int c, int d){
		re += c;
		im += d;
	}

	public void Mul(int c, int d){
		int a = re;
		int b = im;
		re = (a*c)-(b*d);
		im = (a*d)+(b*c);
	}

	public void Print(){
		System.out.println(re+" + i"+im);
	}
}

class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();	    
		int b = sc.nextInt();	
		
		ComplexNumbers c1 = new ComplexNumbers(a, b);
		
		int c = sc.nextInt();	    
		int d = sc.nextInt();

		int n = sc.nextInt();
		if(n == 1){
			c1.Add(c, d);
		}
		else{
			c1.Mul(c, d);
		}
		c1.Print();
		sc.close();
	}
}
		