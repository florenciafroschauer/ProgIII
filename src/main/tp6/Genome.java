package tp6;

public class Genome implements Comparable<Genome> {
    private int key;
    private String type;
    private String description;
    private int size;

    public Genome(int key, String type, String description, int size) {
        this.key = key;
        this.type = type;
        this.description = description;
        this.size = size;
    }

    @Override
    public int compareTo(Genome o) {
        return key - o.getKey();
    }

    public int getKey() {
        return key;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void print(){
        System.out.println("\nKey: " + key + "\n" +
                            "Type: " + type + "\n" +
                            "Size: " + size + "\n" +
                            "Description: " + description);
    }
}
