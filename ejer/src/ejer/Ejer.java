/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer;

import java.util.Scanner;

/**
 *
 * @author boolean
 */
public class Ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita el termino n:");
        int n = sc.nextInt();
        System.out.println("Digita el termino k:");
        int k = sc.nextInt();
        System.out.println("Digita el termino que quieres conocer cuando n sea:");
        double nSuc = sc.nextDouble();
        System.out.println("Digita el termino que quieres conocer cuando k sea:");
        double kSuc = sc.nextDouble();
        double productoria = 1;
        double sumatoria = 0;
        double res;
        for(int i=1;i<=n;i++) {
            for(int j=2;j<=k;j++) {
               sumatoria = sumatoria + ((i+j)*(i+j));  
                System.out.println(sumatoria);
                if(kSuc == (j-1)) {
                    kSuc = Math.pow((i+j),2);
                }
            }
            
            productoria = productoria * Math.pow(sumatoria, 2);
            if(nSuc == i) {
                nSuc = sumatoria * sumatoria;
            }
            System.out.println(productoria);
        }
        res = (Math.sqrt(productoria));
        System.out.println(res);
        System.out.println("El numero de n especifico: " + nSuc);
        System.out.println("El numero de k especifico: " + kSuc);
        System.out.println("hola mundo");
    }
    
}
