
public class Main {
    public static void main(String[] args) {

       char grade = 'S';

       switch(grade){
           case 'A':
               System.out.println("Mukemmel : Gectiniz");
               break;

           case 'B':
               System.out.println("cok Guzel : Gectiniz");
               break;
           case 'C':
               System.out.println("iyi : Gectiniz");
               break;
           case 'F':
               System.out.println("Kaldiniz");
               break;
           default:
               System.out.println("Gecersiz Not Girdiniz...");
       }
    }
}