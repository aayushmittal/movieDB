package com.kainthabhishek.moviedb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MovieListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        Intent i = getIntent();
        String urlString = i.getStringExtra("url_string");

        Bundle b = new Bundle();
        b.putString("url_string",urlString);

        MovieListFragment movieListFragment = new MovieListFragment();
        movieListFragment.setArguments(b);
        getFragmentManager().beginTransaction().replace(R.id.movie_list_frame,movieListFragment);

    }
}
