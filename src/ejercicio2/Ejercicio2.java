/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author INTEL
 */
public class Ejercicio2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int a[], b[], c[];
        int n;
        Scanner entrada=new Scanner(System.in);
        a=new int[12];
        b=new int[12];
        c=new int[24];
        System.out.println("Digíte los elementos del primer vector");
        for(int i=0;i<12;i++)
        {
            System.out.print("Digite el número #"+i+" del primer vector: ");
            a[i]=entrada.nextInt();
        }
        for(int i=0;i<12;i++)
        {
            System.out.print("Digite el número #"+i+" del segundo vector: ");
            b[i]=entrada.nextInt();
        }
        for(int j=0;j<4;j++)
        {
            n=j*6;
            for(int k=0;k<3;k++)
            {
                c[n+k]=a[n+k];
                c[n+k+3]=b[n+k];
            }
        }   
    }
}
