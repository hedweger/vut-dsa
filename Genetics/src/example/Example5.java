package example;

import java.io.IOException;

import ga.Chromosome;

/**
 * Tento priklad ukazuje jak krizit dva chromozomy a soucasne ponechat rodice.
 */
public class Example5 {
	public static void main(String[] args) throws IOException {
		var ch1 = new Chromosome();
		ch1.mutateAll();

		var ch2 = new Chromosome();
		ch2.mutateAll();
		
		// Vytvoreni kopii
		var ch1Clone = ch1.cloneChromozome();
		var ch2Clone = ch2.cloneChromozome();

		// krizeni zkombinuje potomky
		ch1Clone.crossOver(ch2Clone);
	}
}