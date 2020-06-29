package myPackage.archivoDeTextoFOS;

import java.io.File;

public class Mesa {
    private int numero;
    private char genero;
    private int nroDistrito;
    private int VotA,VotB,VotC;

    public Mesa(int numero, char genero, int nroDistrito, int votA, int votB, int votC) {
        this.numero = numero;
        this.genero = genero;
        this.nroDistrito = nroDistrito;
        this.VotA = votA;
        this.VotB = votB;
        this.VotC = votC;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getNroDistrito() {
        return nroDistrito;
    }

    public void setNroDistrito(int nroDistrito) {
        this.nroDistrito = nroDistrito;
    }

    public int getVotA() {
        return VotA;
    }

    public void setVotA(int votA) {
        VotA = votA;
    }

    public int getVotB() {
        return VotB;
    }

    public void setVotB(int votB) {
        VotB = votB;
    }

    public int getVotC() {
        return VotC;
    }

    public void setVotC(int votC) {
        VotC = votC;
    }
}
