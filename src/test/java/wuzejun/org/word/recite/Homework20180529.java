package wuzejun.org.word.recite;

import wuzejun.org.word.recite.start.Application;
import wuzejun.org.word.recite.word.ReciteWord;

import java.util.ArrayList;
import java.util.List;

public class Homework20180529 {
    public static void main(String[] args) {
        List<ReciteWord> reciteWordList = new ArrayList<>();
        reciteWordList.add(new ReciteWord("한국어", "korean", "한국어를공부합니다"));
        reciteWordList.add(new ReciteWord("선생님", "teacher", "한국어 선생님은 한국어를 가르칩니다"));
        reciteWordList.add(new ReciteWord("학생", "student", "학생이 공부합니다"));
        reciteWordList.add(new ReciteWord("학교", "school", "학생이 학교에 갑니다"));
        reciteWordList.add(new ReciteWord("수업시간", "class time", "한국어 수업시간 입니다"));
        reciteWordList.add(new ReciteWord("이야기하다", "talk", "학교에서 한국어를 이야기하니다"));
        reciteWordList.add(new ReciteWord("지키다", "protect", "수업 시간을 지키세요"));
        reciteWordList.add(new ReciteWord("숙제", "homework", "숙제를 해 오세요"));


        Application.speak(reciteWordList);
        //Application.recite(reciteWordList);
    }



}
