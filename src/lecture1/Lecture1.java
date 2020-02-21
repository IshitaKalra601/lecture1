/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture1;
import java.util.Scanner;
/**
 *
 * @author jyoti today's date is 21/2/20 
 */
public class Lecture1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = input.nextDouble();
        lecture1class a2 = new lecture1class(r);
        System.out.println(a2.areaCircle());
         
    }
    
}
