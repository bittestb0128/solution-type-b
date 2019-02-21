package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//입력 받음
		System.out.println("# > = ");
		Scanner scan = new Scanner(System.in);
		int rock =scan.nextInt();
		
		System.out.println(rock);
		
		//입력 받음
		System.out.println("O > = ");
		
		Scanner scan2 = new Scanner(System.in);
		int bridge =scan2.nextInt();
		
		makeRocksBridge(rock,bridge);
	}
	public static void makeRocksBridge(int rock,int bridge) {
		String[] result = new String[rock*bridge];
		int rockCnt = 0;
		int bridgeCnt = 0;
		Random random = new Random();
		for(int i = 0; i<result.length; i++) {
			
			if(random.nextBoolean()) {
				result[i] = "O";
				rockCnt++;
			}else {
				result[i] = "#";
				bridgeCnt++;
			}
		}

	}

}
