public class Main {
    public static void main(String[] args) {

        // 6---->1,2,3

        int number = 6;
        int toplam=0;

        for(int i=1;i<number;i++){
            if(number%i==0){
                toplam=toplam+i;
            }
        }

        if(number==toplam){
            System.out.println("mukemmel sayi");

        }
        else
            System.out.println("mukemmel sayi degil");
    }
}