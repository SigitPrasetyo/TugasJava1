import java.util.Scanner;

public class SegitigaSamaKaki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int panjang;
        System.out.printf("Jumlah Karakter/Tinggi Segitiga:");
       panjang= input.nextInt();

        for (int x = 0; x <= panjang; x++) {
            for (int y = 1; y <= panjang - x; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z < 2 * x; z++) {
                System.out.print(z);
            }
            System.out.println(" ");
        } 
    }
}

