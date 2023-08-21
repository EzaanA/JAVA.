import java.util.*;
public class wave {
    public static void main(String[] args){

                int nums[]={2,1,-1};
                int totsum = 0;
                for (int i : nums) {
                    totsum += i;
                }
                System.out.println("totsum: " + totsum);
                int num = -1;
                int leftmost = 0;
                for (int i = 1; i < nums.length; i++) {
                    leftmost += nums[i-1];
                    System.out.println("left: " + leftmost);
                    System.out.println("nums at i: "+nums[i]);
                    System.out.print("Right: ");
                    System.out.println((totsum - leftmost) - nums[i]);
                    if (leftmost == (totsum - leftmost) - nums[i]) {
                        num = i;
                        break;
                    }
                }
        System.out.println(num);
    }
        }

