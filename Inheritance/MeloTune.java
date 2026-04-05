class Content {
    String title;
    int duration;
    String artistName;

    Content(String title, int duration, String artistName){
        this.title=title;
        this.duration=duration;
        this.artistName=artistName;
    }
    void play(){
        System.out.println(title+ "is playing now.");
    }
    void display(){
        System.out.println("Title :" +title);
        System.out.println("Duration (in minutes) :" +duration+"mins");
        System.out.println("Artist Name :" +artistName);
    }
    
}
class  Songs extends Content{
    String genre;

    Songs(String title, int duration ,String artistName, String genre){
        super(title, duration, artistName);
        this.genre = genre;

    }
    void display(){
        super.display();
        System.out.println("Genre :" +genre);
    }
}
class Podcasts extends Content {
    int epno;
    Podcasts(String title,int duration , String artistName, int epno){
        super(title, duration, artistName);
        this.epno=epno;
    }
    void display(){
        super.display();
        System.out.println("Episode number :" +epno);
    }
}
class Audiobooks extends Content {
    int chapter;
    Audiobooks(String title,int duration , String artistName , int chapter){
        super(title, duration, artistName);
        this.chapter=chapter;
    }
    void display(){
        super.display();
        System.out.println("Chapter count :" +chapter);
    }
}

public class MeloTune {
    public static void main(String[] args) {
        Content c1=new Songs("Abc", 2, "Liza","love");
        Content c2=new Podcasts("Abc", 2, "Diya", 2);
        Content c3=new Audiobooks("jungle", 5, "om", 2);
    c1.display();
    c1.play();
    System.out.println("------------");
    c2.display();
    c2.play();
    System.out.println("-------------");
    c3.display();
    c3.play();
    System.out.println("--------------------");
    }
    
}
