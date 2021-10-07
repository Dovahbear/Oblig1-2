import java.util.Arrays;

public class Oppgave5 {
    @SuppressWarnings("ManualArrayCopy")
    public static void rotasjon(char[] a) {
        int size = a.length;
        if (a.length != 0) {
            char last = a[size - 1];
            for (int i = size - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = last;
        }
        System.out.println(Arrays.toString(a));
    }
}