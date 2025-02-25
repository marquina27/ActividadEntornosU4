package cuentas.clientes;


/**
 * 
 * @author Jesús Marquina Alarcón
 * @version 1.0
 * @since 21/02/2025
 * 
 */

public class Main {

    
    /**
     * 
     * @param args Argumentos linea comandos
     */
    
    public static void main(String[] args) {
        operativa_cuenta(500.0F);
    }

    private static void operativa_cuenta(float cantidad) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo disponible en su cuenta es:"+ cuenta1.estado() );

        try {
            cuenta1.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Error al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Error al ingresar");
        }
    }
}
