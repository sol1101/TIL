package BAEKJOON;

import java.util.Scanner;

public class Q_2775 {

	public static void main(String[] args) {
		/* a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다
		 * 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라.
		 * 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
		 * 첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다*/

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트케이스
		
		int [][] A = new int [15][15];
		
		for(int i = 0; i<T; i++) {
			int k = sc.nextInt(); //층수
			int n = sc.nextInt(); //호	
			System.out.println(cntPeople(k, n));
			
		}
		
		
	}
	public static int cntPeople(int k, int n) {
		int cnt = 0;
		if(k==1) {
			for(int i = 1; i<=n; i++) {
				cnt += i;
			}
		}
		else {
			for(int i = 1; i<=n; i++) {
				cnt += cntPeople(k-1, i);
			}
		}
		return cnt;
	}

}
