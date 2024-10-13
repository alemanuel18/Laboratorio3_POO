//  @ Laboratorio 3
//  @ File Name : Libro.java
//  @ Date : 13/10/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//
class Libro extends Producto{
    
    //Atributos
    protected String genero;

    /**
     * 
     * @param id int
     * @param titulo String
     * @param cDisponibles int
     * @param cVendidos int
     * @param precio float
     * @param estado String
     * @param nPaginas int
     * @param genero String
     */
    public Libro(int id, String titulo, int cDisponibles, int cVendidos, float precio, String estado, int nPaginas, String genero){
        super(id, titulo, cDisponibles, cVendidos, precio, estado, nPaginas);
        this.genero=genero;
    }

    /**
     * 
     * @param genero String
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * 
     * @return genero Stirng
     */
    public String getGenero() {
        return genero;
    }

    @Override
    public String toString(){
        return super.toString() + "\nGenero: " + genero;
    }

}
