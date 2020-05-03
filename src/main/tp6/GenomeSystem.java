package tp6;

import java.util.ArrayList;
/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer
 */

public class GenomeSystem {
    BinarySearchTree<Genome> genomeTree;

    public GenomeSystem(ArrayList<Genome> list) {
        genomeTree = new BinarySearchTree<>();
        for (Genome o: list) {
            add(o);
        }
    }

    public void add(Genome genome){
        genomeTree.insert(genome);
    }

    public void remove(Genome genome){
        genomeTree.delete(genome);
    }

    public Genome get(Genome genome){
        return genomeTree.search(genome);
    }

    public void modifyType(String newType, Genome genome) {
        if (!genomeTree.exists(genome)) {
            throw new RuntimeException("The genome is not in the system.");
        }
        genomeTree.search(genome).setType(newType);
    }

    public void modifyDescription(String newDescription, Genome genome) {
        if (!genomeTree.exists(genome)) {
            throw new RuntimeException("The genome is not in the system.");
        }
        genomeTree.search(genome).setDescription(newDescription);
    }

    public void modifySize(int newSize, Genome genome) {
        if (!genomeTree.exists(genome)) {
            throw new RuntimeException("The genome is not in the system.");
        }
        genomeTree.search(genome).setSize(newSize);
    }

    public void printDatabase(){
        printDatabase(genomeTree);
    }

    private void printDatabase(BinarySearchTree<Genome> tree) {
        if (!tree.isEmpty()) {
            printDatabase(tree.getLeft());
            tree.getRoot().print();
            printDatabase(tree.getRight());
        }
    }
}
