import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugun hava cok guzel.";

        System.out.println(mesaj);

       /* System.out.println("eleman sayısı : "+mesaj.length());
        System.out.println("5. eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasin!"));
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("a"));*/

        System.out.println(mesaj.replace(" ","-"));
        System.out.println(mesaj);
        System.out.println(mesaj.substring(2,4));

        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }


    }
}