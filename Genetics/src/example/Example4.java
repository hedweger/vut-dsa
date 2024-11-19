package example;

import java.io.IOException;

import ga.Chromosome;

/**
 * Tento priklad ukazuje jak krizit dva chromozomy.
 */
public class Example4 {
	public static void main(String[] args) throws IOException {
		var ch1 = new Chromosome();
		ch1.mutateAll();

		var ch2 = new Chromosome();
		ch2.mutateAll();
		
		
		ch1.crossOver(ch2);
	}
}
