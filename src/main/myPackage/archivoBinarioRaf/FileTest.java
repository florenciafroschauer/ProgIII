package myPackage.archivoBinarioRaf;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/florenciafroschauer/projects/Prog3/src/main/myPackage/archivoBinarioRaf/ThreeBrothersTale.txt");
        RandomAccessFile raf = new RandomAccessFile(file, "rw");

        /**
        System.out.println(file.exists());
        System.out.println("Length: " + raf.length());
        System.out.println("\nFilePointer: " + raf.getFilePointer());
        System.out.println("\nReadLine: " + raf.readLine());
        System.out.println("\nFilePointer: " + raf.getFilePointer());
        System.out.println("\nRead: " + raf.read());
        System.out.println("\nFilePointer: " + raf.getFilePointer());
        System.out.println("\nRead: " + raf.read());
        System.out.println("\nFilePointer: " + raf.getFilePointer());
         */

        RafPractice practice = new RafPractice(
                "/home/florenciafroschauer/projects/Prog3/src/main/myPackage/ThreeBrothersTale.txt");
        /**System.out.println("\nCharacter per line counter: " + practice.counter("C"));
        System.out.println("\nLines counter: " + practice.counter("L"));
        System.out.println("\nOccurrence of 'a': " + practice.characterOccurrence('a'));
        System.out.println("\nOccurrence of 'b': " + practice.characterOccurrence('b'));
        System.out.println("\nOccurrence of 'T': " + practice.characterOccurrence('T'));
        System.out.println("\nOccurrence of 't': " + practice.characterOccurrence('t'));
        System.out.println("\nOccurrence of '.': " + practice.characterOccurrence('.'));
         */
        System.out.println("\nLines counter: " + practice.counter("L"));
        practice.convert("lower case");
    }
}
