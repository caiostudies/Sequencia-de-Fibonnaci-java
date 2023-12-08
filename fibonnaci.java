import java.util.Arrays;

public class fibonnaci {
    public static void main(String[] args) {
        int[] meuArray= new int[20];

        for (int i = 0; i < 18; i++) {
            meuArray[0]=0;
            meuArray[1]=1;
//
            meuArray[i+2]=meuArray[i+1] + meuArray[i];


        }
        System.out.println(Arrays.toString(meuArray));
    }
}
