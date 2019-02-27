package Exercises;
import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,5,5,6};
		int n=13;
		//System.out.println(less(a));
		//System.out.println(Arrays.toString(lessAndHigher(a)));
		//System.out.println(find(a, n));
		//System.out.println(order(a));
		//System.out.println(cousin(15));
		//System.out.println(quantityPrime(a));
		System.out.println(diferent(a));
	}
	public static int less(int a[]) {
		Arrays.sort(a);
		return a[0];
	}
	public static int higher(int a[]) {
		Arrays.sort(a);
		return a[a.length-1];
	}
	public static int [] lessAndHigher(int a[]) {
		int b[]=new int[2]; 
		Arrays.sort(a);
		b[1]=a[a.length-1];
		b[0]=a[0];
		return b;
	}
	public static int find(int a[], int n) {
		for (int i = 0; i < a.length; i++) 
			if(a[i]==n) 
				return i;
		return -1;
	}
	public static boolean order(int a[]) {
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]>a[i+1])
				return false;
		}
		return true; 
	}
	public static boolean prime(int n) {
		int cont=0; 
		for (int i = n; i > 0; i--) {
			if(n%i==0) {
				cont++;
			}
			if(cont>2) {
				return false; 
			}
		}return true;
	}
	public static int quantityPrime(int a[]) {
		int cont=0; 
		for (int i = 0; i < a.length; i++) {
			if(prime(i)==true)
				cont++;
		}return cont;
	}
	public static int diferent(int a[]) {
		int cont=0; 
		Arrays.sort(a); 
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]!=a[i+1])
				cont++;
		}return cont+1;
	}

}
