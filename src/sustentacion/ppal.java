/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class ppal {

    /**
     * @param args the command line arguments
     */
    static int suma = 0;
    static producto arreglo[] = new producto[10];
    static int[] cantventas = new int[10];
    static int[] total = new int[10];

    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = new producto();
        }

        do {
            System.err.println("       ¡ MENU !");
            System.out.println(" 1. Agregar producto \n 2. Buscar producto \n 3. Eliminar producto \n 4. Mostrar inventario \n 5. Realizar venta \n 6. Mostrar ganancias totales \n 7. salir");
            System.out.println("Ingrese la operacion a relaizar del menu:");
            opc = lector.nextInt();
            switch (opc) {
                case 1:
                    arreglo[suma].AgregarProducto();
                    suma = suma + 1;
                    break;

                case 2:
                    BuscarProducto();
                    break;
                case 3:
                    EliminarProducto();
                    break;
                case 4:
                    inventario();
                    break;
                case 5:
                    RealizarVentas();
                    break;
                case 6:
                    Ganancias();
                    break;
            }
        } while (opc != 7);
    }

    public static void BuscarProducto() {
        String nom;
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el nombre del producto q desea buscar");
        nom = lector.next();
        int t = 0;
        for (int i = 0; i < suma; i++) {
            if (arreglo[i].getNombre().equals(nom)) {
                System.out.println("Nombre: " + arreglo[i].getNombre());
                System.out.println("Cantidad: " + arreglo[i].getCant() + " Unidades");
                System.out.println("Precio: " + arreglo[i].getPrecio() + " $");
                t = 1;
            }
        }
        if (t == 0) {
            System.err.println("Error el producto no existe");
        }
    }

    public static void EliminarProducto() {
        String nom;
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el nombre del producto q desea eliminar");
        nom = lector.next();
        int f = 0;
        for (int i = 0; i <= suma; i++) {
            if (arreglo[i].getNombre().equals(nom)) {
                for (int j = i; j <= suma; j++) {
                    arreglo[i] = arreglo[i + 1];
                    f = 1;
                }
                suma--;
            }
        }
        if (f == 0) {
            System.err.println("Error el producto no existe");
        }
    }

    public static void RealizarVentas() {
        String nom;
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el nombre del producto q desea comprar");
        nom = lector.next();
        int f = 0;
        for (int i = 0; i < suma; i++) {
            if (arreglo[i].getNombre().equals(nom)) {
                System.out.println("Digite la cantidad q desea comprar");
                int z=lector.nextInt();
                int cantidad = arreglo[i].getCant() - z;
                cantventas[i] = z;                
                total[i] = arreglo[i].getPrecio()*cantventas[i];
                arreglo[i].setCant(cantidad);

                f = 1;
            }
        }
        if (f == 0) {
            System.err.println("Error el producto no existe");
        }
    }

    public static void Ganancias() {
        for (int i = 0; i < suma; i++){
            System.out.println("Producto: " + i);
            System.out.println("Nombre: " + arreglo[i].getNombre());
            System.out.println("Cantidad vendidas: " + cantventas[i]);
            System.out.println("Total ganancia: "+total[i]);
        }

    }

    public static void inventario() {
        for (int i = 0; i < suma; i++) {
            System.out.println("Producto: " + i);
            System.out.println("Nombre: " + arreglo[i].getNombre());
            System.out.println("Cantidad: " + arreglo[i].getCant() + " Unidades");
            System.out.println("Precio: " + arreglo[i].getPrecio() + " $");
        }
    }

}
