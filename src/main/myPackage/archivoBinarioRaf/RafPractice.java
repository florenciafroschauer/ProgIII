package myPackage.archivoBinarioRaf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 Ejercicio 5.
 Haga una nueva versión del programa anterior que reciba la cantidad de habitantes a tener en
 cuenta para la generación de archivos. Además, si se recibe como opción:
 PBI sólo grabar PAÍS y PBI.
 POB sólo grabar PAÍS y POBLACIÓN.
 Si no se recibe opción, grabar todos los datos.

 * Escribir un método que dado un archivo de texto construya otro que sólo contenga la primer letra
 * de la primer palabra de cada línea. Ejemplo
 * archivo original:
 * SE ANUNCIA UN ASESINATO
 * Su té, Miss Marple.
 * Gracias, querida.
 * Es un joven muy agradable.
 * Rudi?
 * Sí, para ser extranjero...
 * archivo destino:
 * S
 * S
 * G
 * E
 * R
 * S
 */

public class RafPractice {
    private File file;
    private RandomAccessFile randomAccessFile;
    private int characterCounter;
    private int lineCounter;

    public RafPractice(String fileName) throws FileNotFoundException {
        file = new File(fileName);
        randomAccessFile = new RandomAccessFile(fileName, "rw");
        characterCounter = 0;
        lineCounter = 0;
    }

    /**
     * Ejercicio 1
     * Escriba un programa que reciba una de estas opciones o las dos:
     *  C para contar caracteres
     *  L para contar líneas
     * y un nombre de archivo sobre el cual realizar la operación indicada.
     *
     * El método recibe un parámetro que puede ser L o C
     * abrís el archivo
     * si es L
     *     por cada línea que lees incrementas en 1 el valor de L
     * si es c
     *   tenés que contar la cantidad de caracteres de cada linea e ir sumándolos
     */

    public int counter(String toCount) throws IOException {
        if (toCount.equals("C")) {
            return countCharacter();
        } else if (toCount.equals("L")) {
            return countLine();
        } else throw new RuntimeException("Invalid parameter");
    }

    private int countCharacter() throws IOException {
        long actualFilePointer = randomAccessFile.getFilePointer();
        randomAccessFile.readLine();
        long endLine = randomAccessFile.getFilePointer();
        randomAccessFile.seek(actualFilePointer);

        for (int i = 0; i < endLine; i++) {
            randomAccessFile.read();
            characterCounter++;
        }
        return characterCounter;

        // o poner characterCounter += randomAccessFile.readLine().length() -> DEVUELVE UN CARACTER MENOS.
    }

    private int countLine() throws IOException {
        randomAccessFile.seek(0);
        while (randomAccessFile.getFilePointer() != randomAccessFile.length()) {
            randomAccessFile.readLine();
            lineCounter++;
        } return lineCounter;
    }

    /**
     * Ejercicio 2.
     *  Construya un programa que cuente la cantidad de ocurrencias de un dado carácter en un archivo
     *  de texto.
     */

    public int characterOccurrence(char character) throws IOException {
        randomAccessFile.seek(0);
        int counter = 0;
        for (int i = 0; i < randomAccessFile.length(); i++) {
            if ((char)randomAccessFile.read() == character) {
                counter++;
            }
        } return counter;
    }

    /**
     * Ejercicio 3.
     *  Construya un programa que convierta un archivo de texto a mayúsculas o minúsculas (según se
     *  especifique) y lo copie en otro archivo.
     */

    public RandomAccessFile convert(String type) throws IOException {
        if (type.equals("upper case")) {
            return toUpperCase();
        } else if (type.equals("lower case")) {
            return toLowerCase();
        } else throw new RuntimeException("Invalid parameter");
    }

    private RandomAccessFile toUpperCase() throws IOException {
        File file = new File("ToUpperCase");
        RandomAccessFile upperCaseRaf = new RandomAccessFile(file,"rw");

        while (randomAccessFile.getFilePointer() != randomAccessFile.length()) {
            upperCaseRaf.writeUTF(randomAccessFile.readLine().toUpperCase());
        }
        return upperCaseRaf;
    }

    // NO ESCRIBE NADA.
    private RandomAccessFile toLowerCase() throws IOException {
        File file = new File("ToLowerCase");
        RandomAccessFile lowerCaseRaf = new RandomAccessFile(file,"rw");

        while (randomAccessFile.getFilePointer() != randomAccessFile.length()) {
            lowerCaseRaf.writeUTF(randomAccessFile.readLine().toLowerCase());
        }
        return lowerCaseRaf;
    }

    /**
     * Ejercicio 4.
     *  Se tiene un archivo de texto en el que cada línea contiene la siguiente información:
     *  NOMBRE DEL PAÍS (máximo 30 caracteres)
     *  POBLACIÓN (real, en millones de habitantes).
     *  PBI (real)
     *  Escriba un programa que genere 2 archivos de texto, uno con los países con población menor a 30
     *  millones de habitantes y el otro con los restantes.
     */



}
