//  @ Laboratorio 3
//  @ File Name : Producto.java
//  @ Date : 13/10/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//
public abstract class Producto {
    
    //Atributos
    protected int id;
    protected String titulo;
    protected int cDisponibles;
    protected int cVendidos;
    protected float precio;
    protected String estado;
    protected int nPaginas;

    /**
     * 
     * @param id int
     * @param titulo String
     * @param cDisponibles int
     * @param cVendidos int
     * @param precio float
     * @param estado String
     * @param nPaginas int
     */
    public Producto(int id, String titulo, int cDisponibles, int cVendidos, float precio, String estado, int nPaginas) {
        this.id=id;
        this.titulo=titulo;
        this.cDisponibles=cDisponibles;
        this.cVendidos=cVendidos;
        this.precio=precio;
        this.estado=estado;
        this.nPaginas=nPaginas;
    }

    /**
     * 
     * @param estado Stirng
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * 
     * @return estado String
     */
    public String getEstado() {
        return estado;
    }
    /**
     * 
     * @param id int
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return id int
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param precio float
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    /**
     * 
     * @return precio float
     */
    public float getPrecio() {
        return precio;
    }
    /**
     * 
     * @param titulo String
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * 
     * @return titulo String
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * 
     * @param cDisponibles int
     */
    public void setcDisponibles(int cDisponibles) {
        this.cDisponibles = cDisponibles;
    }
    /**
     * 
     * @return cDisponibles int
     */
    public int getcDisponibles() {
        return cDisponibles;
    }
    /**
     * 
     * @param cVendidos int
     */
    public void setcVendidos(int cVendidos) {
        this.cVendidos = cVendidos;
    }
    /**
     * 
     * @return cVendidos int
     */
    public int getcVendidos() {
        return cVendidos;
    }
    /**
     * 
     * @param nPaginas int
     */
    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    /**
     * 
     * @return nPaginas int
     */
    public int getnPaginas() {
        return nPaginas;
    }

    @Override
    public String toString(){
        return "ID: " + id + "\nTitulo: " + titulo + "\nUnidades Dispobibles: " + cDisponibles + "\nUnidades Vendidas: " + cVendidos + "\nPrecio: " + precio + "\nEstado: " + estado + "\nNumero de paginas: " + nPaginas;
    }

}
