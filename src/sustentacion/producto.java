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
public class producto {

    private String nombre;
    int cant;
    int precio;

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getCant() {
        return cant;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void AgregarProducto() {

        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el nombre del producto: ");
        nombre = lector.next();
        System.out.println("Cantidad: ");
        cant = lector.nextInt();
        System.out.println("Precio: ");
        precio = lector.nextInt();
    }
    
}
