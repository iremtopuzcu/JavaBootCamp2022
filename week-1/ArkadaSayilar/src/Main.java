public class Main {
    public static void main(String[] args) {


        // 1 den başlayıp bütün pozitif bölenleri aynı olan sayılar

        int sayi1= 221;
        int sayi2= 284;
        int top1=0;
        int top2=0;

        for(int i=1;i<sayi1;i++){
            if(sayi1%i==0)
                top1= top1+i;
        }
        for(int i=1;i<sayi2;i++){
            if(sayi2%i==0)
                top2= top2+i;
        }

       if(sayi1==top2 && sayi2==top1)
           System.out.println("arkadas");
       else
           System.out.println("degil");
    }
}