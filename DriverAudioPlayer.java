package cCS210;

public class DriverAudioPlayer {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer("Bang olufsen", "HD");
        AudioPlayer audioPlayer1 = new AudioPlayer("club box", "gh");
        audioPlayer.toString(); // call a toString method from AudioPlayer class 
        audioPlayer1.toString();
        System.out.println(audioPlayer1.toString());
        System.out.println(audioPlayer.toString());
        audioPlayer.play();
        audioPlayer.next();
        audioPlayer.stop();
        audioPlayer.previous();    
     }     
   
    
}
