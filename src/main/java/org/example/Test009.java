package org.example;

public class Test009 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i += 2)
            answer += i;
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
