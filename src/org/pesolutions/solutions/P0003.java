package org.pesolutions.solutions;

import org.pesolutions.interfaces.ProjectEulerSolution;

//	Problem Source: https://projecteuler.net/problem=3
public final class P0003 implements ProjectEulerSolution {

	private final long NBR = 600851475143L;

	public static void main(String[] args) {
		System.out.println(new P0003().execute());
	}

	@Override
	public String execute() {
		return Long.toString(findGreatestPrimeDivisor(NBR));
	}

	private long findGreatestPrimeDivisor(long nbr) {
		if (nbr == 1L)
			return 1L;
		while (nbr % 2L == 0L) {
			nbr = nbr / 2L;
		}
		if (nbr == 1L) {
			return 2L;
		}
		long divisor = 1L;
		while (nbr > 1) {
			divisor += 2;
			if (nbr % divisor == 0) {
				while (nbr % divisor == 0) {
					nbr = nbr / divisor;
				}
			}
		}
		return divisor;
	}

}
