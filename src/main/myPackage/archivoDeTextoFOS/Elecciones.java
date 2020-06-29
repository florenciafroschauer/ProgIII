package myPackage.archivoDeTextoFOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Elecciones {
    private File f;
    private RandomAccessFile raf;
    private int sizeReg = 22;

    public Elecciones(String nombre) throws FileNotFoundException {
        f = new File(nombre);
        raf = new RandomAccessFile(f, "rw");

    }

    public void escribir(Mesa m) throws IOException {
        raf.writeInt(m.getNumero());
        raf.writeChar(m.getGenero());
        raf.writeInt(m.getNroDistrito());
        raf.writeInt(m.getVotA());
        raf.writeInt(m.getVotB());
        raf.writeInt(m.getVotC());
    }

    public void cerrar() throws IOException {
        raf.close();
    }

    public Mesa leer() throws IOException{
        return new Mesa(raf.readInt(), raf.readChar(), raf.readInt(),raf.readInt(),raf.readInt(),raf.readInt());
    }

    public long cantReg() throws IOException {
        return raf.length()/sizeReg;
    }

    public void inicio() throws IOException{
        raf.seek(0);
    }

    public void fin() throws IOException{
        raf.seek(raf.length());
    }

    public ArrayList<Mesa> mesasPorDistrito (int distrito) throws Exception{
        long cant = cantReg();
        inicio();
        Mesa m;
        ArrayList<Mesa> mesasPorDistrito= new ArrayList<>();
        for (int i =0 ; i < cant;i++){
            m=leer();
            if(m.getNroDistrito()==distrito) mesasPorDistrito.add(m);
        }

        if (!mesasPorDistrito.isEmpty()) return mesasPorDistrito;

        throw new Exception("Distrito erróneo");
    }

    public ArrayList<Mesa> mesasPorGenero (char genero) throws Exception{
        long cant = cantReg();
        inicio();
        Mesa m;
        ArrayList<Mesa> mesasPorGenero= new ArrayList<>();
        for (int i =0 ; i < cant;i++){
            m=leer();
            if(m.getGenero()==genero) mesasPorGenero.add(m);
        }

        if (!mesasPorGenero.isEmpty()) return mesasPorGenero;

        throw new Exception("Genero erróneo");
    }

}
