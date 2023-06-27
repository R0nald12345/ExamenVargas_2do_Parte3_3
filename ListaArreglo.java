/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoExamenEd2Arboles_3_p3;

/**
 *
 * @author pumar
 */


public class ListaArreglo {

    public static final int MAX = 50;
    //atributos
    private int[] v;
    private int cant;

    //Constructor
    public ListaArreglo() {
        this.cant = 0;
        v = new int[MAX];
    }

    public void insertar1en1(int ele) {
        this.cant++;
        v[cant] = ele;
    }

    public void intercambiar(int i, int j) {
        if (i >= 1 && i <= this.cant && j >= 1 && j <= this.cant) {
            int aux;
            aux = v[i];
            v[i] = v[j];
            v[j] = aux;
        }
    }

    public int obtenerCant() {
        return cant;
    }

    public int obtenerElemento(int pos) {
        return v[pos];
    }

    public int frecuencia(int x) {
        int contador = 0;
        for (int i = 1; i <= this.cant; i++) {
            if (v[i] == x) {
                contador++;
            }
        }
        return contador;
    }

    
    public void ordenarAscendente() {
        for (int i = 1; i < this.cant; i++) {
            for (int j = i + 1; j <= this.cant; j++) {
                if (v[i] > v[j]) {
                    intercambiar(i, j);
                }
            }
        }
    }

    
    public void MetodoAuxiliar1(ListaArreglo l2, ListaArreglo l3) {
        boolean bandera;
        int cantidad;
        for (int i = 1; i <= cant; i++) {
            bandera = l2.verificarExiste(v[i]);
            if (bandera == false) {
                l2.insertar1en1(v[i]);
            }
        }
        for (int i = 1; i <= l2.obtenerCant(); i++) {
            cantidad = frecuencia(l2.obtenerElemento(i));
            l3.insertar1en1(cantidad);
        }
    }

    
    public boolean verificarExiste(int ele) {
        boolean bandera = false;
        for (int i = 1; i <= cant; i++) {
            if (ele == v[i]) {
                bandera = true;
                break;
            }
        }
        return bandera;

    }

    public String descargar() {
        String s = "|";
        for (int i = 1; i <= this.cant; i++) {
            s = s + v[i] + "|";
        }
        return s;
    }

    public static void main(String[] args) {
        ListaArreglo l1= new ListaArreglo();
        ListaArreglo l2= new ListaArreglo();
        ListaArreglo l3= new ListaArreglo();
        
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
        
        l1.MetodoAuxiliar1(l2,l3);
        
        System.out.println(l2.descargar());
        System.out.println(l3.descargar());
    }
}
