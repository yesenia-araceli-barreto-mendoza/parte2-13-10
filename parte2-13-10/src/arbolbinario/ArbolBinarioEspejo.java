/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ArbolBinarioEspejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        arbol ar = new arbol();
        int op, num, elim;
        do {
            System.out.println("Insertar [1] :");
            System.out.println("Preorden [2] :");
            System.out.println("Inorden [3] :");
            System.out.println("Posorden [4] :");
            System.out.println("Salir [0] :");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese datos ");
                    num = leer.nextInt();
                    ar.insertar(num);
                    break;
                case 2:
                    ar.recorrerPreorden(ar.raiz);
                    System.out.println(" ");
                    break;
                case 3:
                    ar.recorrerInorden(ar.raiz);
                    System.out.println(" ");
                    break;
                case 4:
                    ar.recorrerPosorden(ar.raiz);
                    System.out.println(" ");
                    break;
                default:
                    break;
            }

        } while (op != 0);
    }

}
