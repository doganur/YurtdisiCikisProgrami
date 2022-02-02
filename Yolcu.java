package YurtDışıCıkısProg;

import java.util.Scanner;

public class Yolcu implements YurtDısıKuralları  {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("yatırılan harç bedeli: ");
            this.harc = scanner.nextInt();
            scanner.nextLine();

            System.out.println("siyasi yasağınız bulunuyor mu? E/H");
            String cevap = scanner.nextLine();
            
            if( cevap.equals("E")) {
                this.siyasiYasak = true;
            }
            else{
                this.siyasiYasak = false;
            }
            System.out.println("vizeniz bulunuyor mu ? E/H");

            String cevap2 = scanner.nextLine();

            if(cevap2.equals("E")) {
                this.vizeDurumu = true;
            }
            else {
                this.vizeDurumu = false;
            }


        }

       
    }



    @Override
    public boolean yurtdısıharcıKontrol() {
        //  Auto-generated method stub
        if (this.harc < 15) {
            System.out.println("Harcı tam yatırmalısınız...");
            return false;
        }
        else {
            System.out.println("Harç işlemi tamamlandı..");
            return true;
        }
        
    }
    @Override
    public boolean siyasiyasakKontrol() {
        //  Auto-generated method stub
        if(this.siyasiYasak == true) {
            System.out.println("Yasağınızdan dolayı yurt dışına çıkamazsınız");
            return false;
        }
        else{
            System.out.println("Çıkış yasağınız bulunmuyor");
            return true;
        }
        
    }
    @Override
    public boolean vizedurumuKontrol() {
        //  Auto-generated method stub
        if(this.vizeDurumu == true) {
            System.out.println("Vize işlemleri tamamlandı");
            return true;
        }
        else{
            System.out.println("Vizeniz bulunmamaktadır");
            return false;
        }
    }
}
