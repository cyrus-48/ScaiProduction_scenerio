package cCS210;
public class DriverScaiProduction{
    public static  void main(String[] args){
        //create an instance of audioPlayer class a
        AudioPlayer ap = new AudioPlayer("R100","HD");
        System.out.println(ap.toString());
        ap.play();
        ap.stop();
        ap.previous();
        ap.next();
        // create an instance of the movie player class a
        // create the instance of the screen class to create the object to be used to invoke the constructorof the screen class
        Screen screen=new Screen("800x1200", 30, 40);
        MoviePlayer mpl = new MoviePlayer("Thinkvision",screen,MonitorType.LED);
        System.out.println(mpl.toString());
        mpl.play();
        mpl.stop();
        mpl.previous();
        mpl.next();
        

    }
}