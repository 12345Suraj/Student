/**
 * 
 */
package Quiz;

import java.util.Scanner;
import java.math.*;


/**
 * @author Suraj Singh
 * 
 */
public class Test {
	public Test() {
	}

	int fact(int x) {
		if (x == 0)
			return 1;
		else
			return (x * fact(x - 1));
	}

	void sumofmat(int r, int c, int a[][], int b[][]) {
		int x[][] = new int[r][c], i, j;
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				x[i][j] = a[i][j] + b[i][j];
			}
		}

		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				System.out.print(" " + x[i][j]);
			}
			System.out.println();
		}
	}

	boolean prime(int n) {
		int i, count = 0;
		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				count++;
		}
		if (count > 0)
			return false;
		else
			return true;
	}

	void swap(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x + " " + y);
	}

	void reverse(String str, int l) {
		String revstr = "";
		int i;
		for (i = 0; i < l; i++) {
			revstr = revstr + str.charAt(l - 1 - i);
		}
		System.out.println("Reverse of the string is" + revstr);
		if (str.equals(revstr)) {
			System.out.println("The given string is palindrom");
		} else {
			System.out.println("The given string is not palindrom");
		}
	}

	int second_largest(int a[], int n) {
		int lar = a[0], seclrg = -674535635, i;
		for (i = 0; i < n; i++) {
			if (a[i] > lar)
			{
				seclrg = lar;
			    lar = a[i];
			}
		}
		return seclrg;
	}

	static void reverseEachWordOfString(String str) {
		String[] words = str.split(" ");

		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}

			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(str);

		System.out.println(reverseString);

		System.out.println("-------------------------");
	}

//	int reverseofdigit(int n) {
//		int r, revse = 0;
//		while (n > 0) {
//			r = n % 10;
//			revse = revse * 10 + r;
//			n = n / 10;
//		}
//		return (revse);
//	}

	int sumofdigit(int n) {
		int sum = 0;
		sum = sum + n % 10;
		sumofdigit(n / 10);
		return (sum);
	}
	void star(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	void star2(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
				for (j = i; j < n; j++) {
					System.out.print("*");
				}
			System.out.print("\n");
		}
	}

	void star3(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	void Ques8(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(j % 2);
			}
			System.out.print("\n");
		}
	}

//	void Ques7(int n) {
//		int i, j;
//		for (i = 1; i <= n; i++) {
//			for (j = 1; j <= i; j++) {
//				if (j == 4)
//					System.out.print("1");
//				else
//					System.out.print(j % 4);
//			}
//			System.out.print("\n");
//		}
//	}

//	void Ques77(int n) {
//		int i, j;
//		for (i = 1; i <= n; i++) {
//			for (j = i; j <= n; j++) {
//				if (j == 4)
//					System.out.print("1");
//				else
//					System.out.print(j % 4);
//			}
//			System.out.print("\n");
//		}
//	}
//
	void Ques6(int n) {
		int i, j, k;
		for (i = 0; i < n; i++) {
			for (j = 1; j <= (2 * i + 1); j++) {
				System.out.print("*");
			}
			for (j = (2 * i - 1); j < 2 * n - i; j++) {
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}

	void pascal(int n) {
		int i, j, k;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (k = j - 2; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.print("\n");
		}
		i = n;
		for (i = n - 1; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (k = j - 2; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.print("\n");
		}

	}

	void cancatation(String str1, String str2) {
		String concatstr = "";
		int l1, l2;
		l1 = str1.length();
		l2 = str2.length();
		int i, j;
		for (i = 0; i < l1; i++) {
			concatstr = concatstr + str1.charAt(i);
		}
		for (j = 0; j < l2; j++) {
			concatstr = concatstr + str2.charAt(j);
		}
		System.out.println(concatstr);
	}

void vowelscount(String str) 
{
	int i, count = 0;
	System.out.println(str.length());
	for (i = 0; i < str.length(); i++) 
	{
		char ch = str.charAt(i);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U') 
			{
				count++;
			}
		System.out.println(ch);
		}
		System.out.println("Number of vowels=" + count);
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		Scanner sc = new Scanner(System.in);
//		int n;
//		System.out.println("Enter the number n");
//		n = sc.nextInt();
//		int z = obj.fact(n);
//		System.out.println(z);
//		int r, c;
//		System.out.println("Enter the number of rows and column of the matrix");
//		r = sc.nextInt();
//		c = sc.nextInt();
//		System.out.println("Enter the entries of the first matrix");
//		int M[][] = new int[r][c];
//		int i, j;
//		for (i = 0; i < r; i++) {
//			for (j = 0; j < c; j++) {
//				M[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println("Enter the entries of the second matrix");
//		int N[][] = new int[r][c];
//		for (i = 0; i < r; i++) {
//			for (j = 0; j < c; j++) {
//				N[i][j] = sc.nextInt();
//			}
//		}
//		obj.sumofmat(r, c, M, N);
//		int m;
//		System.out.println("Enter the number");
//		m = sc.nextInt();
//		System.out.println(obj.prime(m));
//		int x, y;
//		System.out.println("Enter the two numbers");
//		x = sc.nextInt();
//		y = sc.nextInt();
//		obj.swap(x, y);
//		int l1;
//		System.out.println("Enter the length of  the array");
//		l1 = sc.nextInt();
//		int arr[] = new int[l1];
//		int k;
//		System.out.println("Enter the array element");
//		for (k = 0; k < l1; k++) {
//			arr[k] = sc.nextInt();
//		}
//		System.out.println(obj.second_largest(arr, l1));
		String str;
		System.out.println("Enter the original string");
		str = sc.nextLine();
		
		System.out.println("The given string is "+str);
		obj.vowelscount(str);
		int l=str.length();
		obj.reverse(str, l);
		obj.reverseEachWordOfString(str);
		 int n1;
		 System.out.println("Enter the number n1");
		 n1 = sc.nextInt();
		 System.out.println(obj.sumofdigit(n1));
		 obj.star(n1);
		 System.out.println(".....................................");
		 obj.star2(n1);
		 System.out.println(".....................................");
		 obj.Ques8(n1);
		 System.out.println(".....................................");
		 //obj.Ques7(n1);
		 //obj.Ques77(n1);
		 System.out.println(".....................................");
		 obj.Ques6(n1);
		 System.out.println(".....................................");
		 obj.pascal(n1);
		 String str1,str2;
		 System.out.println("Enter first string");
		 str1 = sc.nextLine();
		 System.out.println("Enter second string");
		 str2 = sc.nextLine();
		 obj.cancatation(str1, str2);
	}
}
