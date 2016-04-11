
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uritm
 */
public class MainSVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i = 0;i<5;i++){
            System.out.println("Introdueix un valor:");
            a[i] = sc.nextInt();
        }
        int min = a[1];
        for (int i = 0; i <5; i++) {
            if(a[i]<min)min=a[i];
        }
        System.out.println(min);
    }
}
