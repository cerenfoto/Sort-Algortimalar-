
package bubblesort;
import java.util.Scanner;
import java.util.Random;
 
class BubbleSort {
  public static void main(String []args) {
    int diziElemanSayisi, c, d, swap, swapSayisi=0, comSayisi=0;
    Scanner in = new Scanner(System.in);
    Random rnd = new Random();
 
    System.out.println("Diziniz kaç elemanlı olsun?");
    diziElemanSayisi = in.nextInt();
 
    int dizi[] = new int[diziElemanSayisi];
      System.out.println("Dizininiz:");
 
  for (int i = 0; i <diziElemanSayisi; i++) {
            dizi[i] = rnd.nextInt(10001);
           
            System.out.print(dizi[i] + "-");
        }
 
    for (c = 0; c < ( diziElemanSayisi - 1 ); c++) {
      for (d = 0; d < diziElemanSayisi - c - 1; d++) {
          comSayisi=comSayisi+1;
        if (dizi[d] > dizi[d+1]) /* For descending order use < */
        {
          swap       = dizi[d];
          dizi[d]   = dizi[d+1];
          dizi[d+1] = swap;
          swapSayisi=swapSayisi+1;
        }
      }
    }
 
      System.out.println("\nSıralı diziniz:");
 
    for (c = 0; c < diziElemanSayisi; c++) 
      System.out.println(dizi[c]);
      System.out.println("swap sayiniz:" +swapSayisi);
      System.out.println("com sayiniz:" +comSayisi);
  }
}