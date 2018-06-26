package wuzejun.org.word.recite;

import wuzejun.org.word.recite.start.Application;
import wuzejun.org.word.recite.word.ReciteWord;

import java.util.ArrayList;
import java.util.List;

public class Homework20180621 {
    public static void main(String[] args) {
        List<ReciteWord> reciteWordList = new ArrayList<>();
        // hour
        reciteWordList.add(new ReciteWord("한시", "1 hour"));
        reciteWordList.add(new ReciteWord("두시", "2 hour"));
        reciteWordList.add(new ReciteWord("세시", "3 hour"));
        reciteWordList.add(new ReciteWord("네시", "4 hour"));
        reciteWordList.add(new ReciteWord("다섯시", "5 hour"));
        reciteWordList.add(new ReciteWord("여섯시", "6 hour"));
        reciteWordList.add(new ReciteWord("일곱시", "7 hour"));
        reciteWordList.add(new ReciteWord("여덟시", "8 hour"));
        reciteWordList.add(new ReciteWord("아홉시", "9 hour"));
        reciteWordList.add(new ReciteWord("열시", "10 hour"));
        reciteWordList.add(new ReciteWord("열한시", "11 hour"));
        reciteWordList.add(new ReciteWord("열두시", "12 hour"));
        Application.recite(reciteWordList);

        // minute
        //reciteWordList.clear();
        //reciteWordList.add(new ReciteWord("일분", "1 minute"));
        //reciteWordList.add(new ReciteWord("이분", "2 minute"));
        //reciteWordList.add(new ReciteWord("삼분", "3 minute"));
        //reciteWordList.add(new ReciteWord("사분", "4 minute"));
        //reciteWordList.add(new ReciteWord("오분", "5 minute"));
        //reciteWordList.add(new ReciteWord("육분", "6 minute"));
        //reciteWordList.add(new ReciteWord("칠분", "7 minute"));
        //reciteWordList.add(new ReciteWord("팔분", "8 minute"));
        //reciteWordList.add(new ReciteWord("구분", "9 minute"));
        //reciteWordList.add(new ReciteWord("십분", "10 minute"));
        //reciteWordList.add(new ReciteWord("이십분", "20 minute"));
        //reciteWordList.add(new ReciteWord("삼십분", "30 minute"));
        //reciteWordList.add(new ReciteWord("사십분", "40 minute"));
        //reciteWordList.add(new ReciteWord("오십분", "50 minute"));
        //Application.recite(reciteWordList);
    }



}
