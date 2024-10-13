class Libro extends Producto{
    
    protected String genero;

    public Libro(int id, String titulo, int cDisponibles, int cVendidos, float precio, String estado, int nPaginas, String genero){
        super(id, titulo, cDisponibles, cVendidos, precio, estado, nPaginas);
        this.genero=genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }

    @Override
    public String toString(){
        return super.toString() + "\nGenero: " + genero;
    }

}
