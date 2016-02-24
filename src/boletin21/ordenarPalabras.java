package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author igonzalezcastro
 */
public class ordenarPalabras {

    private final String[] palabras = new String[10];

    public void cargarArray() {
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = JOptionPane.showInputDialog("Palabra " + (i + 1) + ":");
        }
    }

    public void ordenarPalabras() {
        Arrays.sort(palabras);
    }

    public void guardarFichero() {
        ordenarPalabras();
        PrintWriter escritor = null;
        try {
            escritor = new PrintWriter(new File("src/boletin21/palabras.txt"));
            for (int i = 0; i < palabras.length; i++) {
                escritor.println(i + 1 + " " + palabras[i]);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        } finally {
            escritor.close();
        }
    }
}
