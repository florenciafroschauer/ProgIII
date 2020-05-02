package tp6;

import java.util.ArrayList;

public class GenomeSystem {
    BinarySearchTree<Genome> genomeTree;

    public GenomeSystem(ArrayList<Genome> list){
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


    public void printDatabase(){
        printDatabase(genomeTree);
    }

    private void printDatabase(BinarySearchTree<Genome> tree){
        if (!tree.isEmpty()) {
            printDatabase(tree.getLeft());
            tree.getRoot().print();
            printDatabase(tree.getRight());
        }
    }
}
