package for문;

import java.util.Iterator;
import java.util.Scanner;

public class ex04_약수구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				System.out.print(i + " ");

			}
		}

	}

}
