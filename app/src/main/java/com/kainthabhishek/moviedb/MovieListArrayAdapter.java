package com.kainthabhishek.moviedb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by abhishek on 27/3/16.
 */
public class MovieListArrayAdapter extends ArrayAdapter<Movie> {

    Context context;
    ArrayList<Movie> movieList;

    public MovieListArrayAdapter(Context context, ArrayList<Movie> movieList) {
        super(context, 0, movieList);

        this.context = context;
        this.movieList = movieList;
    }

    class ViewHolder{
        TextView movieName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = View.inflate(context,R.layout.movie_list_item_layout,null);

            ViewHolder vh = new ViewHolder();
            vh.movieName = (TextView)convertView.findViewById(R.id.movie_list_item);
            convertView.setTag(vh);
        }

        ViewHolder vh = (ViewHolder)convertView.getTag();
        vh.movieName.setText(movieList.get(position).getTitle());

        return  convertView;
    }
}
