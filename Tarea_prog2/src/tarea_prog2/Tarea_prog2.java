/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_prog2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tarea_prog2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Variables importantes para el ejercicio

        String nombre_pf;
        String mensaje_f = "";
        double ingre_sem;
        int num_sons;
        int cont = 1;
        int num_reports = 1;
        double total_p = 0;
        double total_b = 0;
        double total_s = 0;
        double ingre_pasaje;
        double ingre_bar;
        double ingre_salidas;
        double result_f = 0;
        boolean date = true;

        // Preguntar al usuario 
        System.out.printf("Nombre del Padre de Familia\n");
        nombre_pf = entrada.nextLine();
        System.out.printf("Sueldo semanal del Padre de Familia\n");
        ingre_sem = entrada.nextDouble();
        System.out.printf("Número de hijos del Padre de Familia\n");
        num_sons = entrada.nextInt();
        // Evaluaciones de ciclo While
mensaje_f = String.format("%s%s\n\n%s\n\n%s %s\n%s %.2f\n%s %d\n\n%s\t%s\t"
        + "%s\t%s\n",
                mensaje_f,"Reporte Gastos de Padres de Familia","Reporte 1",
                "Nombre del Padre de Familia: ", nombre_pf,
                "Sueldo semanal del Padre de Familia: ", ingre_sem,
                "Número de hijos del Padre de Familia: ", num_sons,"Persona",
                "Pasaje","Bar", "Salidas");
        while (cont <= num_sons) {
            System.out.printf("Gastos en Pasajes de hijo "+num_reports+"\n");
            ingre_pasaje = entrada.nextDouble();
            total_p = total_p + ingre_pasaje;
            System.out.printf("Gastos en Bar de hijo "+num_reports+"\n");
            ingre_bar = entrada.nextDouble();
            total_b = total_b + ingre_bar;
            System.out.printf("Gastos en Salidas de hijo "+num_reports+"\n");
            ingre_salidas = entrada.nextDouble();
            total_s = total_s + ingre_salidas;
            result_f = total_p + total_b + total_s;
            mensaje_f = String.format("%sHijo %d\t%.2f\t%.2f\t%.2f\n",mensaje_f 
            , cont, ingre_pasaje, ingre_bar, ingre_salidas);
            
     num_reports =  num_reports +1; //contador para mostrar n hijos del usuario
            cont = cont + 1 ;  //contador para ciclo while
        }
        // Total de suma de gastos semanales de los hijos
          System.out.printf("%sTotal\t%.2f\t%.2f\t%.2f\n\n", mensaje_f,total_p,
          total_b, total_s);
          // Condicionales para evaluar si al padre de familia le alcanzan 
          //para sus gastos semanales 
            if(ingre_sem > result_f){
                System.out.printf("El padre de familia "+nombre_pf+
                        " le alcanza el dinero semanal, para sus gastos\n\n"
                                + "Fin de reporte");
            }else{
                System.out.printf("El padre de familia "+nombre_pf+
                        " le falta el dinero semanal, para sus gastos\n\n"
                                + "Fin de reporte");
            }
            
     // final de ciclo      
    }

}
