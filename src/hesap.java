import java.util.Scanner;
public class hesap {
    public static void main(String[] args) throws Exception {
        int a,b, select;
        Scanner inp = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz :");
        a = inp.nextInt();
        System.out.print("ikinci sayıyı giriniz :");
        b = inp.nextInt();

        System.out.println("1-Toplama\n 2-Çıkarma \n3-Çarpma \n4-Bölme");
        select = inp.nextInt();

        switch(select){
        case 1 :
        System.out.println("Toplama : " + (a+b));
        break;

        case 2 :
        System.out.println("Çıkarma : " + (a-b));
        break;

        case 3 : 
        System.out.println("Çarpma : " + (a * b));
        break;

        case 4 : 
        switch(b){
           case 0 : 
           System.out.println("0 a bölünemez");
           break;
           
           default : 
           System.out.println("Bölme : " + (a / b));
        }
         default :
         System.out.println("Yanlış seçim yaptınız.");
         

    }
}
}