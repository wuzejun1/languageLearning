package wuzejun.org.word.recite;

import wuzejun.org.word.recite.start.Application;
import wuzejun.org.word.recite.word.ReciteWord;

import java.util.ArrayList;
import java.util.List;

public class Homework20180619 {
    public static void main(String[] args) {
        List<ReciteWord> reciteWordList = new ArrayList<>();
        reciteWordList.add(new ReciteWord("몇", "a few", "지금은 몇 시입니까?"));
        reciteWordList.add(new ReciteWord("아침", "morning", "아침에 운동을 합니다."));
        reciteWordList.add(new ReciteWord("점심", "afternoon", "점심에 식당에서 밥을 먹습니다."));
        reciteWordList.add(new ReciteWord("저녁", "Evening", "저녁에 집에 갑니다."));
        reciteWordList.add(new ReciteWord("밤", "night", "저는 밤 12시에 잡니다."));
        reciteWordList.add(new ReciteWord("일어나다", "get up", "저는 아침에 일찍 일어납니다."));
        reciteWordList.add(new ReciteWord("자다", "sleep", "저는 밤에 늦게 잡니다."));
        reciteWordList.add(new ReciteWord("돌아오다", "come back", "언제 집에 돌아옵니까?"));
        reciteWordList.add(new ReciteWord("보통", "general", "보통 아침에 빵을 먹습니다."));
        reciteWordList.add(new ReciteWord("쯤", "around (when)", "1시쯤 만납니다."));


        //Application.speak(reciteWordList);
        Application.recite(reciteWordList);
    }



}
