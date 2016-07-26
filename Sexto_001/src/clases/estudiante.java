
package clases;


public class estudiante {
    private int edad;
    private String nombre;
    private String apellido;
    private double peso;
    private boolean sexo;
    
    //to-do: explicar la linea negra debajo de "saluda" r. Carrion
    
    public void saluda(String mensaje){
        System.out.println(mensaje);
       
    }
    
    public int division(int divisor, int dividendo)
    {
        int resultado = 0;
        try{
            resultado = dividendo/divisor;
        }
            catch (Exception e){
            System.out.println("Error: "+ e);
        }
        
        return resultado;
        
        //return divisor/dividendo;
    }
    

    @Override
    public String toString() {
        return "estudiante{" + "edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + ", peso=" + peso + ", sexo=" + sexo + '}';
    }
    
    
  
    public estudiante() {
    }

    public estudiante(int edad, String nombre, String apellido, double peso, boolean sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    
}
