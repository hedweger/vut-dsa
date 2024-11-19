package example;

import java.io.IOException;

import ga.Chromosome;
import ga.ShowChromosome;

/**
 * Tento priklad ukazuje jak klonovat chromozom.
 */
public class Example3 {
	public static void main(String[] args) throws IOException {
		// Priklad 1
		var ch1 = new Chromosome();
		ch1.mutateAll();

		// vytvoreni kopie
		var ch2 = ch1.cloneChromozome();
		// Chromozome ch2 = ch1; // nevytvori kopii
		
		ShowChromosome.show(ch1, "Chromozom ch1");
		ShowChromosome.show(ch2, "Chromozom ch2");
	}
}
