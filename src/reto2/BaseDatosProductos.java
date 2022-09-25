package reto2;
import java.util.HashMap;
import reto2.Producto;

public class BaseDatosProductos {
    
    public HashMap<Integer , Producto> listaProductos = new HashMap<Integer , Producto>();
    
    public BaseDatosProductos(){
        
        this.listaProductos.put(1, new Producto(1,"Cafe",5000.0,25)); 
        this.listaProductos.put(2, new Producto(2,"Limones",2300.0,15));
        this.listaProductos.put(3, new Producto(3,"Peras",2700.0,33));
        this.listaProductos.put(4, new Producto(4,"Agua",9300.0,5));
        this.listaProductos.put(5, new Producto(5,"Tomates",2100.0,42));
        this.listaProductos.put(6, new Producto(6,"Fresas",4100.0,3));
        this.listaProductos.put(7, new Producto(7,"Helado",4500.0,41));
        this.listaProductos.put(8, new Producto(8,"Galletas",500.0,8));
        this.listaProductos.put(9, new Producto(9,"Chocolates",3500.0,80));
        this.listaProductos.put(10, new Producto(10,"Tortas",15000.0,10));
    }
    
    public void Agregar(int llave,Producto producto){
    
        boolean Existe = verificarExistencia(llave);
        if (Existe) {
            System.out.println("ERROR");
        }
        else{
            listaProductos.put(llave, new Producto(producto.getCodigo(),producto.getNombre(),producto.getPrecio(), producto.getInventario()));
            GenerarInforme();
        }
    }
    
    public void Eliminar(int llave){
    
        boolean Existe = verificarExistencia(llave);
        if (Existe) {
            listaProductos.remove(llave);
            GenerarInforme();
        }
        else{
            System.out.println("ERROR");
        }
    }
    
    public void Actualizar(Producto producto){
    
        boolean Existe = verificarExistencia(producto.getCodigo());
        if (Existe) {
            listaProductos.put(producto.getCodigo(), new Producto(producto.getCodigo(),producto.getNombre(),producto.getPrecio(), producto.getInventario()));
            GenerarInforme();
        }
        else{
            System.out.println("ERROR");
        }
    }
    
    public void GenerarInforme(){
        /*borrar antes de subir
        for (Producto  e : listaProductos.values()) {
            System.out.println(e.getCodigo() + e.getNombre() + e.getPrecio() + e.getInventario());
        }
        System.out.println("---------------------- Informe ------------------");

        */
        double precioMayor = 0, precioMenor = Integer.MAX_VALUE, promedioPrecios = 0, valorInventario = 0, sumaPrecios= 0, valinventarioProductos = 0;
        String productoMayor = "", productoMenor= "";
        for (Producto  producto : listaProductos.values()) {
            
            if (precioMayor < producto.getPrecio()) {
                precioMayor = producto.getPrecio();
                productoMayor = producto.getNombre();
            }
            if(precioMenor > producto.getPrecio()){
                precioMenor = producto.getPrecio();
                productoMenor = producto.getNombre();
            }
            sumaPrecios += producto.getPrecio();
            valinventarioProductos = producto.getPrecio() * producto.getInventario();
            valorInventario +=  valinventarioProductos;
        }
        promedioPrecios = sumaPrecios / listaProductos.size();
        System.out.println(productoMayor + " " + productoMenor + " " + String.format("%.1f", promedioPrecios)  + " " + valorInventario);
    }
    
    private boolean verificarExistencia(int llave){
        Producto Existe = listaProductos.get(llave);
        if (Existe != null) {
            return true;
        }
        else{
            return false;
        }
    }
}