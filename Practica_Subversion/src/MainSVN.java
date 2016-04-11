
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
	//Comentari en la carpeta projecte2
		
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i = 0;i<10;i++){
            System.out.println("Introdueix un valor:");
            a[i] = sc.nextInt();
        }
	//nou comentari en el projecte2
        int min = a[1];
        for (int i = 0; i <10; i++) {
            if(a[i]<min)min=a[i];
        }
	//Comentari Projecte 1
        System.out.println(min);
    }
}
