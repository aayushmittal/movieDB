package com.kainthabhishek.moviedb;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SelectorFragment.SelectorFragmentClick, MovieListFragment.MovieListFragmentInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public void onItemClick(String url) {
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.resultScreen);
        if(frameLayout != null){
            MovieListFragment movieListFragment = new MovieListFragment();
            Bundle UrlBundle = new Bundle();
            UrlBundle.putString("url_string", url);
            movieListFragment.setArguments(UrlBundle);
            getFragmentManager().beginTransaction().replace(R.id.resultScreen,movieListFragment).commit();


        }
        else{
            //portrait
            Intent i = new Intent();
            i.putExtra("url_string",url);
            i.setClass(this,MovieListActivity.class);
            startActivity(i);
        }
    }

    @Override
    public void movieListItemClicked(Movie movie,ArrayList<Movie> movieList) {
        Intent i = new Intent();
        i.putExtra("movie_list",movieList);
        i.putExtra("movie_object",movie);
        i.setClass(this,MovieListActivity.class);
        startActivity(i);
    }
}
