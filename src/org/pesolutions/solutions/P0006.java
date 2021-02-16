package org.pesolutions.solutions;

import org.pesolutions.interfaces.ProjectEulerSolution;

//	Problem Source: https://projecteuler.net/problem=6
public final class P0006 implements ProjectEulerSolution {

	public static void main(String[] args) {
		System.out.println(new P0006().execute());
	}

	@Override
	public String execute() {
		int squareSum = 0, sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
			squareSum += (i * i);
		}
		return Integer.toString(sum * sum - squareSum);
	}

}
