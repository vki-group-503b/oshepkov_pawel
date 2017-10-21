/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1_z2;

import static java.lang.StrictMath.sqrt;
import java.util.Scanner;

/**
 *
 * @author Emrlord
 */
public class Lab_1_z2 {

    public static void main(String[] args) {
       System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        int b=1;
	        for(int i=2;i<=sqrt(a);i++) {
	            if(a%i==0){
	                b=0;
	            break;
                }

            }
        if(b==1) {
            System.out.println("простое");
        }
        else{
            System.out.println("не простое");
        }
    }
    
}
