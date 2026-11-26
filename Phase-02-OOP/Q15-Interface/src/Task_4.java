public class Task_4 {
    interface Camera {void takePhoto();}
    interface MusicPlayer {void playMusic();}
    interface Smartphone extends Camera, MusicPlayer {void makeCall();}

    static class AndroidPhone implements Smartphone {

        @Override
        public void takePhoto(){
            System.out.println("Taking Photo...");
        }

        @Override
        public void makeCall() {
            System.out.println("Making Phone Call...");
        }

        @Override
        public void playMusic() {
            System.out.println("Playing  Music...");
        }
    }

    public static void main (String[] args){
        AndroidPhone a = new AndroidPhone();

        a.takePhoto();
        a.playMusic();
        a.makeCall();
    }
}
