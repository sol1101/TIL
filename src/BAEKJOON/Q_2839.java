package BAEKJOON;

import java.util.Scanner;

public class Q_2839 {

	public static void main(String[] args) {
		/*
		 * 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면 더 적은 개수의
		 * 봉지를 배달할 수 있다. 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을
		 * 작성하시오.
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;

		while (true) {
			if(N%5 == 0) {
				cnt += N/5;
				break;
			}else {
				N -= 3;
				cnt ++;
			}
			if(N<0) {
				cnt = -1;
				break;
			}

		}System.out.println(cnt);

	}
}