import java.util.*;
class program3{
     public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float a;
		float b;
		System.out.println("Enter floating point no. : ");
		a = s.nextFloat();
		System.out.println("Enter floating point no. : ");
		b = s.nextFloat();
		a = Math.round(a*1000);
		a=a/1000;
		b = Math.round(a*1000);
		b=b/1000;
		if(a==b){
			System.out.print("Same");
		} 
		else {
			System.out.print(" Not Same");
		}

	}
}