
package ec.edu.intsuperior.vista;

import javax.swing.JOptionPane;
import ec.edu.intsuperior.modelo.Personal;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Personal p1= new Personal();
        System.out.println("Ingresa la cedula");
        p1.setCi(leer.next());
        System.out.println("Ingresa Nombre1");
        p1.setNombre1(leer.next());
        p1.setNombre2(JOptionPane.showInputDialog("Ingresa tu segundo nombre"));
        p1.setApellido1(JOptionPane.showInputDialog("Ingresa el apellido paterno"));
        JOptionPane.showMessageDialog(null,p1.toString());
    }
    
}
