package com.kh.exam.controller;

import java.util.Arrays;
import java.util.Scanner;

public class TestController {
    public void test1() {

        Scanner sc = new Scanner(System.in);
        String[] personArr = new String[5];
        for (int i = 0; i < personArr.length; i++) {
            System.out.print((i + 1) + "번째 주민번호 입력 : ");
            String personId = sc.nextLine();
            if (personId.length() == 14) {
                char gender = personId.charAt(7);
                if (gender == '1' || gender ==2 || gender == '3' || gender == '4') {
                    // 주민번호 형식이 올바를 경우에만 마스킹을 적용
                    personArr[i] = personId.substring(0, 8) + "******";
                } else {
                    System.out.println("잘못된 주민번호 형식입니다. 다시 입력하세요.");
                    i--; // 다시 입력 받기 위해 i를 감소시킴
                }
            } else {
                System.out.println("잘못된 주민번호 형식입니다. 다시 입력하세요.");
                i--; // 다시 입력 받기 위해 i를 감소시킴
            }
        }
        System.out.println("--- 주민번호 정보 등록 완료 ---");
        System.out.println(Arrays.toString(personArr));
    }
}