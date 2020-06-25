package myPackage.archivoDeTexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ArchivoTexto {

    public static void main(String[] args) {
        try {

            FileReader fr = new FileReader("/home/florenciafroschauer/projects/Prog3/src/main/myPackage/archivoDeTexto/archivotexto.txt");
            createTextFile(fr);
            fr.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void createTextFile(FileReader fr){
        try {
            FileWriter fw = new FileWriter("Iniciales de cada linea");
            BufferedReader bfr= new BufferedReader(fr);
            String line= bfr.readLine();
            while (line != null){
                fw.write(line.charAt(0) + "\n");
                line=bfr.readLine();
            }
            fw.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
