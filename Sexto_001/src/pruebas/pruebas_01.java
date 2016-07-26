/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import clases.estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rocby
 */
public class pruebas_01 {

    public static void main(String[] args) {

        estudiante est = new estudiante(17, "pepito", "colores", 10.5, true);
        estudiante e1 = new estudiante(12, "Ana", "Perez", 15.24, false);
        estudiante e2 = new estudiante(15, "Felipe", "Torres", 15.24, false);

        //System.out.println(est.toString());
        //imprimir(est);
        //imprimir(e1);
        //imprimir(e2);
        List<estudiante> lista = new ArrayList();
        lista.add(e2);
        lista.add(e1);
        lista.add(est);
        estudiante a = new estudiante();
        imprimir(lista);

         System.out.println(a.division(12,3));
    }

    public static void imprimir(estudiante ponga_aqui_el_estudiante) {
        System.out.println(" ");
        System.out.println(ponga_aqui_el_estudiante.getApellido());
        System.out.println(ponga_aqui_el_estudiante.getNombre());
        System.out.println(ponga_aqui_el_estudiante.getEdad());
        System.out.println(ponga_aqui_el_estudiante.getPeso());
        System.out.println(ponga_aqui_el_estudiante.isSexo());
        //System.out.println(e.toString());
    }
    
    
    public static void imprimir(List<estudiante> e) {
        for(estudiante Miestudiante : e){
            System.out.println( Miestudiante.toString());
        }
    }
    
}
