package wuzejun.org.word.recite.word;

import java.util.ArrayList;
import java.util.List;

public class ReciteWord {

    private String word;

    private String translationEnglish;

    private List<String> sentenceExamples;

    public ReciteWord(String word, String translationEnglish, String... sentenceExamples) {
        this.word = word;
        this.translationEnglish = translationEnglish;
        this.sentenceExamples = new ArrayList<>();
        for (String sentence : sentenceExamples) {
            this.sentenceExamples.add(sentence);
        }
    }

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

    public List<String> getSentenceExamples() {
        return sentenceExamples;
    }

    public void setSentenceExamples(List<String> sentenceExamples) {
        this.sentenceExamples = sentenceExamples;
    }
}
