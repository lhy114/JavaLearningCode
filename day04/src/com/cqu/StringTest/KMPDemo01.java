package com.cqu.StringTest;
// 专门追踪 while 回溯的那一步，用 'ABABABABC' 作为模式（有好几次回溯）
public class KMPDemo01{

    public static void main(String[] args) {
        String p = "ABABABABC";
        buildNextVerbose(p);
    }

    static int[] buildNextVerbose(String p) {
        int m = p.length();
        int[] next = new int[m];
        int j = 0;

        for (int i = 1; i < m; i++) {
            System.out.println("========== i=" + i + " 字符='" + p.charAt(i) + "' ==========");
            System.out.println("  进入循环前: j=" + j + " (已匹配前缀长度 " + j + ")");

            // === 关键回溯循环 ===
            while (j > 0 && p.charAt(i) != p.charAt(j)) {
                System.out.println("  ⛔ 不匹配: p[" + i + "]='" + p.charAt(i)
                        + "' != p[" + j + "]='" + p.charAt(j) + "'");
                System.out.println("     当前想扩展的前缀: '" + p.substring(0, j) + "' 不能续上 '" + p.charAt(i) + "'");
                System.out.println("     查表: next[" + (j-1) + "]=" + next[j-1]
                        + " → 意味着 '" + p.substring(0, j) + "' 里, 最长前后缀长度 = " + next[j-1]);
                System.out.println("     所以: j 从 " + j + " 回退到 " + next[j-1]);
                j = next[j - 1];
                if (j > 0) {
                    System.out.println("     回退后的候选前缀: '" + p.substring(0, j) + "' (长度 " + j + ")");
                } else {
                    System.out.println("     回退后 j=0，候选前缀为空串");
                }
            }

            // 匹配上了
            if (p.charAt(i) == p.charAt(j)) {
                System.out.println("  ✅ 匹配: p[" + i + "]='" + p.charAt(i)
                        + "' == p[" + j + "]='" + p.charAt(j) + "'");
                j++;
                System.out.println("     j 前进到 " + j + " (前缀 '" + p.substring(0, j) + "' 已匹配)");
            } else {
                System.out.println("  ➖ j=" + j + ", 无法匹配任何前缀");
            }

            next[i] = j;
            System.out.println("  ▶ next[" + i + "] = " + j);
            System.out.println();
        }
        return next;
    }
}