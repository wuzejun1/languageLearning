package wuzejun.org.word.recite;

import wuzejun.org.word.recite.start.Application;
import wuzejun.org.word.recite.word.ReciteWord;

import java.util.ArrayList;
import java.util.List;

public class Homework20180710 {

    public static void main(String[] args) {

        // 요일
        List<ReciteWord> reciteWordList = new ArrayList<>();
        reciteWordList.add(new ReciteWord("날씨", "weather", "오늘은 날씨가 맑습니다"));
        reciteWordList.add(new ReciteWord("계절", "season", "한국은 봄, 여름, 가을, 겨울의 4계걸이 있습니다"));
        reciteWordList.add(new ReciteWord("봄", "spring", "저는 봄을 좋아합니다"));
        reciteWordList.add(new ReciteWord("겨울", "winter", "겨울에 눈이 많이 와서 좋습니다"));
        reciteWordList.add(new ReciteWord("따뜻하다", "warm", "봄은 따뜻합니다."));
        reciteWordList.add(new ReciteWord("춥다", "cold", "고향의 겨울은 너무 춥습니다."));
        reciteWordList.add(new ReciteWord("바람", "wind", "오늘을 바람이 많이 붑니다."));
        Application.recite(reciteWordList);

        // 날짜
    }







}
