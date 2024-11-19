package ga;

import java.io.IOException;
import java.util.Random;

public class Chromosome implements Comparable<Chromosome> {
	public static final int NUM_OF_POLYG = 30;
	public static final int NUM_OF_POINTS = 5;

	// body x, y, bravy R,G,B + ALPHA
	private int[] data = new int[NUM_OF_POLYG * (NUM_OF_POINTS * 2 + 3 + 1)]; // 420

	public int getData(int index) {
		return data[index];
	}
	public void crossOver(Chromosome ch) {
		Random rnd = new Random();

		// jeden polygon zabira 14 polozek
		int POLY_LENGTH = (NUM_OF_POINTS * 2 + 3 + 1);

		// pro kazdy polygon
		for (int i = 0; i < NUM_OF_POLYG; i++) {
			// nahodne
			if (rnd.nextBoolean()) {
				// prohod polygony
				for (int j = 0; j < POLY_LENGTH; j++) {
					// prohod
					int tmp = data[i * POLY_LENGTH + j];
					data[i * POLY_LENGTH + j] = ch.data[i * POLY_LENGTH + j];
					ch.data[i * POLY_LENGTH + j] = tmp;
				}
			} else {
				// ponech jak je
			}
		}
	}

	/**
	 * Mutuj vsechny geny tohoto chromozomu.
	 */
	public void mutateAll() {
		Random rnd = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(256);
		}
	}


	public Chromosome cloneChromozome() {
		Chromosome ch = new Chromosome();
		ch.data = data.clone();
		return ch;
	}

	// MY CODE!!
	@Override
	public int compareTo(Chromosome o) {
		Fitness eval;
		try {
			eval = new Fitness("orloj.jpg");
			int f1 = eval.getFitness(this);
			int f2 = eval.getFitness(o);
			if(f1 > f2) {
				return 1;
			} else if(f1 < f2) {
				return -1;
			} else {
				return 0;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

}