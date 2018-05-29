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
        sentences.add("집에서 만드는 짜장면을 소개해 보고자 한다");

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
