package wuzejun.org.word.recite;

import org.junit.Test;
import wuzejun.org.word.recite.start.Application;
import wuzejun.org.word.recite.word.ReciteWord;

import java.util.ArrayList;
import java.util.List;

public class Homework20180626 {

    public static void main(String[] args) {
        // 월
        //List<ReciteWord> reciteWordList = new ArrayList<>();
        //reciteWordList.add(new ReciteWord("일월", "January"));
        //reciteWordList.add(new ReciteWord("이월", "February"));
        //reciteWordList.add(new ReciteWord("삼월", "March"));
        //reciteWordList.add(new ReciteWord("사월", "April"));
        //reciteWordList.add(new ReciteWord("오월", "May"));
        //reciteWordList.add(new ReciteWord("유월", "June"));
        //reciteWordList.add(new ReciteWord("칠월", "July"));
        //reciteWordList.add(new ReciteWord("팔월", "August"));
        //reciteWordList.add(new ReciteWord("구월", "September"));
        //reciteWordList.add(new ReciteWord("시월", "October"));
        //reciteWordList.add(new ReciteWord("십일월", "November"));
        //reciteWordList.add(new ReciteWord("십이월", "December"));
        //Application.recite(reciteWordList);


        // 요일
        List<ReciteWord> reciteWordList = new ArrayList<>();
        reciteWordList.add(new ReciteWord("일요일", "SUN"));
        reciteWordList.add(new ReciteWord("월요일", "MON"));
        reciteWordList.add(new ReciteWord("화요일", "TUE"));
        reciteWordList.add(new ReciteWord("수요일", "WED"));
        reciteWordList.add(new ReciteWord("목요일", "THU"));
        reciteWordList.add(new ReciteWord("굼요일", "FRI"));
        reciteWordList.add(new ReciteWord("토요일", "SAT"));
        Application.recite(reciteWordList);

        // 날짜
    }







}
