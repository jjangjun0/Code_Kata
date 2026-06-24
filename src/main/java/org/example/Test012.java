package org.example;

public class Test012 {
    public static double solution(int[] arr) {
        double answer = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++)
            answer += arr[i];
        answer /= length;
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(solution(arr));
    }
}
