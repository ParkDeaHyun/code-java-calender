package calander_practice;

import java.util.Scanner;

public class sum {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		
		int i;
		System.out.println("1. 첫번째 값 입력, 엔터"
				+ "  "
				+ "2. 두번째 값 입력 엔터 = 합");
		int j;
		i= sc.nextInt();
		j= sc.nextInt();
		System.out.println("입력 된 두 수의 합 :" + (i + j) );
		sc.close();
	}
	}
