import java.util.Scanner;

class SegitigaTerbalikKanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
       int panjang;
        System.out.printf("Jumlah Karakter/Tinggi Segitiga:");
       panjang= input.nextInt();

        System.out.println("**********************************");
        for (b=panjang; b>=0; b--)
           {
             for (a=0; a<=b; a++)
            {
             System.out.print(a);
             }
             System.out.println ();
             for (int o=panjang; o>=b; o--)
            {
            System.out.print (" ");
            } 
          } 
          
       }
}    
         
