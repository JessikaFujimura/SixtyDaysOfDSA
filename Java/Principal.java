public class Principal {
    
    public static void main(String[] args){
        TwoSum twoSum = new TwoSum(8, new int[]{1,2,3,4,0,5});
        int[] pos = twoSum.sumTwo();
        for(int x: pos) {
            System.out.print(x);
            System.out.println(", ");
        }

    }
}
