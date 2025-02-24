package day09.other;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapEx {

    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
        //스레드들의 경쟁으로 데이터의 접근이 안된 스레드는 loss가 생김
        //Map<Integer, String> map = new HashMap<>(); //thread 환경에 적합하지 않음

        //작업 스레드 객체A 생성
        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        //작업 스레드 객체B 생성
        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        //작업 스레드 실행
        threadA.start();
        threadB.start();

        //작업 스레드들이 모두 종료 될때까지 메인 스레드를 기다리게 할것임
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            System.out.println("외부 문제로 프로그램 종료");
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        //저장된 총 객체 수 얻기
        int size = map.size();
        System.out.println("총 객체 수 : " + size);
    }
}
