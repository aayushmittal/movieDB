package com.kainthabhishek.moviedb;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * Created by aayush on 27/3/16.
 */
public class SelectorFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.seletor_fragment_layout, container, false);
        FrameLayout topRated = (FrameLayout) v.findViewById(R.id.top_rated);
        FrameLayout nowPlaying = (FrameLayout)v.findViewById(R.id.now_playing);
        FrameLayout popular = (FrameLayout)v.findViewById(R.id.popular);
        final SelectorFragmentClick listener = (SelectorFragmentClick) getActivity();
        topRated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(urlList.toprated);
            }
        });
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(urlList.nowPlaying);
            }
        });
        popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(urlList.popular);
            }
        });
        return v;
    }

    public interface SelectorFragmentClick {
        void onItemClick(String url);
    }
}