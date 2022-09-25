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
        
        String operacion = read();
        String [] _producto = read().split(" ");
        int codigo = Integer.parseInt(_producto[0]);

        if (operacion.equals("AGREGAR")) {
            String nombre = _producto[1];
            double precio = Double.parseDouble(_producto[2]);
            int inventario = Integer.parseInt(_producto[3]);
            Producto producto = new Producto(codigo,nombre,precio,inventario);
            datos.Agregar(codigo, producto);
        }
        else if (operacion.equals("BORRAR")) {
            datos.Eliminar(codigo);
        }
        else if (operacion.equals("ACTUALIZAR")) {
            String nombre = _producto[1];
            double precio = Double.parseDouble(_producto[2]);
            int inventario = Integer.parseInt(_producto[3]);
            Producto producto = new Producto(codigo,nombre,precio,inventario);
            datos.Actualizar(producto);
        }
        else if (operacion.equals("GENERAR INFORME")) {
            datos.GenerarInforme();
        }
    }
}
