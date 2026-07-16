public class case6 {

    public static boolean isPrime(int n) {
        // 处理小值和边界
        if (n <= 1) return false;
        if (n <= 3) return true;    // 2 和 3 是质数
        if (n % 2 == 0 || n % 3 == 0) return false;

        // 6k±1 优化：所有质数可表示为 6k±1（k >= 1）
        // 只需检查形如 6k-1 和 6k+1 的因子
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] tests = { 1, 2, 3, 4, 5, 17, 18, 19, 97, 100, 9973 };
        for (int t : tests) {
            System.out.println(t + " -> " + isPrime(t));
        }
    }
}
