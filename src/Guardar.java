
import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igorr
 */
public class Guardar {

    gesJAXB miGestor = new gesJAXB();

    public void guardarJAXB(String textoGuardar, String rutaArchivo) {
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo));
            bw.write(textoGuardar);

            bw.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
}
