package ga;

import java.io.IOException;

public class Exec {
   public static void main(String[] args) throws IOException {
		int velikostpopulace = 50;
		var p = new Population(velikostpopulace);
        while(true) {
			p.evolution();
			ShowChromosome.show(p.getChrome(0), "Ch");
		}
	}
}
