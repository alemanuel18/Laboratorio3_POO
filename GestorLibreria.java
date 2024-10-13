import java.util.ArrayList;
import java.util.Scanner;

public class GestorLibreria {
    
    public static void main(String[] args) {
        
        Funcionamiento funcionamiento=new Funcionamiento();
        int eleccion=menu();
        int eleccion2;
        Scanner teclado=new Scanner(System.in);

        while (eleccion!=6) {
            if (eleccion == 1) {
                eleccion2=menu4();
                if (eleccion2==1) {
                    Libro libro=new Libro(funcionamiento.generarNumeroUnico(), ingresarString(1), ingresarint(1), 0, ingresarfloat(1), "Disponibles", ingresarint(2), menu2());
                    funcionamiento.agregarProducto(libro);
                    System.out.println("Se a agregado el libro");
                }else if (eleccion2==2) {
                    Revista revista=new Revista(funcionamiento.generarNumeroUnico(), ingresarString(1), ingresarint(1), 0, ingresarfloat(1), "Disponibles", ingresarint(2), ingresarString(2), menu3());
                    funcionamiento.agregarProducto(revista);
                    System.out.println("Se a agregado la revista");
                }else if (eleccion2==3) {
                    Comic comic=new Comic(funcionamiento.generarNumeroUnico(), ingresarString(1), ingresarint(1), 0, ingresarfloat(1), "Disponibles", ingresarint(2), ingresarString(3), ingresarString(4));
                    funcionamiento.agregarProducto(comic);
                    System.out.println("Sea agregado el comic");
                }
                eleccion=menu();
            }else if (eleccion==2) {
                System.out.println(funcionamiento.mostraInfoProductoEspecifico(seleccionarProducto(funcionamiento)));
                eleccion=menu();
            }else if (eleccion==3) {
                System.out.println(funcionamiento.mostrarInventarioProducto());
                eleccion=menu();
            }else if (eleccion==4) {
                System.out.println("Que producto desea comprar");
                if (funcionamiento.venta(seleccionarProducto(funcionamiento))==true) {
                    System.out.println("Su compre se realizo correctamente");
                }else
                System.out.println("No hay existencias de este producto");
                
                eleccion=menu();
            }else if (eleccion==5) {
                System.out.println(funcionamiento.mostrarVentas());
                eleccion=menu();
                
            }
        }
        System.out.println("Gracias por preferirnos, hasta la proxima.");

    }


    public static int menu(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nMenu\nSeleccione lo que deses realizar\n1. Agregar nuevo producto\n2. Informacion del producto\n3. Mostrar inventario\n4. Realizar venta\n5. Mostrar total de ventas\n6. Salir");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>6){
                    System.out.println("Ingrese una de las opciones del menu");
                }else
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioi;

    }
    public static String menu2(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nQue genero tiene el libro\n1. Fantacia\n2. Ciencia Ficcion\n3. Novela\n4. Misterio");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>4){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    if (eleccionUsuarioi==1) {
                        eleccionUsuarioS="Fantacia";
                        verificador=true;   
                    } else if (eleccionUsuarioi==2) {
                        eleccionUsuarioS="Ciencia Ficcion";
                        verificador=true;   
                    } else if (eleccionUsuarioi==3) {
                        eleccionUsuarioS="Novela";
                        verificador=true;   
                    } else if (eleccionUsuarioi==4) {
                        eleccionUsuarioS="Misterio";
                        verificador=true;   
                    }
                }
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioS;
    }
    public static String menu3(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nQue periodicidad tiene la revista\n1. Semanal\n2. Mensual\n3. Trimestral");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>4){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    if (eleccionUsuarioi==1) {
                        eleccionUsuarioS="Semanal";
                        verificador=true;   
                    } else if (eleccionUsuarioi==2) {
                        eleccionUsuarioS="Mensual";
                        verificador=true;   
                    } else if (eleccionUsuarioi==3) {
                        eleccionUsuarioS="Trimestral";
                        verificador=true;   
                    } 
                }
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioS;
    }

    public static int menu4(){

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\n¿Que producto ingresara?\n1. Libro\n2. Revista\n3. Comic");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>3){
                    System.out.println("Ingrese una de las opciones del menu");
                }else
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioi;
    }

    public static String ingresarString(int accion){
        Scanner teclado=new Scanner(System.in);
        String datoString="";
        if (accion==1) {
            System.out.println("Ingrese el titulo del producto.");
            datoString=teclado.nextLine();
        } else if (accion==2) {
            System.out.println("Ingrese la edicion de la revista.");
            datoString=teclado.nextLine();  
        } else if (accion==3) {
            System.out.println("Ingrese el nombre del ilustrador del Comic");
            datoString=teclado.nextLine();  
        } else if (accion==4) {
            System.out.println("Ingrese el nombre de la editorial");
            datoString=teclado.nextLine();  
        } 
        return datoString;
    }

    /**
     * 
     * @param accion
     * @return
     */
    public static int ingresarint(int accion){
        Scanner teclado=new Scanner(System.in);
        String Es;
        int Ei=0;
        boolean verificador=false;

        while (verificador==false) {
            if (accion==1) {
                System.out.println("Ingrese la cantidad de libros disponibles.");   
            } else if (accion==2) {
                System.out.println("Ingrese la cantidad de paginas del producto");   
            } else if (accion==3) {
                System.out.println("Ingrese el numero promedio de crias por camada");   
            } 
            Es=teclado.nextLine();

            try { 
                Ei=Integer.parseInt(Es);
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return Ei;
    }

    /**
     * 
     * @param accion
     * @return
     */
    public static float ingresarfloat(int accion){
        Scanner teclado=new Scanner(System.in);
        String Es;
        float Ei=0;
        boolean verificador=false;

        while (verificador==false) {
            if (accion==1) {
                System.out.println("Ingrese el presio del producto");   
            } else if (accion==2) {
                System.out.println("Ingrese el tamaño del felino en metros");   
            } else if (accion==3) {
                System.out.println("Ingrese el tamaño de la cola");   
            } else if (accion==4) {
                System.out.println("Ingrese la velocidad maxima del felino");   
            } else if (accion==5) {
                System.out.println("Ingrese el tamaño del cerebro del primate");   
            } else if (accion==6) {
                System.out.println("Ingresa el valor del costo de mantenimiento");
            }
            Es=teclado.nextLine();

            try { 
                Ei=Float.parseFloat(Es);
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero");
            } 
        }
        return Ei;
    }

    /**
     * 
     * @param funcionamiento
     */
    public static void mostrarProductos(Funcionamiento funcionamiento) {
        ArrayList<Producto> productos = funcionamiento.getProductos();
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            System.out.println((i + 1) + ". " + producto.getTitulo()+"-"+producto.getId());
        }
    }

    /**
     * 
     * @param funcionamiento
     * @return
     */
    public static String seleccionarProducto(Funcionamiento funcionamiento) {
        Scanner teclado=new Scanner(System.in);
        

        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        ArrayList<Producto> productos = funcionamiento.getProductos();

        
        while (verificador==false) {
            System.out.println("\nSeleccione el número del producto\n");
            mostrarProductos(funcionamiento);
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi < 1 && eleccionUsuarioi > productos.size()){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    verificador=true;
                    eleccionUsuarioS= productos.get(eleccionUsuarioi-1).getTitulo();
                }           
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioS;
    }
}
