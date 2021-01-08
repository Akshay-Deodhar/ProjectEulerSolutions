package org.pesolutions;

import org.pesolutions.interfaces.ProjectEulerSolution;

public final class P001 implements ProjectEulerSolution {

	public static void main(String[] args) {
		System.out.println(new P001().execute());
	}

	@Override
	public String execute() {
		int l_sum = 0;
		int i;
		for (i = 1; i < 1000; i++) {
			l_sum += i % 3 == 0 || i % 5 == 0 ? i : 0;
		}
		return Integer.toString(l_sum);
	}

}
