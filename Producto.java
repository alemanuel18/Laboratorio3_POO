public abstract class Producto {
    
    protected int id;
    protected String titulo;
    protected int cDisponibles;
    protected int cVendidos;
    protected float precio;
    protected String estado;
    protected int nPaginas;

    public Producto(int id, String titulo, int cDisponibles, int cVendidos, float precio, String estado, int nPaginas) {
        this.id=id;
        this.titulo=titulo;
        this.cDisponibles=cDisponibles;
        this.cVendidos=cVendidos;
        this.precio=precio;
        this.estado=estado;
        this.nPaginas=nPaginas;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public float getPrecio() {
        return precio;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setcDisponibles(int cDisponibles) {
        this.cDisponibles = cDisponibles;
    }
    public int getcDisponibles() {
        return cDisponibles;
    }
    public void setcVendidos(int cVendidos) {
        this.cVendidos = cVendidos;
    }
    public int getcVendidos() {
        return cVendidos;
    }
    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    public int getnPaginas() {
        return nPaginas;
    }

    @Override
    public String toString(){
        return "ID: " + id + "\nTitulo: " + titulo + "\nUnidades Dispobibles: " + cDisponibles + "\nUnidades Vendidas: " + cVendidos + "\nPrecio: " + precio + "\nEstado: " + estado + "\nNumero de paginas: " + nPaginas;
    }

}
