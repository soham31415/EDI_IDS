public class Video {

    String title, length, available;
    public Video(String title, String length, String available){
        this.available = available;
        this.length = length;
        this.title = title;
    }

    public void show(){
        System.out.println("The tile of the video is: " + title + ", the length of the video is: " + length + "and the availability of the video is: " + available);
    }
}

class Movie extends Video{

    double dRating;

    public Movie(double dRating, String title, String length, String available){
        super(title, length, available);
        this.dRating = dRating;
    }

    public void show(){
        System.out.println("The tile of the movie is: " + title + ", the length of the movie is: " + length + "and the availability of the movie is: " + available + ". The director rating of movie is: "+ dRating);

    }

}

class MusicVideo extends Video{

    String aCat;

    public MusicVideo(String aCat, String title, String length, String available){
        super(title, length, available);
        this.aCat = aCat;
    }

    public void show(){
        System.out.println("The tile of the music video is: " + title + ", the length of the music video is: " + length + "and the availability of the music video is: " + available + ". The artist category of music video is: "+ aCat);

    }

}

class VideoTester{
    public static void main(String[] args) {
        Video objM = new Movie(4.5, "Fight Club", "2.5 hours", "available");
        Video objMV = new MusicVideo("hip hop", "humble", "4.25mins", "not available");

        objM.show();
        objMV.show();
    }
}