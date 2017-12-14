package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author acabezaslopez
 */
public class TiempoVivido {

    private String nombre, edad;
    private int mes, dia, hora, a;

    public TiempoVivido() {

    }

    /**
     * Método que calcula a partir de la edad el tiempo transcurrido en
     * mess,dias y horas
     *
     * @param nombre String
     * @param edad String
     */
    public void calculaTiempo(String nombre, String edad) {

        a = Integer.parseInt(edad);

        mes = (a * 12);
        dia = (a * 365);
        hora = (dia * 24);

    }

    /**
     * Método que solicita el nombre
     *
     * @return nombre String
     */
    public String introduceNombre() {

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        return nombre;
    }

    /**
     * Método que solicita la edad
     *
     * @return edad String
     */
    public String introduceEdad() {
        edad = JOptionPane.showInputDialog("Escriba su edad: ");
        return edad;
    }

    /**
     * Método que muestra las ventanas con respuesta
     *
     * @param nombre String
     */
    public void devuelveVentanas(String nombre) {
        JOptionPane.showMessageDialog(null, "Meses: " + mes, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dia, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + hora, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

    }
}
