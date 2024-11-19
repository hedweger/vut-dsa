package example;

import java.io.IOException;

import ga.Chromosome;
import ga.Fitness;

/**
 * Tento priklad zobrazuje miru podobnosti vuci predloze.
 */
public class Example2 {

	public static void main(String[] args) throws IOException {
		// Priklad 1
		var ch1 = new Chromosome();
		ch1.mutateAll();

		// Porovnavaci trida vuci obrazku orloj.jpg
		var eval = new Fitness("image/orloj.jpg");

		// poorvnej
		int error = eval.getFitness(ch1);

		System.out.println("Mira chyby vuci predloze: " + error);
	}

}
