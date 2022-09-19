public class Main {
    public static void main(String[] args) {


        String[] ogrenciler = new String[4];
        ogrenciler[0]="irem";
        ogrenciler[1]="merve";
        ogrenciler[2]="hanife";
        ogrenciler[3]="zeki";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
    }

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
            
        }
} }