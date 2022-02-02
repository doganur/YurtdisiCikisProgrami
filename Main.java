package YurtDışıCıkısProg;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");

        String sartlar = "Yurtdışı çıkış kuralları...... \n"
                         + "herhangi bir siyasi yasağınızın bulunmaması gerekir \n"
                         + "15tl harç bedelinin tam yatrılmış olması gerekiyor \n"
                         + "Gideceğiniz ülkeye vizenizin bulunması gerekiyor";
        String message = "Yurtdışına çıkış şartlarından hepsini sağlamanız gerekiyor";

        while(true) {
            System.out.println("************************");
            System.out.println(message);
            System.out.println("*************************");
            System.out.println(sartlar);

            Yolcu yolcu = new Yolcu();

            System.out.println("Harç bedeli kontol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.yurtdısıharcıKontrol() == false) {
                System.out.println(message);
                continue;
            }


            System.out.println("Siyasi yasak kontol ediliyor.....");
            Thread.sleep(3000);

            if(yolcu.siyasiyasakKontrol() == false) {
                System.out.println(message);
                continue;
            }

            
            System.out.println("Vize durumu kontrol ediliyor....");
            Thread.sleep(3000);
            if(yolcu.vizedurumuKontrol() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz tamam. Yurtdışına çıkabilirsiniz...");
            break;

        }

    }
}
