package ylesanded;

public class Ten {
    private static final int
        line_length = 5,	//viis arvu järjest
        limit = 66;		//numbrid ühest 66ni

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        int n = 0;	//arvude loend

        //Inkrementeerime numbreid kuni 66ni
        for (int i = 1; i <= limit; i++) {
            output.append(i);

            if (++n == line_length) {
                output.append("\r\n");
                n = 0;
            }
        }

        System.out.println(output);
    }
}