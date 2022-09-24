
package reto2;
import java.util.HashMap;
import reto2.Producto;


public class BaseDatosProductos {
    
    HashMap<Integer , Producto> listaProductos = new HashMap();
     
    
    
    public BaseDatosProductos(){
        
        listaProductos.put(1, new Producto(1,"Cafe",5000.0,25));
        listaProductos.put(2, new Producto(2,"Limones",2300.0,15));
        listaProductos.put(3, new Producto(3,"Peras",2700.0,33));
        listaProductos.put(4, new Producto(4,"Agua",9300.0,5));
        listaProductos.put(5, new Producto(5,"Tomates",2100.0,42));
        listaProductos.put(6, new Producto(6,"Fresas",4100.0,3));
        listaProductos.put(7, new Producto(7,"Helado",4500.0,41));
        listaProductos.put(8, new Producto(8,"Galletas",500.0,8));
        listaProductos.put(9, new Producto(9,"Chocolates",3500.0,80));
        listaProductos.put(10, new Producto(10,"Tortas",15000.0,10));
    }
    
    public boolean Agregar(int llave,Producto producto){
    
        boolean Existe = verificarExistencia(llave);
        if (Existe) {
            System.out.println("Este codigo ya se encuentra en productos");
        }
        else{
            listaProductos.put(llave, new Producto(producto.getCodigo(),producto.getNombre(),producto.getPrecio(), producto.getInventario() ));
        }
       
        return true;
    }
    
    public boolean Eliminar(int llave){
    
        return true;
    }
    
    public boolean Actualizar(int llave){
    
        return true;
    }
    
    public String GenerarInforme(){
    
        return "Producto";
    }
    
    public boolean verificarExistencia(int llave){
        
        Producto Existe = listaProductos.get(llave);
        if (Existe != null) {
            return true;
        }
        else{
            return false;
        }
    }
    
     
    
    
    
    
}
