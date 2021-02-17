package org.pesolutions.solutions;

import java.util.ArrayList;
import java.util.List;

import org.pesolutions.interfaces.ProjectEulerSolution;

//	Problem Source: https://projecteuler.net/problem=7
public final class P0007 implements ProjectEulerSolution {

	public static void main(String[] args) {
		System.out.println(new P0007().execute());
	}

	private List<Integer> primesList = new ArrayList<Integer>();
	private final int NBR = 10001;

	@Override
	public String execute() {
		primesList.clear();
		primesList.add(2);
		int count = 1;
		int testNbr = 3;
		while (count < NBR) {
			if (isPrime(testNbr)) {
				primesList.add(testNbr);
				count++;
				if (count == NBR) {
					break;
				}
				testNbr += 2;
			} else {
				testNbr += 2;
			}
		}
		return Integer.toString(testNbr);
	}

	private boolean isPrime(int nbr) {
		int prime;
		for (int i = 0; i < primesList.size(); i++) {
			prime = primesList.get(i);
			if (prime * prime > nbr) {
				break;
			}
			if (nbr % prime == 0) {
				return false;
			}
		}
		return true;
	}
}
