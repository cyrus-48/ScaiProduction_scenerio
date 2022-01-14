package cCS210;

public class DriverMoviePlayer {
   
        public static void main(String[] args) { 
            //first instance of the class 
            Screen screen=new Screen("800x1200", 30, 40);
            MoviePlayer mp=new MoviePlayer("Bang olufsen", screen, MonitorType.LCD);
            System.out.println(mp.toString());
            
    
            //second  instance  of the class 
            Screen screen2=new Screen("700x1000", 34, 46);
            MoviePlayer mp2=new MoviePlayer("clubbox ", screen2, MonitorType.LED);
            System.out.println(mp2.toString());
            
       }
            
    }
    

