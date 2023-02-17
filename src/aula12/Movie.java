package aula12;

public class Movie implements Comparable<Movie>{
    private String name;
    private double score;
    private String rating;
    private String genre;
    private int time;

    public Movie(String name, double score, String rating, String genre, int time) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.time = time;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int compareTo(Movie movie) {
        return this.getName().compareToIgnoreCase(movie.getName());
    }

    @Override
    public String toString() {
        return String.format("%-35s\t%4.1f\t%-5s\t%-10s\t%3d", name, score, rating, genre, time);
    }
    
}
