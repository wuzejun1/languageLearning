package wuzejun.org.word.recite;

import wuzejun.org.word.recite.audio.KoreanSpeaker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class TestSentenceRead {

    public static void main(String[] args) throws Exception {

        System.out.println(Class.class.getClass().getResource("/").getPath() );
        List<String> sentences = new ArrayList<String>();
        sentences.add("혼자 사는 자취생은 어머니의 맛있는 요리가 그립다.");
        sentences.add("그렇다 고 매일 외식을 하자니 허리띠를 졸라매는 자취생들 에게는 큰  부담이 아닐 수 없다. ");
        sentences.add("시간의 여유가 없는 그들에게 간단 하게 집에서 만드는 짜장면을 소개해 보고자 한다.");
        sentences.add("보고자 한다.");
        sentences.add("간단 하게 집에서 만드는 짜장면을.");

        for (int i = 1; i <= sentences.size();i++) {
            System.out.println(i + ":" + sentences.get(i - 1));
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            String option = sc.nextLine();
            int pos = Integer.valueOf(option);
            KoreanSpeaker.speak(sentences.get(pos -1));
        }
    }
}
