package example;

import java.io.IOException;

import ga.Chromosome;
import ga.Fitness;
import ga.ShowChromosome;

/**
 * Tento priklad ukazuje jak krizit dva chromozomy a soucasne ponechat rodice.
 */
public class Example6 {
	public static void main(String[] args) throws IOException {
		// Priklad 5
		var ch1 = new Chromosome();
		ch1.mutateAll();

		var ch2 = new Chromosome();
		ch2.mutateAll();

		var ch1Clone = ch1.cloneChromozome();
		var ch2Clone = ch2.cloneChromozome();

		ch1Clone.crossOver(ch2Clone);

		// Ohodnoceni kvality jednotlivych reseni
		var eval = new Fitness("image/orloj.jpg");

		System.out.println("Nejlepsi je chromozom s nejmensi "
				+ "chybou oproti predloze:");
		System.out.println("Fitness ch1: " + eval.getFitness(ch1));
		System.out.println("Fitness ch2: " + eval.getFitness(ch2));
		System.out.println("Fitness ch1Clone: " + eval.getFitness(ch1Clone));
		System.out.println("Fitness ch2Clone: " + eval.getFitness(ch2Clone));

		// zobraz
		ShowChromosome.show(ch1, "Ch 1");
		ShowChromosome.show(ch2, "Ch 2");
		ShowChromosome.show(ch1Clone, "Ch 1 clone");
		ShowChromosome.show(ch2Clone, "Ch 2 clone");
	}
}