
package clases;


public class persona {
    private int edad;
    private String nombre;
    private String apellido;
    private double peso;
    private boolean sexo;
    
    //to-do: explicar la linea negra debajo de "saluda" r. Carrion
    
    public void saluda(String mensaje){
        System.out.println(mensaje);
       
    }
    public int suma(int sumando1, int sumando2){
        //int sum = 0;
        //sum = sumando1+sumando2;
        //return sum;
        
        return sumando1 + sumando2;
    }
    
    
    
    
    
    
    public persona() {
    }

    public persona(int edad, String nombre, String apellido, double peso, boolean sexo) {
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
