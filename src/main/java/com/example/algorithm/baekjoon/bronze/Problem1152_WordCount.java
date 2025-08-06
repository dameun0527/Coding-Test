package com.example.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BOJ 1152번 단어의 개수
 * ————————————————————————
 * [문제 링크]
 *  https://www.acmicpc.net/problem/1152
 *
 * [문제 요약]
 *  영어 대소문자와 공백으로 이루어진 문자열이 주어질 때,
 *  공백을 기준으로 “단어”가 몇 개 있는지 세어 출력한다.
 *  • 단어: 공백 한 칸으로만 구분, 연속 공백은 없음
 *  • 문자열은 공백으로 시작하거나 끝날 수 있다.
 *
 * [입력 형식]
 *  한 줄에 문자열 S (|S| ≤ 1,000,000)
 *
 * [출력 형식]
 *  단어의 개수 (정수)
 *
 * [제약 사항]
 *  • 시간 제한 2초, 메모리 제한 128MB
 *  • 공백 연속으로 나오지 않지만, “앞뒤” 공백은 있을 수 있음
 */
public class Problem1152_WordCount {
    public static void main(String[] args) throws IOException {
        // 1) 입력 스트림
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        // 2) 앞뒤 공백 제거 -> 빈 토큰 방지
        String trimmed = line.trim();

        // 3) 빈 문자열이면 0 반환
        if (trimmed.isEmpty()) {
            System.out.println(0);
            return;
        }

        // 4) split 후 배열 길이 출력
        String[] words = trimmed.split(" ");
        System.out.println(words.length);

    }
}
