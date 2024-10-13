//  @ Laboratorio 3
//  @ File Name : Revista.java
//  @ Date : 13/10/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//
class Revista extends Producto{
    
    //Atributo
    protected String nEdicion;
    protected String peridicidad;

    /**
     * 
     * @param id int
     * @param titulo String
     * @param cDisponibles int
     * @param cVendidos int
     * @param precio float
     * @param estado String
     * @param nPaginas int
     * @param nEdicion String
     * @param peridicidad String
     */
    public Revista(int id, String titulo, int cDisponibles, int cVendidos, float precio, String estado, int nPaginas, String nEdicion, String peridicidad){
        super(id, titulo, cDisponibles, cVendidos, precio, estado, nPaginas);
        this.nEdicion=nEdicion;
        this.peridicidad=peridicidad;
    }

    /**
     * 
     * @param nEdicion Stirng
     */
    public void setnEdicion(String nEdicion) {
        this.nEdicion = nEdicion;
    }
    /**
     * 
     * @return nEdicion Stirng
     */
    public String getnEdicion() {
        return nEdicion;
    }
    /**
     * 
     * @param peridicidad String
     */
    public void setPeridicidad(String peridicidad) {
        this.peridicidad = peridicidad;
    }
    /**
     * 
     * @return peridicidad String
     */
    public String getPeridicidad() {
        return peridicidad;
    }

    @Override
    public String toString(){
        return super.toString() + "\nNumero de Edicion: " + nEdicion + "\nPeridicidad: " + peridicidad;
    }
}
