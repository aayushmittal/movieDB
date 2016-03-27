package com.kainthabhishek.moviedb;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by aayush on 27/3/16.
 */
public class Movie implements Serializable {




/**
 * Created by abhishek on 27/3/16.
 */


    String title;

    int id;

    String status;

    @SerializedName("vote_average")
    String voteAverage;


    @SerializedName("release_name")
    String releaseDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
