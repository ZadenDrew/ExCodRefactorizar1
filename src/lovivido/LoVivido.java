/*
 * Examen Refactorizacion
 * modificado por ANDREA 
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author acabezaslopez
 */
public class LoVivido {

    /**
     *
     * @param args String
     */
    public static void main(String[] args) {
        String nombre = null;

        TiempoVivido nv = new TiempoVivido();
        nv.calculaTiempo(nv.introduceNombre(), nv.introduceEdad());
        nv.devuelveVentanas(nombre);
        System.exit(0);

    }

}
