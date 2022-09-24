
package reto2;
import java.util.Scanner;


public class Reto2 {

  private final Scanner scanner = new Scanner(System.in);

    /**
    * Este método es usado para solicitar datos al usuario
    * @return  Lectura de la siguiente linea del teclado
    */
    public String read(){
        return this.scanner.nextLine();
    }

    public static void  main(String[] args){
        Reto2 metodos = new Reto2();
        
        
        metodos.run();
    
    }
    /**
    * método principal
    */
    public void run(){
       BaseDatosProductos datos = new BaseDatosProductos();
        
        System.out.println("Ingresa Operación: ");
        
        String operacion = read();
       
        if (operacion == "AGREGAR") {
            int codigo = 39;
            String nombre = "Juan";
            double precio = 20.34;
            int inventario = 45;
            
            Producto _producto = new Producto(1,"Cafe",5000.0,25);
            datos.Agregar(1, _producto);
        }
        
        System.out.println(datos.listaProductos);
        
    }
    
}
