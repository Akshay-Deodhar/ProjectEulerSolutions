package org.pesolutions.solutions;

import org.pesolutions.interfaces.ProjectEulerSolution;

//	Problem Source: https://projecteuler.net/problem=XX
public final class P0004 implements ProjectEulerSolution {

	public static void main(String[] args) {
		System.out.println(new P0004().execute());
	}

	@Override
	public String execute() {
		int prod = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				prod = i*j;
				if(isPalindrome(prod)) {
					max = Math.max(max, prod);
				}
			}
		}
		return Integer.toString(max);
	}

	private boolean isPalindrome(int i) {
		String str = Integer.toString(i);
		return new StringBuilder().append(str.toCharArray()).reverse().toString().equals(str);
	}
}
