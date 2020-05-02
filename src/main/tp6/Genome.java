package tp6;

public class Genome implements Comparable<Genome> {
    private int key;
    private String typeOfOrganism;
    private String descriptionOfOrganism;
    private int size;

    public Genome(int key, String typeOfOrganism, String descriptionOfOrganism, int size) {
        this.key = key;
        this.typeOfOrganism = typeOfOrganism;
        this.descriptionOfOrganism = descriptionOfOrganism;
        this.size = size;
    }

    @Override
    public int compareTo(Genome o) {
        return key - o.getKey();
    }

    public int getKey() {
        return key;
    }

    public String getTypeOfOrganism() {
        return typeOfOrganism;
    }

    public String getDescriptionOfOrganism() {
        return descriptionOfOrganism;
    }

    public int getSize() {
        return size;
    }

    public void print(){
        System.out.println("\nKey: " + key + "\n" +
                            "Type: " + typeOfOrganism + "\n" +
                            "Size: " + size + "\n" +
                            "Description: " + descriptionOfOrganism);
    }
}
