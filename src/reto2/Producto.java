/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author jaiver
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private double precio;
    private int inventario;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getInventario() {
        return inventario;
    }
    
    
    public Producto(int codigo, String nombre, double precio, int inventario){
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }
    
    
    
    
    
    
    
    
    
   
}