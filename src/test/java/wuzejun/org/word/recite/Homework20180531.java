package wuzejun.org.word.recite;

import wuzejun.org.word.recite.start.Application;
import wuzejun.org.word.recite.word.ReciteWord;

import java.util.ArrayList;
import java.util.List;

public class Homework20180531 {
    public static void main(String[] args) {
        List<ReciteWord> reciteWordList = new ArrayList<>();
        reciteWordList.add(new ReciteWord("선생님 이야기를 잘 들으세요", "1"));
        reciteWordList.add(new ReciteWord("첫째 수업 시간을 잘 지키세요", "2"));
        reciteWordList.add(new ReciteWord("둘째 한국어로 이야기하세요", "3"));
        reciteWordList.add(new ReciteWord("셋째 숙제를 해 오세요 알겠습니까", "4"));
        reciteWordList.add(new ReciteWord("네 알겠습니다", "5"));


        //Application.speak(reciteWordList);
        Application.recite(reciteWordList);
    }



}
