package net.demo;

class Program39 {

	static int numberofWays(int N){
		int ways = 0;
		int i;
		for (i = 1; i <= N / 2; i++) {
			if (N % i == 0)
				ways++;
		}
		return ways;
	}

	public static void main(String[] args) {
		int N = 10;
		int ans = numberofWays(N);
		System.out.print(ans);
	}
}