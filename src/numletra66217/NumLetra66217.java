/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numletra66217;

import java.util.Scanner;

/**
 *
 * @author lampi
 */
public class NumLetra66217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int num=0;
        Scanner miConsola = new Scanner( System.in);
        System. out. println("Ingrese el numero");
        num= miConsola.nextInt();
        
        switch (num) {
            case 21,22,23,24,25,26,27,28,29:
                System.out.println("Veinti");
                break;
            case 31,32,33,34,35,36,37,38,39:
                System.out.println("Treinta y ");
                break;
            case 41,42,43,44,45,46,47,48,49:
                System.out.println("Cuarenta y ");
                break;
            case 51,52,53,54,55,56,57,58,59:
                System.out.println("Cincuenta y ");
                break; 
            case 61,62,63,64,65,66,67,68,69:
                System.out.println("Secenta y ");
                break;    
            case 71,72,73,74,75,76,77,78,79:
                System.out.println("Setenta y ");
                break;
            case 81,82,83,84,85,86,87,88,89:
                System.out.println("Ochenta y ");
                break;
            case 91,92,93,94,95,96,97,98,99:
                System.out.println("Noventa y ");
                break; 
            default:
                throw new AssertionError();
        }
        switch (num) {
            case 1,21,31,41,51,61,71,81,91:
                System.out.println("uno");
                 break; 
            case 2,22,32,42,52,62,72,82,92:
                System.out.println("dos");
                 break; 
            case 3,23,33,43,53,63,73,83,93:
                System.out.println("tres");
                 break; 
            case 4,24,34,44,54,64,74,84,94:
                System.out.println("cuatro");
                 break; 
            case 5,25,35,45,55,65,75,85,95:
                System.out.println("cinco");
                 break; 
            case 6,16,26,36,46,56,66,76,86,96:
                System.out.println("seis");
                 break; 
            case 7,17,27,37,47,57,67,77,87,97:
                System.out.println("siete");
                 break; 
            case 8,18,28,38,48,58,68,78,88,98:
                System.out.println("ocho"); 
                 break; 
            case 9,19,29,39,49,59,69,79,89,99:
                System.out.println("nueve");
                 break; 
            default:
                throw new AssertionError();
        }
        switch (num) {
            case 10:
                 System.out.println("Diez");
                 break;
            case 20:
                 System.out.println("Veinte");
                 break;
            case 30:
                 System.out.println("Treinta");
                 break;
            case 40:
                 System.out.println("Cuatenta");
                 break;
            case 50:
                 System.out.println("Cincuenta");
                 break; 
            case 60:
                 System.out.println("Secenta");
                 break;
            case 70:
                 System.out.println("setenta");
                 break;
            case 80:
                 System.out.println("Ochenta");
                 break;
            case 90:
                 System.out.println("Noventa");
                 break;
            default:
                throw new AssertionError();
        }
        switch (num) {
            case 11:
                 System.out.println("Once");
                 break;
            case 12:
                 System.out.println("Doce");
                 break;
            case 13:
                 System.out.println("Tecre");
                 break;
            case 14:
                 System.out.println("Catorce");
                 break;
            case 15:
                 System.out.println("Quince");
                 break;     
         
            default:
                throw new AssertionError();
        }
        
        
        switch (num) {
            case 16:
                System.out.println("Dieci");
                break;
            case 17:
                System.out.println("Dieci");
                break;
             case 18:
                System.out.println("Dieci");
                break;
            case 19:
                System.out.println("Dieci");
                break;    
            default:
                throw new AssertionError();
        }
    }
  
    
}
