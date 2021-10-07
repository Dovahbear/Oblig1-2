/*import java.util.Arrays;

public class oppgave4 {
    public static void delsortering(int[] a) {
        if(a.length <= 1){
            return;
        }
        int left, right;
        left = 0;
        right = a.length-1;

        while(left < right) {
            while(a[left] % 2 == 0 && left<right) {
                left++;
            }
            while(a[right] % 2 != 0 && left< right) {
                right--;
            }
            if(left < right) {
                int x = a[left];
                a[left] = a[right];
                a[right] = x;

                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
*/