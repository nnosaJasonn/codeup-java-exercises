package movies;
import java.util.Arrays;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        int choice = 7;
        while (choice != 0) {
            choice = input.getInt("\n\nWhat would you like to do? \n 0 - exit \n 1 - view all movies \n 2 - view movies in the animated category \n 3 - view movies in the horror category \n 4 - view movies in the horror category \n 5 - view movies in the scifi category \n 6 - view movies in the musical category \n 7 - add a movie \nEnter your choice:");
            choose(choice);
        }


    }


    public static void choose(int choice){
        Input input = new Input();
        switch (choice){
            case 0:
                System.exit(0);
            case 1:
                allMovies();
                break;
            case 2:
                movieList("animated");
                break;
            case 3:
                movieList("drama");
                break;
            case 4:
                movieList("horror");
                break;
            case 5:
                movieList("scifi");
                break;
            case 6:
                movieList("musical");
                break;
            case 7:
                addMovie();
                break;
            default:
                choice = input.getInt(choice + " is not valid\n\nWhat would you like to do? \n 0 - exit \n 1 - view all movies \n 2 - view movies in the animated category \n 3 - view movies in the horror category \n 4 - view movies in the horror category \n 5 - view movies in the scifi category \n 6 - view movies in the musical category \n 7 - add a movie \nEnter your choice:");
                choose(choice);

        }
    }

    public static Movie[] movies = MoviesArray.findAll();

    private static void allMovies(){
        for (int i = 0; i < movies.length; i++){
            System.out.println(movies[i].getMovie());
        }
    }

    private static void movieList(String cat){
        for (int i = 0; i< movies.length; i++){
            if (movies[i].getMovieCategory().equals(cat)){
                System.out.println(movies[i].getMovie());
            }
        }
    }
    private static Movie addMovie(){
        Input in = new Input();
        String title = in.getString("enter the movie title");
        String cat = in.getString("enter the movie category");
        Movie newMovie = new Movie(title, cat);
        System.out.println(newMovie.getMovie());
        return newMovie;
    }

}
