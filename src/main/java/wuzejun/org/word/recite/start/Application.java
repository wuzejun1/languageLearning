package wuzejun.org.word.recite.start;

import com.sun.tools.javac.util.Pair;
import wuzejun.org.word.recite.audio.KoreanSpeaker;
import wuzejun.org.word.recite.word.ReciteWord;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {


    public static void recitePair(List<Pair<String, String>> words) {
        Random random = new Random();
        DecimalFormat   fnum  =   new DecimalFormat("##0.00");

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int hit = 0;
        while (!words.isEmpty()) {
            int pos = random.nextInt(words.size());
            final Pair<String, String> word = words.remove(pos);
            System.out.println(word.fst);
            new Thread(new Runnable() {
                public void run() {
                    try {
                        KoreanSpeaker.speak(word.snd);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            String answer = sc.nextLine().trim().replace(" ","");
            if (answer.equalsIgnoreCase(word.snd)) {
                hit++;
                System.out.println("right!!!");
            } else {
                words.add(word);
                System.out.println("wrong!!! answer is:" + word.snd);
            }
            count++;
            System.out.println("hit rate:" + fnum.format((float) 100 * hit/count) + "%");
        }

        System.out.println("finished:" + hit + "/" + count);
    }

    public static void speak(final List<ReciteWord> words) {
        for (int i =0 ; i < words.size(); i++) {
            System.out.println((i + 1) + ":" + words.get(i));
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine().trim().replace(" ","");
            final int index = Integer.valueOf(line);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        ReciteWord word = words.get(index -1);
                        KoreanSpeaker.speak(word.getWord());
                        if (word.getSentenceExamples() != null) {
                            for (String sentence : word.getSentenceExamples()) {
                                KoreanSpeaker.speak(sentence);
                            }
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }
    }

    public static void recite(List<ReciteWord> words) {
        Random random = new Random();
        DecimalFormat   fnum  =   new DecimalFormat("##0.00");

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int hit = 0;
        while (!words.isEmpty()) {
            int pos = random.nextInt(words.size());
            final ReciteWord word = words.remove(pos);
            System.out.println(word.getTranslationEnglish());
            new Thread(new Runnable() {
                public void run() {
                    try {
                        KoreanSpeaker.speak(word.getWord());
                        if (word.getSentenceExamples() != null) {
                          for (String sentence : word.getSentenceExamples()) {
                              KoreanSpeaker.speak(sentence);
                          }
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            String answer = sc.nextLine().trim().replace(" ","");
            if (answer.equalsIgnoreCase(word.getWord().trim().replace(" ",""))) {
                hit++;
                System.out.println("right!!!");
            } else {
                words.add(word);
                System.out.println("wrong!!! answer is:" + word.getWord());
            }
            count++;
            System.out.println("hit rate:" + fnum.format((float) 100 * hit/count) + "%");
        }

        System.out.println("finished:" + hit + "/" + count);
    }
}
