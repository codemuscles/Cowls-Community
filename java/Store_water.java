package ArrayLIst;
import java.util.ArrayList;

public class Store_water {
    public static int storeWater(ArrayList<Integer> height){
        int ans = 0;

        // Two pointer approach --> O(n)

        int lp = 0;
        int rp = height.size()-1;

        while (lp<rp) {
            // Find the area
            int ht = Math.min(height.get(lp), height.get(rp));
            int wd = rp - lp;
            int currWater = ht*wd;
            ans = Math.max(ans, currWater);

            // Update the pointers
            if (height.get(rp)>height.get(lp)) {
                lp++;
            }else{
                rp--;
            }
        }

        return ans;

        // Brute Force -- O(n^2)

    //     for (int i = 0; i < height.size(); i++) {
    //         for (int j = i+1; j < height.size(); j++) {
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int wd = j-i;
    //             int currWater = ht*wd;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;

    } 
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        height.add(9);
        System.out.println(storeWater(height));
    }
}
