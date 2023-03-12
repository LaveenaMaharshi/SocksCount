public class SingularSocksCount {
    public static void main(String[] args) {
        int[] arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int count = 0;
        for (int i = 0; i < arrNum.length; i++) {
            int num = arrNum[i];
            int pairCount = 0;
            for (int j = 0; j < arrNum.length; j++) {
                if (arrNum[j] == num) {
                    pairCount++;
                }
            }
            if (pairCount % 2 != 0) {
                count++;
            }
        }
        System.out.println("Count of singular socks = " + count);
    }
}
