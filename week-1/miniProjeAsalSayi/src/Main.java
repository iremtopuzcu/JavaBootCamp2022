public class Main {
    public static void main(String[] args) {

        int number = 1;
        boolean asayMı = true;

        if(number<1){
            System.out.println("gecersi sayi");

        }
         if(number ==1){
             System.out.println("asal degil");
             return;
         }
        for(int i=2;i<number;i++){
            if(number %i==0){
                asayMı = false;

            }



        }
        System.out.println(asayMı);
    }
}