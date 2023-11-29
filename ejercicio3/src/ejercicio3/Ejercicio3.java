/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int x;
        int n;
        int m;
        int r;
        int s = 0;
        int c;

        System.out.println("Ingrese multiplicando");
        n = entrada.nextInt();
        System.out.println("Ingrese multiplicador");
        m = entrada.nextInt();
        entrada.nextLine();

        r = n * m;
        /*x = m % 2;
        if (x == 0) {
            while (s < r) {
                m = m / 2;
                if (m % 2 > 0) {
                    n = n * 2;
                    s = s + n;
                } else {
                    n = n * 2;
                }
            }
        } else {
            if (x == 1) {
                while (s < r) {
                    c = m / m;
                    while (c < m) {
                        if (c == 1) {
                            s=s+n;
                            s = s + (n * 2);
                            c = c + 2;
                        }else{
                            s = s + (n * 2);
                            c = c + 2;
                        }
                        
                    }
                }
            }
        }*/
        while(s<=r){
            n=n*2;
            m=m/2;
            if(m%2==1||m==1){
                s=s+n;
            }
        }
        System.out.printf("Respuesta: %d", s);
    }

}
