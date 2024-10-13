import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Funcionamiento {
    private ArrayList<Producto>productos=new ArrayList<>();
    private Set<Integer> numerosGenerados;
    private Random random;
    int ventas=0;

    public Funcionamiento() {
        numerosGenerados = new HashSet<>();
        random = new Random();
    }

    // Método para generar un número aleatorio que no se repita
    public int generarNumeroUnico() {
        int numero;
        // Generar números hasta encontrar uno que no esté en el set
        do {
            numero = random.nextInt();  // Genera un número aleatorio sin límites (puede ser positivo o negativo)
        } while (numerosGenerados.contains(numero));  // Repetir mientras ya haya sido generado
        numerosGenerados.add(numero);  // Agregar el número al conjunto
        return numero;
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public String mostraInfoProductoEspecifico(String nombre){
        String info="";
        for(Producto producto:productos){
            if (producto.getTitulo().equals(nombre)) {
                info=producto.toString();
                return info;
            }
        }
        return info;
    }

    public String mostrarInventarioProducto(){
        String libros="Libros:\n";
        String revistas="Revistas:\n";
        String comics="Comics:\n";
        for(Producto producto : productos){
            if (producto instanceof Libro) {
                Libro libro=(Libro)producto;
                libros += libro.getTitulo()+"-"+libro.getId()+" Existencias: "+libro.getcDisponibles()+"\n";
            }else if (producto instanceof Revista) {
                Revista revista=(Revista)producto;
                revistas += revista.getTitulo()+"-"+revista.getId()+" Existencias: "+revista.getcDisponibles()+"\n";
            }else if (producto instanceof Comic) {
                Comic comic=(Comic)producto;
                comics += comic.getTitulo()+"-"+comic.getId()+" Existencias: "+comic.getcDisponibles()+"\n";
            }
        }

        return libros + revistas + comics;
    }

    public boolean venta(String nombre){
        for(Producto producto:productos){
            if (producto.getTitulo().equals(nombre)) {
                if (producto.getcDisponibles()==0) {
                    producto.setEstado("No disponible");
                    return false;
                }else{
                    ventas +=1;
                    producto.setcDisponibles(producto.getcDisponibles()-1);
                    return true;
                }
            }
        }
        return false;
    }

    public String mostrarVentas(){
        return "El total de vetnas es: " + ventas;
    }

}
