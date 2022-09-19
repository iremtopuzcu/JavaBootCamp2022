public class Main {
    public static void main(String[] args) {

        for(int i=1;i<10;i++){
            System.out.println(i);
        }

        System.out.println("Dongu bitti...");

        for(int i=1;i<10;i+=2){
            System.out.println(i);
        }

        System.out.println("...FOR DONGUSU BITTI...");

        int i=1;
        while(i<10){
            i++;
            System.out.println(i);
        }

        System.out.println();
        System.out.println("...WHILE DONGUSU BITTI...");
        System.out.println();

        int j=10;
        do {
            System.out.println(j);
            j+=2;
        }while(j<10);

        System.out.println();
        System.out.println("...DO-WHILE DONGUSU BITTI...");
        System.out.println();


    }
}