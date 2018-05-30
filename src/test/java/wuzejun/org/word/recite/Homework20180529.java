package wuzejun.org.word.recite;

import wuzejun.org.word.recite.start.Application;
import wuzejun.org.word.recite.word.ReciteWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework20180529 {
    public static void main(String[] args) {
        List<ReciteWord> reciteWordList = new ArrayList<>();
        reciteWordList.add(new ReciteWord("한국어", "korean", "한국어를공부합니다"));
        reciteWordList.add(new ReciteWord("선생님", "teacher", ""));
        reciteWordList.add(new ReciteWord("학생", "student", ""));
        reciteWordList.add(new ReciteWord("학교", "school", ""));
        reciteWordList.add(new ReciteWord("수업시간", "class time", ""));
        reciteWordList.add(new ReciteWord("이야기하다", "talk", ""));
        reciteWordList.add(new ReciteWord("지키다", "protect", ""));
        reciteWordList.add(new ReciteWord("숙제", "homework", ""));
        Application.recite(reciteWordList);
    }
}
