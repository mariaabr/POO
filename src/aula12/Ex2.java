package aula12;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex2 {
    public static void main(String[] args) throws IOException{
        
        List<String> lines = Files.readAllLines(Paths.get("movies.txt"));
        Set<Movie> movies = new TreeSet<>();
        HashSet<String> genres = new HashSet<>();

        for (int i = 1; i < lines.size(); i++) {
            String[] info = lines.get(i).split("[\t]");
            movies.add(new Movie(info[0], Double.parseDouble(info[1]), info[2], info[3], Integer.parseInt(info[4])));
            genres.add(info[3]);
        }
        System.out.println("----------MOVIES-----------");
        printMovies(movies);

        ArrayList <Movie> listmovies = new ArrayList <>(movies);
        System.out.println("---------MOVIES BY SCORE-----------");
        listmovies.sort((a, b)-> Double.compare(b.getScore(), a.getScore()));
        printMovies(listmovies);

        System.out.println("---------MOVIES BY RUNNING TIME---------");
        listmovies.sort((a, b)-> Integer.compare(a.getTime(), b.getTime()));
        printMovies(listmovies);

        System.out.println("Géneros de filmes: " + genres);

        PrintWriter write = new PrintWriter(new File("myselection.txt"));
        write.printf("%-35s\t%4.1s\t%-5s\t%-10s\t%3s \n", "Name", "Score", "Rating", "Genre", "Running Time");
        for ( Movie movie : movies) {
            if(movie.getScore() > 60.0 && movie.getGenre().equals("comedy")) {
                write.println(movie);
            }
        }
        write.close();
    }

    private static void printMovies(Set<Movie> movies){
        for ( Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private static void printMovies(ArrayList<Movie> listmovies){
        for ( Movie movie : listmovies) {
            System.out.println(movie);
        }
    }
}