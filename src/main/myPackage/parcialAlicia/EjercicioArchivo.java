package myPackage.parcialAlicia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * @author florenciafroschaer
 */

/**
 * Por cada provincia se dispone de un número de provincia (1: Buenos Aires, 2: Santa Fe, etc.)
 * y de 12 números de lluvias mensuales. Se recibe un archivo RandomAccesFile con dicha información.
 * Cada registro del archivo contiene el número de la provincia y los 12 números que corresponden a
 * las lluvias mensuales. Escribir una aplicación que muestre un listado de las provincias en orden
 * de la cantidad de lluvia total anual de la más alta a la más baja.
 */

public class EjercicioArchivo {
    private File file;
    private RandomAccessFile randomAccessFile;
    private int[] provinces = new int[25];
    private int[] rainRecord = new int[25];
    private String[] rain = new String[25];

    public EjercicioArchivo(String fileName) throws FileNotFoundException {
        file = new File(fileName);
        randomAccessFile = new RandomAccessFile(fileName, "rw");
    }

    public void readRecord() throws IOException {
        for (int i = 0, j = 0, r = 0; i < countLine(); i++, j++, r++) {
                provinces[j] = randomAccessFile.readInt();
                rain[r] = randomAccessFile.readLine();
            }
    }

    public void sumRainRecord() throws IOException {
        readRecord();
        for (int i = 0; i < rain.length; i++) {
            int count = 0;
            for (int j = 0; j < rain[i].length(); j++) {
                if (!rain[j].equals(" ")) {
                    count += Integer.parseInt(rain[j]);
                }
            }
            rainRecord[i] = count;
        }
    }

    public void print() throws IOException {
        sumRainRecord();
        for (int i = 0; i < provinces.length; i++) {
            System.out.println("Los registros de lluvia de la provincia: " + provinces[i]
                    + " son: " + rainRecord[i]);
        }
    }

    private int countLine() throws IOException {
        int lineCounter = 0;
        randomAccessFile.seek(0);
        while (randomAccessFile.getFilePointer() != randomAccessFile.length()) {
            randomAccessFile.readLine();
            lineCounter++;
        } return lineCounter;
    }
}
