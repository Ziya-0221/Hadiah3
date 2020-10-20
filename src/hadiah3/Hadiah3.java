
package hadiah3;
import java.util.Scanner;

public class Hadiah3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int celcius,farenheit,kelvin,reamur,kode,hasil;
        
        
        System.out.println("Tekan 1 untuk mengubah Celcius ke Farenheat");
        System.out.println("Tekan 2 untuk mengubah Celcius ke Kelvin");
        System.out.println("Tekan 3 untuk mengubah Celcius ke Reamur");
        
        System.out.print("Masukkan Angka Celcius: ");
        celcius = input.nextInt();
        System.out.print("Masukkan Kode di Atas: ");
        kode= input.nextInt();
        System.out.println("*************************");
        
        switch(kode){
            case 1:
                farenheit = 9/5*celcius ;
                hasil = farenheit + 32;
                System.out.println("Maka Hasilnya Adalah: "+hasil);
                break;
            case 2:
                kelvin = celcius + 273;
                System.out.println("Maka Hasilnya Adalah: "+kelvin);
                break;
            case 3:
                reamur = 4/5*celcius;
                System.out.println("Maka Hasilnya Adalah: "+reamur);
            default:
                System.out.println("Maaf,Perintah tidak dapat kami proses karena anda salah memasukkan kode");
        }
    }
    
}
