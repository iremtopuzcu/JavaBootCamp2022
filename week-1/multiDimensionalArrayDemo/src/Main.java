public class Main {
    public static void main(String[] args) {

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "a";
        sehirler[0][1] = "b";
        sehirler[0][2] = "c";
        sehirler[1][0] = "d";
        sehirler[1][1] = "e";
        sehirler[1][2] = "f";
        sehirler[2][0] = "g";
        sehirler[2][1] = "h";
        sehirler[2][2] = "i";

        for( int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}