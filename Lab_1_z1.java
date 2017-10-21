/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1_z1;

/**
 *
 * @author Emrlord
 */
public class Lab_1_z1 {
     public static void main(String[] args) {
        int a, ost;
        for (int i = 1; i < 100; i++) {
            a = i % 3;
            ost = i % 5;
            if (a == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (ost == 0) {
                System.out.println("Buzz");
                continue;
            }
            if (ost ==0 & a == 0){
                System.out.println("FizzBuss");
            
            }
        }
        }

}
