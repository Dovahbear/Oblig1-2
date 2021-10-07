public class Oppgave2 {
    public static int antallUlikeSortert(int [] a) {
     int antallUlikesortert = 1;
        if (a.length != 0) {
            for (int i = 0; i < a.length - 1; ++i) {
                if (a[i] != a[i + 1]) {
                    ++antallUlikesortert;
                }
            }
            return antallUlikesortert;
        }
        return 0;


    }
}
