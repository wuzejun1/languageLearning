package wuzejun.org.word.recite.word;

import java.util.List;

public class ReciteWord {

    private String word;

    private String translationEnglish;

    private List<String> sentenceExample;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslationEnglish() {
        return translationEnglish;
    }

    public void setTranslationEnglish(String translationEnglish) {
        this.translationEnglish = translationEnglish;
    }

    public List<String> getSentenceExample() {
        return sentenceExample;
    }

    public void setSentenceExample(List<String> sentenceExample) {
        this.sentenceExample = sentenceExample;
    }
}
