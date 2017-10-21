/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1_z3;

import java.util.Scanner;

/**
 *
 * @author Emrlord
 */
public class Lab_1_z3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        System.out.print("Введите скобочную последовательность: ");
        String str = s.nextLine();
        for(int i = 0; i < str.length(); i++) {
            char result = str.charAt(i);
            if (result == '(')
                count++;
            else count--;
        }
        if(count == 0)
            System.out.print("Правильная");
        else
            System.out.print("Неправильная");
    }
}
