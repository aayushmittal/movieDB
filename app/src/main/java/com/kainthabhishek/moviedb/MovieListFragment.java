package com.kainthabhishek.moviedb;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by abhishek on 27/3/16.
 */
public class MovieListFragment extends Fragment {

    MovieListArrayAdapter adapter;
    ArrayList<Movie> movieList;
    String urlString;

    public interface MovieListFragmentInterface{

        void movieListItemClicked(Movie movie,ArrayList<Movie> movieList);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.movie_list_fragment,container,false);
        ListView lv = (ListView)v.findViewById(R.id.movielistView);

        Bundle b = getArguments();
        if(b!=null){
            urlString = b.getString("url_string");

            //fetch data


        }

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                MovieListFragmentInterface listener = (MovieListFragmentInterface)getActivity();
                listener.movieListItemClicked(movieList.get(position),movieList);

            }
        });

        adapter = new MovieListArrayAdapter(getActivity(),movieList);

        lv.setAdapter(adapter);
        return v;
    }


}
