package RecursionBoth;

// import java.util.*;

public class hanoi {
    public static void towerOfHanoi(int n, String src, String hlp, String dest) {
        if (n==1) {
            System.out.println("Transfer " + n + " disk from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 disk to helper
        towerOfHanoi(n-1, src, dest, hlp);
        System.out.println("Transfer " + n + " disk from " + src + " to " + dest);

        towerOfHanoi(n-1, hlp, src, dest);
    }
    public static void main(String[] args) {
        int n= 4;
        towerOfHanoi(n, "A", "B", "C");
    }
}
