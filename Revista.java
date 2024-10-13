class Revista extends Producto{
    
    protected String nEdicion;
    protected String peridicidad;

    public Revista(int id, String titulo, int cDisponibles, int cVendidos, float precio, String estado, int nPaginas, String nEdicion, String peridicidad){
        super(id, titulo, cDisponibles, cVendidos, precio, estado, nPaginas);
        this.nEdicion=nEdicion;
        this.peridicidad=peridicidad;
    }

    public void setnEdicion(String nEdicion) {
        this.nEdicion = nEdicion;
    }
    public String getnEdicion() {
        return nEdicion;
    }
    public void setPeridicidad(String peridicidad) {
        this.peridicidad = peridicidad;
    }
    public String getPeridicidad() {
        return peridicidad;
    }

    @Override
    public String toString(){
        return super.toString() + "\nNumero de Edicion: " + nEdicion + "\nPeridicidad: " + peridicidad;
    }
}
