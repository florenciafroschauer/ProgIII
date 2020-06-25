package myPackage.cuartoOscuro;

public class Vote {
    private int id; // que hago con esto
    private String candidateName;

    public Vote(String candidateName) {
        this.candidateName = candidateName;
    }

    // Devuelve ID de la boleta.
    public int getId() {
        return (int) (Math.random() * (99999 - 10000)) + 10000;
    }

    // Devuelve el nombre del partido.
    public String getCandidateName() {
        return candidateName;
    }
}
