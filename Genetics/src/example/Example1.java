package example;

import java.io.IOException;

import ga.Chromosome;
import ga.ShowChromosome;

/**
 * Priklad zobrazuje jak vytvorit objekt chromozom a zobrazit je do platna.
 */
public class Example1 {
	public static void main(String[] args) throws IOException {
		// Vytvor chromozom
		var ch1 = new Chromosome();

		// znahodni jeho obsah
		ch1.mutateAll();

		// zobraz
		ShowChromosome.show(ch1, "Ch 1");
	}
}
