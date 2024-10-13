//  @ Laboratorio 3
//  @ File Name : Comic.java
//  @ Date : 13/10/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//
class Comic extends Producto{
    
    //Atributos
    protected String ilustrador;
    protected String editorial;

    /**
     * 
     * @param id int
     * @param titulo Stirng
     * @param cDisponibles int
     * @param cVendidos int
     * @param precio float
     * @param estado String
     * @param nPaginas int 
     * @param ilustrador String
     * @param editorial Stirng
     */
    public Comic(int id, String titulo, int cDisponibles, int cVendidos, float precio, String estado, int nPaginas, String ilustrador, String editorial){
        super(id, titulo, cDisponibles, cVendidos, precio, estado, nPaginas);
        this.ilustrador=ilustrador;
        this.editorial=editorial;
    }

    /**
     * 
     * @return ilustrador String
     */
    public String getIlustrador() {
        return ilustrador;
    }
    /**
     * 
     * @param ilustrador Stirng
     */
    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }
    /**
     * 
     * @return editorial String
     */
    public String getEditorial() {
        return editorial;
    }
    /**
     * 
     * @param editorial Stirng
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString(){
        return super.toString() + "\nIlustrador: " + ilustrador + "\nEditorial: " + editorial;
    }
}
