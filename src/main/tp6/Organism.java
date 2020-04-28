package tp6;

public class Organism implements Comparable<Organism> {
    int key;
    String typeOfOrganism;
    String descriptionOfOrganism;
    int size;

    @Override
    public int compareTo(Organism o) { //Compara con las keys
        return 0;
    }
}
