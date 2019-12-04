/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author Lenovo
 */
public class arbol {

    Nodo raiz;

    public arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public arbol(int valor) {
        this.raiz = new Nodo(valor);
    }

    arbol() {

    }

    public void insertar(int _valor) {
        Nodo nuevo = new Nodo(_valor);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo padre = null;
            Nodo actual = raiz;
            while (actual != null) {
                padre = actual;
                if (actual.dato > _valor) {
                    actual = actual.getIzdo();
                } else {
                    actual = actual.getDcho();
                }
            }
            if (padre.dato > _valor) {
                padre.getIzdo();
            } else {
                padre.getDcho();
            }
        }
    }

    public void recorrerPreorden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            System.out.println("Datos: " + nodo.getDato());
            recorrerPreorden(nodo.getIzdo());
            recorrerPreorden(nodo.getDcho());
        }
    }

    public void recorrerPosorden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            recorrerPosorden(nodo.getIzdo());
            recorrerPosorden(nodo.getDcho());
            System.out.println("Datos: " + nodo.getDato());
        }
    }

    public void recorrerInorden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            recorrerInorden(nodo.getIzdo());
            System.out.println("Datos: " + nodo.getDato());
            recorrerInorden(nodo.getDcho());
        }
    }

    public void reemplazar(Nodo actual) {
        Nodo p = actual;
        Nodo a = actual.getIzdo();
        while (a.getDcho() != null) {
            p = a;
            a = a.getDcho();
        }
        actual.dato = a.dato;
        System.out.println(a.dato + " Valores...");
        if (p == actual) {
            p.getIzdo();
            a.getIzdo();
            a = p;
        } else {
            p.getDcho();
            a.getDcho();
            a = p;
        }
    }

}
