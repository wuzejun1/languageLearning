package wuzejun.org.word.recite.start;

import com.sun.tools.javac.util.Pair;
import wuzejun.org.word.recite.audio.KoreanSpeaker;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // init words
        List<Pair<String, String>> words = new ArrayList<Pair<String, String>>();

        // page1
        words.add(new Pair<String, String>("five","오"));
        words.add(new Pair<String, String>("tooth","이"));
        words.add(new Pair<String, String>("younger sibling","아우"));
        words.add(new Pair<String, String>("kid","아이"));
        words.add(new Pair<String, String>("cucumber","오이"));
        // page2
        words.add(new Pair<String, String>("pig","돼지"));
        words.add(new Pair<String, String>("why","왜"));
        words.add(new Pair<String, String>("waiter","웨이터"));
        words.add(new Pair<String, String>("sweater","스웨터"));
        words.add(new Pair<String, String>("beef","쇠고기"));
        words.add(new Pair<String, String>("to memorize","외우다"));
        words.add(new Pair<String, String>("company","회사"));
        words.add(new Pair<String, String>("brain","두뇌"));
        words.add(new Pair<String, String>("ear","귀"));
        words.add(new Pair<String, String>("to rest","쉬다"));
        words.add(new Pair<String, String>("mouse","쥐"));
        words.add(new Pair<String, String>("scissors","가위"));
        words.add(new Pair<String, String>("doctor","의사"));
        words.add(new Pair<String, String>("chair","의자"));
        words.add(new Pair<String, String>("Yeoui Island","여의도"));
        words.add(new Pair<String, String>("meeting","회의"));
        // page3
        words.add(new Pair<String, String>("watermelon","수박"));
        words.add(new Pair<String, String>("book","책"));
        words.add(new Pair<String, String>("kitchen","부엌"));
        words.add(new Pair<String, String>("outside","밖"));
        words.add(new Pair<String, String>("money","돈"));
        words.add(new Pair<String, String>("lemon","레몬"));
        words.add(new Pair<String, String>("newspaper","신문"));
        words.add(new Pair<String, String>("umbrella","우산"));
        words.add(new Pair<String, String>("soon","곧"));
        words.add(new Pair<String, String>("bottom","밑"));
        words.add(new Pair<String, String>("comb","빗"));
        words.add(new Pair<String, String>("clothes","옷"));
        words.add(new Pair<String, String>("daytime","낮"));
        words.add(new Pair<String, String>("flower","꽃"));
        words.add(new Pair<String, String>("light","빛"));
        words.add(new Pair<String, String>("ㅎ","히읗"));
        // page4
        words.add(new Pair<String, String>("magpie","까치"));
        words.add(new Pair<String, String>("tail","꼬리"));
        words.add(new Pair<String, String>("elephant","코끼리"));
        words.add(new Pair<String, String>("to pick","따다"));
        words.add(new Pair<String, String>("float","뜨다"));
        words.add(new Pair<String, String>("hairband","머리띠"));
        words.add(new Pair<String, String>("root","뿌리"));
        words.add(new Pair<String, String>("bone","뼈"));
        words.add(new Pair<String, String>("dad","아빠"));
        words.add(new Pair<String, String>("to be cheap","싸다"));
        words.add(new Pair<String, String>("write","쓰다"));
        words.add(new Pair<String, String>("middle-aged man","아저씨"));
        words.add(new Pair<String, String>("to be salty","짜다"));
        words.add(new Pair<String, String>("to steam","찌다"));
        words.add(new Pair<String, String>("fake","가짜"));
        // page5
        words.add(new Pair<String, String>("singer","가수"));
        words.add(new Pair<String, String>("meat","고기"));
        words.add(new Pair<String, String>("shoes","구두"));
        words.add(new Pair<String, String>("country","나라"));
        words.add(new Pair<String, String>("tree","나무"));
        words.add(new Pair<String, String>("legs","다리"));
        words.add(new Pair<String, String>("radio","라디오"));
        words.add(new Pair<String, String>("head","머리"));
        words.add(new Pair<String, String>("banana","바나나"));
        words.add(new Pair<String, String>("pants","바지"));
        words.add(new Pair<String, String>("cow","소"));
        words.add(new Pair<String, String>("baby","아기"));
        words.add(new Pair<String, String>("mother","어머니"));
        words.add(new Pair<String, String>("map","지도"));
        words.add(new Pair<String, String>("hat","모자"));
        words.add(new Pair<String, String>("father","아버지"));
        words.add(new Pair<String, String>("waist","허리"));
        words.add(new Pair<String, String>("underground","지하"));
        // page6
        words.add(new Pair<String, String>("card","카드"));
        words.add(new Pair<String, String>("nose","코"));
        words.add(new Pair<String, String>("height","키"));
        words.add(new Pair<String, String>("ostrich","타조"));
        words.add(new Pair<String, String>("tomato","토마토"));
        words.add(new Pair<String, String>("bullfighter","투우사"));
        words.add(new Pair<String, String>("fly","파리"));
        words.add(new Pair<String, String>("grape","포도"));
        words.add(new Pair<String, String>("stamp","우표"));
        words.add(new Pair<String, String>("tea","차"));
        words.add(new Pair<String, String>("skirt","치마"));
        words.add(new Pair<String, String>("pepper","고추"));
        words.add(new Pair<String, String>("coffee","커피"));
        words.add(new Pair<String, String>("coat","코트"));
        words.add(new Pair<String, String>("train ticket","기차표"));
        // page7
        words.add(new Pair<String, String>("strawberry","딸기"));
        words.add(new Pair<String, String>("water","물"));
        words.add(new Pair<String, String>("foot","발"));
        words.add(new Pair<String, String>("pencil","연필"));
        words.add(new Pair<String, String>("bear","곰"));
        words.add(new Pair<String, String>("man","남자"));
        words.add(new Pair<String, String>("mom","엄마"));
        words.add(new Pair<String, String>("computer","컴퓨터"));
        words.add(new Pair<String, String>("steamed rice","밥"));
        words.add(new Pair<String, String>("mouth","입"));
        words.add(new Pair<String, String>("knee","무릎"));
        words.add(new Pair<String, String>("forest","슾"));
        words.add(new Pair<String, String>("bag","가방"));
        words.add(new Pair<String, String>("ball","공"));
        words.add(new Pair<String, String>("refrigerator","냉장고"));
        words.add(new Pair<String, String>("window","창문"));
        // page8
        words.add(new Pair<String, String>("ant","개미"));
        words.add(new Pair<String, String>("ship","배"));
        words.add(new Pair<String, String>("bird","새"));
        words.add(new Pair<String, String>("sun","해"));
        words.add(new Pair<String, String>("crab","게"));
        words.add(new Pair<String, String>("washing one's face","세수"));
        words.add(new Pair<String, String>("swing","그네"));
        words.add(new Pair<String, String>("camera","카메라"));
        words.add(new Pair<String, String>("talk","얘기"));
        words.add(new Pair<String, String>("to be pretty","예쁘다"));
        words.add(new Pair<String, String>("calligraphy","서예"));
        words.add(new Pair<String, String>("clock","시계"));
        words.add(new Pair<String, String>("snack food","과자"));
        words.add(new Pair<String, String>("dress shirt","와이셔츠"));
        words.add(new Pair<String, String>("painter","화가"));
        words.add(new Pair<String, String>("apple","사과"));
        words.add(new Pair<String, String>("what","뭐"));
        words.add(new Pair<String, String>("to give","줘요"));
        words.add(new Pair<String, String>("to be hot","더워요"));
        words.add(new Pair<String, String>("to be cold","추워요"));
        // page9
        words.add(new Pair<String, String>("baseball","야구"));
        words.add(new Pair<String, String>("palm tree","야자수"));
        words.add(new Pair<String, String>("talk","이야기"));
        words.add(new Pair<String, String>("women","여자"));
        words.add(new Pair<String, String>("rice","벼"));
        words.add(new Pair<String, String>("tongue","혀"));
        words.add(new Pair<String, String>("yoga","요가"));
        words.add(new Pair<String, String>("cooking","요리"));
        words.add(new Pair<String, String>("professor","교수"));
        words.add(new Pair<String, String>("glass","유리"));
        words.add(new Pair<String, String>("toilet paper","휴지"));
        words.add(new Pair<String, String>("milk","우유"));

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

        System.out.println("finished");



    }
}
