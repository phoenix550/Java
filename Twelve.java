package ylesanded;

public class Twelve {
    public static void main(String[] args) {
        int n = 5;
        // teravik
        for (int i = 0;i <= n;i++){
            if (i % 2 == 1){	//paaritute korral prindime tärnid
                for (int j = 0;j < i;j++){
                    System.out.print("*");
                }
                System.out.println("");

            }

        }
        for (int i = n-1;i > 0;i--){
            if (i % 2 == 1){
                for (int j = 0;j < i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }

        }

        System.out.println("");
        // kahanev
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n-i;j++){	//Vastavalt i inkrementeerimisele prinditakse järjest vähem tärne
                System.out.print("*");
            }
            System.out.println("");

        }

        System.out.println("");
        // kasvav
        for (int i = 0;i < n;i++){
            for (int j = 0;j <= i;j++){		//Vastavalt i inkrementeerimisele prinditakse järjest rohkem tärne
                System.out.print("*");
            }
            System.out.println("");

        }

        System.out.println("");
        // vahelduv
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n-i;j++){	//Vähenev
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int i = 0;i < n;i++){
            for (int j = 0;j <= i;j++){	//Suurenev
                System.out.print("*");
            }
            System.out.println("");

        }


    }
}