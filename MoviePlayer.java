package cCS210;

 
    public class MoviePlayer extends Product implements MultimediaControl{

        Screen screen;
        MonitorType monitorType;
         
        public MoviePlayer(String name, Screen screen, MonitorType monitorType){
        
            super(name);
            this.screen = screen;
            this.monitorType = monitorType;
        }
        @Override
        //implementing the methods from MultimediaControl interface
        public void play(){
        System.out.println("Playing");
        }
        @Override
        public void stop(){
        
         System.out.println("Stopping");
        }
        @Override
        public void previous(){
        
         System.out.println("Previous");
        }
        @Override
        public void next(){
        
        System.out.println("Next");
        }
        @Override
        //toString method to print on the screen the values in methods
        public String toString()
        {
        return super.toString() + screen.toString() + "Monitor Type : " + monitorType.toString();
        }
    
}
