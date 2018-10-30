/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornopractica1;
import java.util.*;
/**
 *
 * @author admin
 */
public class Entornopractica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(java.lang.String[] args) {
    String cadena, num;
    int  cont=0;
    char fin;
    Scanner sc=new Scanner (System.in);
   
    do{
        System.out.println("Anota un caracter ");
        num=sc.nextLine();
        
        System.out.println("Anota una cadena");
        cadena=sc.nextLine();
        
        if (cadena.equalsIgnoreCase(num)){    
                cont++;
            }
        System.out.println("Desea continuar");
        fin=sc.nextLine().charAt(0);
        }while(fin=='s');
    System.out.println("La veces que ha estado"+num+"han sido"+cont);
    }
}