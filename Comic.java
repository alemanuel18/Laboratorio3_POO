class Comic extends Producto{
    
    protected String ilustrador;
    protected String editorial;

    public Comic(int id, String titulo, int cDisponibles, int cVendidos, float precio, String estado, int nPaginas, String ilustrador, String editorial){
        super(id, titulo, cDisponibles, cVendidos, precio, estado, nPaginas);
        this.ilustrador=ilustrador;
        this.editorial=editorial;
    }

    public String getIlustrador() {
        return ilustrador;
    }
    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString(){
        return super.toString() + "\nIlustrador: " + ilustrador + "\nEditorial: " + editorial;
    }
}
