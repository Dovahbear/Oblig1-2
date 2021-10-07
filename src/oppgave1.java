public class oppgave1 {
    public static int maks(int[] a) {

        int temp;
        for (int i = 0; i< a.length-1; i++) {

            if(a[i] > a[i+1]) {
                temp = a[i+1];
                a[i+1] = a[i];
                a[i] = temp;

            }
        }
        return a[a.length-1];

    }
    
}
