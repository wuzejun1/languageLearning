package wuzejun.org.word.recite;

import wuzejun.org.word.recite.start.Application;
import wuzejun.org.word.recite.word.ReciteWord;

import java.util.ArrayList;
import java.util.List;

public class Homework20180602 {
    public static void main(String[] args) {
        List<ReciteWord> reciteWordList = new ArrayList<>();
        reciteWordList.add(new ReciteWord("안녕", "hello", "선생님 안녕하세요"));
        reciteWordList.add(new ReciteWord("초대", "invite", "나는 친구를 초대하였다"));
        reciteWordList.add(new ReciteWord("감사", "thank you", "아버지 감사합니다"));
        reciteWordList.add(new ReciteWord("앉다", "seat", "의자에 앉으세요"));
        reciteWordList.add(new ReciteWord("가다", "go", "학교에 갑니다"));


        Application.speak(reciteWordList);
        //Application.recite(reciteWordList);
    }



}
