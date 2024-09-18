package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the value of n?");
		int n = in.nextInt();
		boolean [] primeArray2 = new boolean [n];
		for (int i=0; i<n; i++) {
			primeArray2[i]= true;
			
		}
		
		
			for(int p=2; p<Math.sqrt(n);p++) 
			{
				if(primeArray2[p] == true) {
					for(int l = 0; (p*p+(l*p))<n; l++) {
						primeArray2[(p*p+(l*p))] = false;
						System.out.println(primeArray2[l]);
						System.out.println((p*p+(l*p)));

					}

				}
			}
			
		}

	}
