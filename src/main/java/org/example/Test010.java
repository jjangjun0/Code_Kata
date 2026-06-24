package org.example;

public class Test010 {
    public static double solution(int[] numbers) {
        double answer = 0;
        int length = numbers.length;
        for (int i = 0; i < length; i++)
            answer += numbers[i];
        answer /= length;
        return answer;
    }
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(numbers));
    }
}
