package com.brettadamson.moviedecider.dao;

public class MovieDao {
    private String title;
    private String overview;
    private  String tagline;
    private String poster_path;
    private int runtime;
    private int id;
    private  String imdb_id;
    private  String release_date;


    public MovieDao(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "MovieDao{" +
                "title='" + title + '\'' +
                ", overview='" + overview + '\'' +
                ", tagline='" + tagline + '\'' +
                ", poster_path='" + poster_path + '\'' +
                ", runtime=" + runtime +
                ", id=" + id +
                ", imdb_id=" + imdb_id +
                ", release_date='" + release_date + '\'' +
                '}';
    }
}
