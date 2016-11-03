import java.util.Scanner;

class SegitigaSikuKananAtas {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int i,j;
       int panjang;
       System.out.printf("Jumlah Karakter/Tinggi Segitiga:");
       panjang= input.nextInt();

        System.out.println("**********************************");
         for (i=0;i<=panjang;i++){
            for(j=panjang;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(k);