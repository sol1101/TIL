package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2869 {

	public static void main(String[] args) throws IOException {
		/* 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
		 * 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
		 * 또, 정상에 올라간 후에는 미끄러지지 않는다.
		 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오 */

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int day = (V-B) / (A-B);
		
		if((V-B)%(A-B) != 0) {
			day ++;
		}
		System.out.println(day);
		
		
	}

}
