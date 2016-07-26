
package test;

import clases.estudiante;

public class prueba01 {
    public static void main(String[] args) {
        estudiante est= new estudiante(17, "jose", "jarrin", 10.5, true);
        estudiante e1= new estudiante(17, "adrian", "carrion", 12.5, true);
        estudiante e2= new estudiante(17, "santiago", "jarrin", 0.5, false);
        //System.out.println(est.toString());
        imprimir(est);
        imprimir(e1);
        imprimir(e2);
        
        
        //System.out.println(a.division(12, 0));
            
    }
    
    public static void imprimir(estudiante e){
        System.out.println("");
        System.out.println(e.toString());
     
         
    }
    
    
    // definir una lista
    //List<estudiante> carlista = new ArrayList<>();
    
    //llenar lista
    //carlista.add(e1);
    
    
}
