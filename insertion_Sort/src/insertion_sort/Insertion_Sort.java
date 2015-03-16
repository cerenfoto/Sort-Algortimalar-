/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion_sort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BM
 */
public class Insertion_Sort {

    public static int swap = 0;
    public static int comparation = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        int min = 0;
     
        int diziElemanSayisi;
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Diziniz kaç elemanlı olsun?");
        diziElemanSayisi = in.nextInt();

        int dizi[] = new int[diziElemanSayisi];
        System.out.println("Dizininiz:");

        for (int i = 0; i < diziElemanSayisi; i++) {
            dizi[i] = rnd.nextInt(10001);

            System.out.println(dizi[i] + "-");
        }
        InsertionSort(dizi);

        for (int i = 1; i < 10; i++) {
            System.out.println(dizi[i]);
        }
        System.out.println("swap:" + swap + " Comparation : " + comparation);

    }

    public static void InsertionSort(int[] num) {
        int j;                     // the number of items sorted so far
        int key;                // the item to be inserted
        int i;
        for (j = 1; j < num.length; j++) // Start with 1 (not 0)
        {
            key = num[ j];
            comparation++;
            for (i = j - 1; (i >= 0) && (num[ i] < key); i--) // Smaller values are moving up
            {
                num[ i + 1] = num[ i];
                comparation++; 
                swap++;
            }
            num[ i + 1] = key;    // Put the key in its proper location
        }
    }

}
