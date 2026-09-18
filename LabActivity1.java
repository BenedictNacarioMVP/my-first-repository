public class LabActivity1 {
    public static void main(String[] args) {
 
        Movie movie1 = new Movie();
        movie1.title = "Wonderful nightmare ";
        movie1.genre = "Commedy,Romance";
        movie1.duration = 125;
 
        Movie movie2 = new Movie();
        movie2.title = "The Exorcism of God";
        movie2.genre = "Horror,Drama, Crime Fiction";
        movie2.duration = 98;
 
        Movie movie3 = new Movie();
        movie3.title = "Need for Speed";
        movie3.genre = "Action,Drama,Crime film";
        movie3.duration = 132;
 
        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}