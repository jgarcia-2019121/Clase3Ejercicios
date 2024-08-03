/**
 *
 *  Fecha de crecion:
 *      03/08/2024
 *  Fecha de edicion:
 *      03/08/2024
 * 
 * @author garci
 * 
 */

package org.jose.main;
import java.util.Scanner;

public class LoginSimulado {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        //usuario y password por default
        String usuarioCorrecto = "Usuario";
        String passwordCorrecto = "passWord";
        
        //para que coloque el usuario por default
        System.out.print("ingrese el nombre de usuario: ");
        String usuario = lector.nextLine();
        
        //para que coloque el password por default
        System.out.print("ingrese el password: ");
        String password = lector.nextLine();
        
        //Si el usuario y el password son correctos |Acceso concedido.| si no, |Acceso denegado.|
        if (usuario.equals(usuarioCorrecto) && password.equals(passwordCorrecto)){
            System.out.print("Acceso concedido.");
        }else {
            System.out.print("Acceso denegado.");
        }
        lector.close();
    }
}

