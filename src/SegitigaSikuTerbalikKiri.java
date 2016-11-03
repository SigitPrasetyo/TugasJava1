import java.util.Scanner;
  
class SegitigaSikuTerbalikKiri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,k;
        int panjang;
        System.out.printf("Jumlah Karakter/Tinggi Segitiga:");
        panjang = input.nextInt();

//        System.out.print("=");
// TODO code application logic here

         for (i=0;i<=panjang;i++){
            for(k=panjang;k>=i;k--){
     
                System.out.print(k);
            }
            System.out.println();
        }
    }
}