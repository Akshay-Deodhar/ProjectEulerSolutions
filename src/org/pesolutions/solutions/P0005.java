package org.pesolutions.solutions;

import org.pesolutions.interfaces.ProjectEulerSolution;

//	Problem Source: https://projecteuler.net/problem=5
public final class P0005 implements ProjectEulerSolution {

	public static void main(String[] args) {
		System.out.println(new P0005().execute());
	}

	@Override
	public String execute() {
		long lcm = 1;
		for (int i = 1; i < 21; i++) {
			lcm = findLCM(lcm, (i));
		}
		return Long.toString(lcm);
	}

	private long findLCM(long a, long b) {
		long max = Math.max(a, b);
		long min = a + b - max;
		long temp = max;
		if (max % min == 0) {
			return max;
		}
		while (max % min != 0) {
			temp = max % min;
			max = min;
			min = temp;
		}
		return a * b / min;
	}
}
