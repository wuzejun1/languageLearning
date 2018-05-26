package wuzejun.org.word.recite.audio;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class KoreanSpeaker {


    private static String outputFormat = AudioOutputFormat.Riff24Khz16BitMonoPcm;
    private static String deviceLanguage = "ko-KR";
    private static String genderName = "Female";
    private static String voiceName = "Microsoft Server Speech Text to Speech Voice (ko-KR, HeamiRUS)";
    private static String AUDIO_DIRECTORY = "/korean/audio";
    
    
     private static void saveAudio(String word) throws Exception {
         byte[] audioBuffer = TTSService.Synthesize(word, outputFormat, deviceLanguage, genderName, voiceName);

         // write the pcm data to the file
         String outputWave = getAudioFileUrl(word);
         File outputAudio = new File(outputWave);
         FileOutputStream fstream = new FileOutputStream(outputAudio);
         fstream.write(audioBuffer);
         fstream.flush();
         fstream.close();
         Files.copy(outputAudio.toPath(), (new File(getAudioSourceFileUrl(word))).toPath());
     }

    private static String getAudioFileUrl(String word) {
        return KoreanSpeaker.class.getResource("/").getPath() + "../classes" + AUDIO_DIRECTORY + "/" + word + ".pcm";
    }

    private static String getAudioSourceFileUrl(String word) {
        return KoreanSpeaker.class.getResource("/").getPath() + "../../src/main/resources" + AUDIO_DIRECTORY + "/" + word + ".pcm";
    }

    private static boolean hasAudioAlready(String word) {
        String outputWave = getAudioFileUrl(word);
        File outputAudio = new File(outputWave);
        if(outputAudio.exists()) {
            return true;
        } else {
            return false;
        }

     }

     public static void speak(String word) throws Exception {
         if (!hasAudioAlready(word)) {
             saveAudio(word);
         }
         String outputWave = getAudioFileUrl(word);

         // specify the audio format
         AudioFormat audioFormat = new AudioFormat(
             AudioFormat.Encoding.PCM_SIGNED,
             24000,
             16,
             1,
             1 * 2,
             24000,
             false);

         AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(outputWave));

         DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class,
             audioFormat, AudioSystem.NOT_SPECIFIED);
         SourceDataLine sourceDataLine = (SourceDataLine) AudioSystem
             .getLine(dataLineInfo);
         sourceDataLine.open(audioFormat);
         sourceDataLine.start();
         /*
          * read the audio data and send to mixer
          */
         int count;
         byte tempBuffer[] = new byte[4096];
         while ((count = audioInputStream.read(tempBuffer, 0, tempBuffer.length)) >0) {
             sourceDataLine.write(tempBuffer, 0, count);
         }

         sourceDataLine.drain();
         sourceDataLine.close();
         audioInputStream.close();
     }

}
