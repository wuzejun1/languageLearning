package wuzejun.org.word.recite;

import wuzejun.org.word.recite.start.Application;
import wuzejun.org.word.recite.word.ReciteWord;

import java.util.ArrayList;
import java.util.List;

public class Homework20180605 {
    public static void main(String[] args) {
        List<ReciteWord> reciteWordList = new ArrayList<>();
        reciteWordList.add(new ReciteWord("자기소개", "self-introduction", "자기소개를 하겠습니다"));
        reciteWordList.add(new ReciteWord("인사", "Greetings", "한국어 인사는 안녕하세요 입니다"));
        reciteWordList.add(new ReciteWord("이름", "name", "제 이름은 링링입니다"));
        reciteWordList.add(new ReciteWord("고향", "Hometown", "제 고향은 상하이입니다"));
        reciteWordList.add(new ReciteWord("취미", "hobby", "제 취미는 축구입니다"));
        reciteWordList.add(new ReciteWord("음악", "music", "저는 음악을 듣습니다"));
        reciteWordList.add(new ReciteWord("좋아하다", "like", "저는 한국어를 좋아합니다"));
        reciteWordList.add(new ReciteWord("박수", "clap", "모두 링링에게 박수"));


        //Application.speak(reciteWordList);
        Application.recite(reciteWordList);
    }



}
