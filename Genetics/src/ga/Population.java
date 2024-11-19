package ga;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Population {
    private List<Chromosome> chromes = new LinkedList<>();
    private int size;

	public Chromosome getChrome(int i) {
		return this.chromes.get(i);
	}

    public Population(int size) {
        this.size = size;
        for (int i = 0; i < this.size; i++) {
            var chrome = new Chromosome();
            chrome.mutateAll();
            chromes.add(chrome);
        }
    }

    public void randomMutate() {
        Random rnd = new Random();
        // loop through half of population
        // at the end we end up with 75 individuals for 50 starting
        for (int i = 0; i < size/2; i++) {
            var copy = chromes.get(rnd.nextInt(this.size)).cloneChromozome();
            copy.mutateAll();
            chromes.add(copy);
        }
    }
    public void randomCross() {
        Random rnd = new Random();
        // loop through half of population
        // at the end we end up with 100 individuals for 50 starting
        for (int i = 0; i < size/2; i++) {
            var copy = chromes.get(rnd.nextInt(size)).cloneChromozome();
            copy.crossOver(chromes.get(rnd.nextInt(size)));
            copy.mutateAll();
            chromes.add(copy);
        }
    }

    public void tournament() {
       Collections.sort(chromes);
       chromes = chromes.subList(0, size);
       Fitness eval;
       try {
            var test = new File("orloj.jpg");
            System.out.println(test.getPath());
          eval = new Fitness("/Users/hedweger/Downloads/Genetics/orloj.jpg");
          System.out.println("chyba nejlepsiho " + eval.getFitness(chromes.get(0)));
       } catch (IOException e) {
          e.printStackTrace();
       }
    }

    public void evolution() {
        this.randomMutate();
        this.randomCross();
        this.tournament();
    }
}
