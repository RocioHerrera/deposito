/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Main {
    
    public static void main(String[] args) {
       operativa_cuenta();
    }
    
    public static void operativa_cuenta(){
        CCuenta cuenta1;
        double saldoActual;
        float cantidad;
        
        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cantidad = 2300;
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cantidad = 695;
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
