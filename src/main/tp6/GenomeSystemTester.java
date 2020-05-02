package tp6;

import java.util.ArrayList;

public class GenomeSystemTester {

    public static void main(String[] args) {
        Genome genome1 = new Genome(50215, "HIV", "consists of two identical single-stranded RNA molecules that are enclosed within the core of the virus particle", 9749 );
        Genome genome2 = new Genome(25478, "Megavirus", "Until 2013 the largest known viral genome", 10000 );
        Genome genome3 = new Genome(84058, "Pandoravirus Salinus", "Largest known viral genome", 32121 );
        Genome genome4 = new Genome(15153, "SV40", "First sequenced RNA-genome", 1540 );
        Genome genome5 = new Genome(97898, "Phage", "Often used as a vector for the cloning of recombinant DNA", 14548 );

        ArrayList<Genome> genomeArray = new ArrayList<>();
        genomeArray.add(genome1);
        genomeArray.add(genome2);
        genomeArray.add(genome3);
        genomeArray.add(genome4);
        genomeArray.add(genome5);

        GenomeSystem genomeSystem = new GenomeSystem(genomeArray);
        genomeSystem.remove(genome1);
        genomeSystem.printDatabase();
        Genome genome6 = genomeSystem.get(genome3);
        genome6.print();

    }
}
