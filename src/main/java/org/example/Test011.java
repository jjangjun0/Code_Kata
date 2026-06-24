package org.example;

public class Test011 {
    public static String solution(int num) {
        String answer = "";
        if ((num & 1) == 1)
            answer = "Odd";
        else
            answer = "Even";
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(1));
    }
}
