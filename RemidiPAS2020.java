
package remidipas2020;

import java.util.Scanner;




public class RemidiPAS2020 {
    public static void remidi(){
      
      int matematika, kimia, biologi, fisika;
      boolean running = true;
      double jumlah_nilai, jumlah_pelajaran;
              String ketik;
              
     Scanner nilai = new Scanner(System.in);
     
      while (running){
          System.out.println("Masukkan Nilai Pelajaran");
          System.out.print("Matematika : ");
          matematika = nilai.nextInt();
          System.out.print("kimia  : ");
          kimia = nilai.nextInt();
          System.out.print("Bilogi : ");
          biologi = nilai.nextInt();
          System.out.print("Fisikia : ");
          fisika = nilai.nextInt();
          
          jumlah_pelajaran= 4;
          jumlah_nilai=(matematika+kimia+biologi+fisika)/jumlah_pelajaran;
          if(jumlah_nilai>=75&&jumlah_nilai<=100){
              System.out.println("===Selamat anda lulus nilai anda di atas rata rata >>> "+ "Nilai anda :"+ jumlah_nilai);
          }else{
                  System.out.println("===Mohon maaf nilai anda dibawah rata rata , tetap semangat , "+ "nilai saat ini : "+ jumlah_nilai);
      }
          System.out.println("tekan ya jika ingin menginputkan data kembali dan tidak untuk menghentikan penginputan");
          ketik = nilai.next();
          if(ketik.equalsIgnoreCase("ya")){
              running = true;
          }if(ketik.equalsIgnoreCase("tidak")){
              running = false;  
          }
          }    
    }
    
    public static void main(String[] args) {
     remidi();   
        
    }
    
}
//Boolean adalah tipe data yang digunakan juga untuk menampung sebuah logika dengan nilai yang kita sudah sebutkan sebelumnya.
//Dengan adanya tipe data boolean kita bisa membuat suatu 
//logika untuk menempatkan nilai yang true atau false pada pemograman kita.