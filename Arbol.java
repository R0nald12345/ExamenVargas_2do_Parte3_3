/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoExamenEd2Arboles_3_p3;

/**
 *
 * @author pumar
 */
public class Arbol {

    public Nodo raiz;
    public int n;

    public void insertar(ListaArreglo l2, ListaArreglo l3) {
        raiz = insertar(raiz, l2, l3);
    }

    public Nodo insertar(Nodo p, ListaArreglo l2, ListaArreglo l3) {
        for (int i = 1; i <= l2.obtenerCant(); i++) {
            if (p == null) {
                return new Nodo(l2.obtenerElemento(i), l3.obtenerElemento(i));
            } else {
                if (l2.obtenerElemento(i) < p.elem1) {
                    p.izq = insertar(p.izq, l2, l3);
                } else {
                    p.der = insertar(p.der, l2, l3);
                }
            }
        }
        return p;
    }

    public void insertarI(ListaArreglo l2, ListaArreglo l3) {
        for (int i = 1; i <= l2.obtenerCant(); i++) {
            if (raiz == null) {
                raiz = new Nodo(l2.obtenerElemento(i), l3.obtenerElemento(i));
            } else {
                Nodo ant = null;
                Nodo p = raiz;
                while (p != null) {
                    ant = p;
                    if (l2.obtenerElemento(i) < p.elem1) {
                        p = p.izq;
                    } else {
                        if (l2.obtenerElemento(i) > p.elem1) {
                            p = p.der;
                        } else {
                            return;
                        }
                    }
                }
                Nodo nuevo = new Nodo(l2.obtenerElemento(i), l3.obtenerElemento(i));
                if (l2.obtenerElemento(i) > ant.elem1) {
                    ant.der = nuevo;
                } else {
                    ant.izq = nuevo;
                }
            }
        }
    }

    public Arbol() {
        raiz = null;
    }

    public void inOrden() {
        inOrden(raiz);
    }

    public void inOrden(Nodo p) {
        if (p == null) {
            return;
        } else {
            inOrden(p.izq);
            System.out.println(p.elem1 + " " + p.elem2 + ", ");
            inOrden(p.der);
        }
    }

    public static void main(String[] args) {
        ListaArreglo l1 = new ListaArreglo();
        ListaArreglo l2 = new ListaArreglo();
        ListaArreglo l3 = new ListaArreglo();

        l1.insertar1en1(50);
        l1.insertar1en1(40);
        l1.insertar1en1(60);
        l1.insertar1en1(30);
        l1.insertar1en1(70);
        l1.insertar1en1(50);
        l1.insertar1en1(30);
        l1.insertar1en1(60);
        l1.insertar1en1(50);
        l1.insertar1en1(40);
        l1.insertar1en1(50);
        l1.insertar1en1(55);

        System.out.println(l1.descargar());

        l1.MetodoAuxiliar1(l2, l3);
        Arbol a = new Arbol();
        a.insertar(l2, l3);
        a.inOrden();
    }
}
