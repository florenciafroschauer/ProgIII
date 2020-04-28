package tp6;

import java.util.ArrayList;

public class GenomeSystem {
    BinarySearchTree<Organism> database;

    public GenomeSystem(ArrayList<Organism> list){
        database = new BinarySearchTree<>();
        for (Organism o: list) {
            add(o);
        }
    }

    public void add(Organism organism){
        database.insert(organism);
    }

    public void remove(Organism organism){
        database.delete(organism);
    }

    public void get(Organism organism){
        database.search(organism);
    }

    public void printDatabase(){
        if (!database.isEmpty()){
            printDatabase();
            System.out.println(( database.getRoot() + " "));
            printDatabase();
        }
    }
}
