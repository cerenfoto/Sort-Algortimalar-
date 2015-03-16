package shell_sort;

import java.util.Random;
import java.util.Scanner;

public class Shell_sort {

    public static int swap = 0;
    public static int comparation = 0;

    public static void main(String[] args) {
      
        int min = 0;
        int temp;
        int diziElemanSayisi, swapSayisi = 0, comSayisi = 0;
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Diziniz kaç elemanlı olsun?");
        diziElemanSayisi = in.nextInt();

        int dizi[] = new int[diziElemanSayisi];
        System.out.println("Dizininiz:");

        for (int i = 0; i < diziElemanSayisi; i++) {
            dizi[i] = rnd.nextInt(10001);

            System.out.print(dizi[i] + "-");
        }
        ShellSort(dizi);

        System.out.println("swap:" + swap + " Comparation : " + comparation);

    }

    public static void ShellSort(int[] a) {
        int increment = a.length / 2;
        while (increment > 0) {
            comparation++;
            for (int i = increment; i < a.length; i++) {
                comparation++;
                int j = i;
                int temp = a[i];
                while (j >= increment && a[j - increment] > temp) {
                    swap++;
                    a[j] = a[j - increment];
                    j = j - increment;
                }
                a[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }

}
