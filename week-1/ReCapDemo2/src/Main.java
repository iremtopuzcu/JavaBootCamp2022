import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2,1.3,1.4,1.5};

        for (int i=0;i< myList.length;i++){
            System.out.println(myList[i]);
        }

        double toplam=0;

        double max= myList[0];

        for(double number : myList){
            if(max<number){
                max = number;
            }
            System.out.println(number);
            toplam = toplam + number;
        }

        System.out.println(toplam);
        System.out.println(max);

}}