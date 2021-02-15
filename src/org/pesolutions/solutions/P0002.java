package org.pesolutions.solutions;

import org.pesolutions.interfaces.ProjectEulerSolution;

//	Problem Source: https://projecteuler.net/problem=2
public final class P0002 implements ProjectEulerSolution {

	private final int MAX = 4_000_000;

	public static void main(String[] args) {
		System.out.println(new P0002().execute());
	}

	@Override
	public String execute() {
		int curr = 1, prev = 1, sum = 0, temp;
		while (curr <= MAX) {
			temp = prev;
			prev = curr;
			curr = temp + prev;
			if (curr > MAX) {
				break;
			}
			if (curr % 2 == 0) {
				sum = sum + curr;
			}
		}
		return Integer.toString(sum);
	}

}
