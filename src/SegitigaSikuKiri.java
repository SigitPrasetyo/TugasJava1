import java.util.Scanner;

class SegitigaSikuKiri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
       int panjang;
        System.out.printf("Jumlah Karakter/Tinggi Segitiga:");
       panjang= input.nextInt();

        System.out.print("**********************************");
        // TODO code application logic here

        for (a = 0; a <=panjang; a++) {
           for (b = 0 ; a > b; b++) {
                System.out.print(b);
            }
           System.out.print("\n");
        
    
