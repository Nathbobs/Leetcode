//Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
public class Day1_1 {
    public static void main(String[] args) {
        countOdds(3,7);
        countOdds(8,10);

    }
    public static int countOdds(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++){
            if(i%2 !=0){
                count += 1;
            }
        }
        return count;
    }
}


